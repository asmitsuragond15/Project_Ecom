<%@page import="com.revature.dao.WishlistDao"%>
<%@page import="com.revature.dao.ProductDao"%>
<%@page import="com.revature.entities.Product"%>
<%@page errorPage="error_exception.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%
    int productId = Integer.parseInt(request.getParameter("pid"));
    ProductDao productDao = new ProductDao(ConnectionProvider.getConnection());
    Product product = (Product) productDao.getProductsByProductId(productId);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>View Product</title>
    <%@include file="Components/common_css_js.jsp"%>
    <style type="text/css">
        .real-price {
            font-size: 26px !important;
            font-weight: 600;
            color: #027a3e;
        }

        .product-price {
            font-size: 18px !important;
            text-decoration: line-through;
            color: #888;
        }

        .product-discount {
            font-size: 16px !important;
            color: #ff5722;
        }

        .availability {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }

        .card {
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            background-color: #fff;
        }

        .btn-lg {
            padding: 10px 20px;
            font-size: 18px;
            border-radius: 5px;
            transition: all 0.3s ease;
        }

        .btn-lg:hover {
            transform: scale(1.05);
        }

        .img-container {
            position: relative;
            text-align: center;
        }

        .img-fluid {
            max-width: 100%;
            max-height: 500px;
            border-radius: 10px;
        }
       .col-md-5
       {
        border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            background-color: #fff;
       } 
       
    </style>
</head>
<body>
    <!--navbar -->
    <%@include file="Components/navbar.jsp"%>

    <div class="container mt-5">
        <%@include file="Components/alert_message.jsp"%>
        <div class="row">
            <div class="col-md-5">
                <div class="img-container">
                    <img src="Product_imgs/<%=product.getProductImages()%>" alt="Product Image" class="img-fluid">
                </div>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <h2 class="mt-3"><%=product.getProductName()%></h2>
                    <p class="text-muted"><b>Description:</b> <%=product.getProductDescription()%></p>
                    <p>
                        <span class="real-price">&#8377;<%=product.getProductPriceAfterDiscount()%></span>
                        <span class="product-price">&#8377;<%=product.getProductPrice()%></span>
                        <span class="product-discount"><%=product.getProductDiscount()%> &#37; off</span>
                    </p>
                    <p>
                        <span class="availability">
                            <% if (product.getProductQunatity() > 0) { %>
                                <i class="fas fa-check-circle text-success"></i> Available
                            <% } else { %>
                                <i class="fas fa-times-circle text-danger"></i> Currently Out of Stock
                            <% } %>
                        </span>
                    </p>
                    <p><b>Category:</b> <%=catDao.getCategoryName(product.getCategoryId())%></p>
                    <form method="post">
                        <div class="mt-4 text-center">
                            <% if (user == null) { %>
                                <button type="button" onclick="window.open('login.jsp', '_self')" class="btn btn-primary text-white btn-lg">
                                    <i class="fas fa-cart-plus"></i> Add to Cart
                                </button>
                                &emsp;
                                <button type="button" onclick="window.open('login.jsp', '_self')" class="btn btn-info text-white btn-lg">
                                    <i class="fas fa-shopping-bag"></i> Buy Now
                                </button>
                            <% } else { %>
                                <button type="submit" formaction="./AddToCartServlet?uid=<%=user.getUserId()%>&pid=<%=product.getProductId()%>" class="btn btn-primary text-white btn-lg">
                                    <i class="fas fa-cart-plus"></i> Add to Cart
                                </button>
                                &emsp;
                                <a href="checkout.jsp" id="buy-btn" class="btn btn-info text-white btn-lg" role="button" aria-disabled="true">
                                    <i class="fas fa-shopping-bag"></i> Buy Now
                                </a>
                            <% } %>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
        $(document).ready(function() {
            if ($('#availability').text().trim() == "Currently Out of stock") {
                $('#availability').css('color', 'red');
                $('.btn').addClass('disabled');
            }
            $('#buy-btn').click(function() {
                <% session.setAttribute("pid", productId); session.setAttribute("from", "buy"); %>
            });
        });
    </script>
</body>
</html>
