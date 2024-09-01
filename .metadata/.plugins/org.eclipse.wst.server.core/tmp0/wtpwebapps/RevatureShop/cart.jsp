<%@page import="com.revature.entities.Message"%>
<%@page import="com.revature.entities.Product"%>
<%@page import="com.revature.dao.ProductDao"%>
<%@page import="com.revature.entities.Cart"%>
<%@page import="com.revature.dao.CartDao"%>
<%@page errorPage="error_exception.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
    User activeUser = (User) session.getAttribute("activeUser");
    if (activeUser == null) {
        Message message = new Message("You are not logged in! Login first!!", "error", "alert-danger");
        session.setAttribute("message", message);
        response.sendRedirect("login.jsp");
        return;  
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Shopping Cart</title>
    <%@include file="Components/common_css_js.jsp"%>
    <style>
        .qty {
            display: inline-block;
            padding: 3px 6px;
            width: 46px;
            height: 32px;
            border-radius: 5px;
            background-color: #fff;
            border: 1px solid #c2c2c2;
            margin: 0 5px;
            text-align: center;
            font-weight: bold;
        }

        .cart-item-img {
            width: 70px;
            height: 70px;
            object-fit: cover;
            border-radius: 5px;
        }

        .table-hover tbody tr:hover {
            background-color: #f2f2f2;
        }

        .btn {
            border-radius: 5px;
            transition: all 0.3s;
        }

        .btn:hover {
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        }

        .btn-light:hover {
            background-color: #027a3e;
            color: #fff;
        }

        .empty-cart-container {
            text-align: center;
            padding: 50px;
            background-color: #f8f9fa;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
        }

        .empty-cart-container img {
            max-width: 300px;
        }

        .empty-cart-container h4 {
            margin-top: 20px;
            font-weight: bold;
            color: #333;
        }

        .empty-cart-container p {
            color: #666;
        }

        .table th, .table td {
            vertical-align: middle;
        }

        .btn-remove {
            background-color: #dc3545;
            color: #fff;
            border: none;
            transition: background-color 0.3s ease;
        }

        .btn-remove:hover {
            background-color: #c82333;
        }

        .btn-primary, .btn-outline-primary {
            transition: background-color 0.3s ease;
        }

        .btn-outline-primary:hover {
            background-color: #027a3e;
            color: #fff;
        }

        .total-amount {
            font-size: 22px;
            font-weight: bold;
        }

        .cart-buttons .btn {
            margin: 5px 0;
        }

        @media (max-width: 768px) {
            .table-responsive {
                overflow-x: auto;
            }
        }
    </style>
</head>
<body>
    <!--navbar -->
    <%@include file="Components/navbar.jsp"%>

    <%
        float totalPrice = 0;
        CartDao cartDao = new CartDao(ConnectionProvider.getConnection());
        List<Cart> listOfCart = cartDao.getCartListByUserId(user.getUserId());
        if (listOfCart == null || listOfCart.size() == 0) {
    %>
    <div class="container empty-cart-container mt-5">
        <img src="Images/empty-cart.png" class="img-fluid">
        <h4>Your cart is empty!</h4>
        <p>Add items to it now.</p>
        <a href="products.jsp" class="btn btn-primary btn-lg" role="button" aria-disabled="true">Shop Now</a>
    </div>
    <%
        } else {
    %>

    <div class="container mt-5">
        <%@include file="Components/alert_message.jsp"%>
        <div class="card shadow-sm px-3 py-3">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr class="table-primary text-center" style="font-size: 18px;">
                            <th>Item</th>
                            <th>Item Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total Price</th>
                            <th>Remove</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ProductDao productDao = new ProductDao(ConnectionProvider.getConnection());
                            for (Cart c : listOfCart) {
                                Product prod = productDao.getProductsByProductId(c.getProductId());                        
                        %>
                        <tr class="text-center">
                            <td><img src="Product_imgs/<%=prod.getProductImages()%>" class="cart-item-img"></td>
                            <td class="text-start"><%=prod.getProductName()%></td>
                            <td>&#8377;<%=prod.getProductPriceAfterDiscount()%></td>
                            <td>
                                <div class="d-flex justify-content-center align-items-center">
                                    <a href="CartOperationServlet?cid=<%=c.getCartId()%>&opt=1" role="button" class="btn btn-light btn-sm">
                                        <i class="fa-regular fa-plus"></i>
                                    </a>
                                    <div class="qty"><%=c.getQuantity()%></div>
                                    <% if(c.getQuantity() > 1) { %>
                                    <a href="CartOperationServlet?cid=<%=c.getCartId()%>&opt=2" role="button" class="btn btn-light btn-sm">
                                        <i class="fa-solid fa-minus"></i>
                                    </a>
                                    <% } else { %>
                                    <a href="#" role="button" class="btn btn-light btn-sm disabled">
                                        <i class="fa-solid fa-minus"></i>
                                    </a>
                                    <% } %>
                                </div>
                            </td>
                            <td>&#8377;<%=c.getQuantity() * prod.getProductPriceAfterDiscount()%></td>
                            <td><a href="CartOperationServlet?cid=<%=c.getCartId()%>&opt=3" class="btn btn-remove btn-sm" role="button">Remove</a></td>
                        </tr>
                        <%
                            totalPrice += c.getQuantity() * prod.getProductPriceAfterDiscount();
                            }
                        %>
                        <tr>
                            <td class="text-end total-amount" colspan="6">Total Amount: &#8377;<%=totalPrice%></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="cart-buttons text-end">
                <a href="products.jsp" class="btn btn-outline-primary" role="button">Continue Shopping</a>
                <a href="checkout.jsp" id="checkout-btn" class="btn btn-primary" role="button">Checkout</a>
            </div>
        </div>
    </div>
    <%
        }
    %>

    <script>
        $(document).ready(function(){
            $('#checkout-btn').click(function(){
            <%
                session.setAttribute("totalPrice", totalPrice);
                session.setAttribute("from", "cart");
            %>    
            });
        });
    </script>
</body>
</html>
