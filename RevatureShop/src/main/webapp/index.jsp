<%@page import="com.revature.dao.ProductDao"%>
<%@page import="com.revature.entities.Product"%>
<%@page import="com.revature.helper.ConnectionProvider"%>
<%@page errorPage="error_exception.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
    ProductDao productDao = new ProductDao(ConnectionProvider.getConnection());
    List<Product> productList = productDao.getAllLatestProducts();
    List<Product> topDeals = productDao.getDiscountedProducts();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Home</title>
    <%@include file="Components/common_css_js.jsp"%>
    <style type="text/css">
        .cus-card {
            border-radius: 15px;
            border: none;
            overflow: hidden;
            transition: transform 0.3s, box-shadow 0.3s;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        .cus-card:hover {
            transform: translateY(-10px);
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }

        .real-price {
            font-size: 20px;
            font-weight: 600;
            color: #027a3e;
        }

        .product-price {
            font-size: 17px;
            text-decoration: line-through;
            color: #999;
        }

        .product-discount {
            font-size: 15px;
            color: #ff5722;
        }

        .carousel-caption {
            background-color: rgba(0, 0, 0, 0.5);
            padding: 20px;
            border-radius: 10px;
        }

        .carousel-control-prev-icon,
        .carousel-control-next-icon {
            filter: invert(1);
        }

        .btn-custom {
            background-color: #027a3e;
            color: white;
            border-radius: 30px;
            padding: 10px 20px;
            transition: background-color 0.3s ease;
        }

        .btn-custom:hover {
            background-color: #025f2d;
        }

        .product-card-body {
            padding: 15px;
        }

        .product-card-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .badge-discount {
            background-color: #ff5722;
            color: white;
            padding: 5px 10px;
            border-radius: 20px;
            font-size: 12px;
            position: absolute;
            top: 10px;
            left: 10px;
        }

        .carousel img {
            object-fit: cover;
            height: 400px;
        }

        .product-image-container {
            width: 100%;
            height: 200px; /* Fixed height for all images */
            display: flex;
            align-items: center;
            justify-content: center;
            overflow: hidden;
            position: relative;
        }

        .product-image-container img {
            max-height: 100%;
            max-width: 100%;
        }

        @media (max-width: 768px) {
            .carousel img {
                height: 200px;
            }
        }
    </style>
</head>
<body>
    <!--navbar -->
    <%@include file="Components/navbar.jsp"%>

    <!-- Carousel -->
    <div id="carouselAutoplaying" class="carousel slide carousel-dark mt-3 mb-3" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="Images/image1.jpg" class="d-block w-100" alt="...">
                
            </div>
            <div class="carousel-item">
                <img src="Images/image2.jpg" class="d-block w-100" alt="...">
                
            </div>
            <div class="carousel-item">
                <img src="Images/image3.jpg" class="d-block w-100" alt="...">
                
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselAutoplaying" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselAutoplaying" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
    <!-- end of carousel -->

    <!-- Latest Products -->
    <div class="container-fluid py-5" style="background: #f5f5f5;">
        <h3 class="mb-4">Latest Products</h3>
        <div class="row row-cols-1 row-cols-md-4 g-4">
            <% for (int i = 0; i < Math.min(10, productList.size()); i++) { %>
                <div class="col">
                    <a href="viewProduct.jsp?pid=<%=productList.get(i).getProductId()%>" style="text-decoration: none;">
                        <div class="card cus-card position-relative">
                            <% if(productList.get(i).getProductDiscount() > 0) { %>
                                <span class="badge-discount"><%=productList.get(i).getProductDiscount()%>% OFF</span>
                            <% } %>
                            <div class="product-image-container">
                                <img src="Product_imgs/<%=productList.get(i).getProductImages()%>" alt="<%=productList.get(i).getProductName()%>">
                            </div>
                            <div class="product-card-body text-center">
                                <h5 class="product-card-title"><%=productList.get(i).getProductName()%></h5>
                                <p class="mb-1">
                                    <span class="real-price">&#8377;<%=productList.get(i).getProductPriceAfterDiscount()%></span>
                                    &ensp;
                                    <span class="product-price">&#8377;<%=productList.get(i).getProductPrice()%></span>
                                </p>
                                <a href="viewProduct.jsp?pid=<%=productList.get(i).getProductId()%>" class="btn btn-custom mt-2">View Product</a>
                            </div>
                        </div>
                    </a>
                </div>
            <% } %>
        </div>
    </div>
    <!-- end of latest products -->

    <!-- Confirmation Message for Successful Order -->
    <%
        String order = (String) session.getAttribute("order");
        if (order != null) {
    %>
        <script type="text/javascript">
            Swal.fire({
                icon: 'success',
                title: 'Order Placed, Thank you!',
                text: 'Confirmation will be sent to <%=user.getUserEmail()%>',
                width: 600,
                padding: '3em',
                showConfirmButton: false,
                timer: 3500,
                backdrop: `rgba(0,0,123,0.4)`
            });
        </script>
    <%
        }
        session.removeAttribute("order");
    %>
    <!-- end of message -->
</body>
</html>
