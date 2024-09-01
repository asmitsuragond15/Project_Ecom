<%@page import="com.revature.entities.Admin"%>
<%@page import="com.revature.entities.Cart"%>
<%@page import="com.revature.dao.CartDao"%>
<%@page import="com.revature.entities.User"%>
<%@page import="java.util.List"%>
<%@page import="com.revature.entities.Category"%>
<%@page import="com.revature.helper.ConnectionProvider"%>
<%@page import="com.revature.dao.CategoryDao"%>
<%
User user = (User) session.getAttribute("activeUser");
Admin admin = (Admin) session.getAttribute("activeAdmin");

CategoryDao catDao = new CategoryDao(ConnectionProvider.getConnection());
List<Category> categoryList = catDao.getAllCategories();
int cartCount = 0;

if (user != null) {
    CartDao cartDao = new CartDao(ConnectionProvider.getConnection());
    cartCount = cartDao.getCartCountByUserId(user.getUserId());
}
%>
<style>
    .navbar {
        font-weight: 500;
    }
    .nav-link {
        color: #ffffff !important;
        font-size: 1rem;
    }
    .navbar-brand {
        font-size: 1.25rem;
        font-weight: bold;
    }
    .dropdown-menu {
        background-color: #343a40 !important;
        border: none;
    }
    .dropdown-menu li a {
        color: #ffffff;
    }
    .dropdown-menu li a:hover {
        background-color: #495057 !important;
        color: #ffffff;
    }
    .btn-outline-light {
        border-color: #ffffff;
        color: #ffffff;
    }
    .btn-outline-light:hover {
        background-color: #ffffff;
        color: #343a40;
    }
    .navbar-toggler-icon {
        background-image: url('data:image/svg+xml;charset=utf8,<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-menu" viewBox="0 0 24 24"><path d="M3 12h18M3 6h18M3 18h18"/></svg>');
    }
    input
    {
    background-colour:white;
    }
</style>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">
            <i class="fa-sharp fa-solid fa-house"></i>&ensp;RevatureShop
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <% if (admin != null) { %>
                <!-- Admin Nav Bar -->
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <button type="button" class="btn btn-outline-light" data-bs-toggle="modal" data-bs-target="#add-category">
                            <i class="fa-solid fa-plus fa-xs"></i>&nbsp;Add Category
                        </button>
                    </li>
                    <li class="nav-item">
                        <button type="button" class="btn btn-outline-light" data-bs-toggle="modal" data-bs-target="#add-product">
                            <i class="fa-solid fa-plus fa-xs"></i>&nbsp;Add Product
                        </button>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="admin.jsp"><%=admin.getName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet?user=admin">
                            <i class="fa-solid fa-user-slash"></i>&nbsp;Logout
                        </a>
                    </li>
                </ul>
            <% } else { %>
                <!-- Guest/All Users Nav Bar -->
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Category
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="products.jsp?category=0">All Products</a></li>
                            <% for (Category c : categoryList) { %>
                                <li><a class="dropdown-item" href="products.jsp?category=<%=c.getCategoryId()%>"><%=c.getCategoryName()%></a></li>
                            <% } %>
                        </ul>
                    </li>
                </ul>
                <form class="d-flex pe-5" role="search" action="products.jsp" method="get">
                    <input name="search" class="form-control me-2" type="search" placeholder="Search for products" aria-label="Search">
                    <button class="btn btn-outline-light" type="submit">Search</button>
                </form>
                <% if (user != null) { %>
                    <!-- Logged-in User Nav Bar -->
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item pe-3">
                            <a class="nav-link position-relative" href="cart.jsp">
                                <i class="fa-solid fa-cart-shopping"></i>&nbsp;Cart
                                <span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger"><%=cartCount%></span>
                            </a>
                        </li>
                        <li class="nav-item pe-3">
                            <a class="nav-link" href="profile.jsp"><%=user.getUserName()%></a>
                        </li>
                        <li class="nav-item pe-3">
                            <a class="nav-link" href="LogoutServlet?user=user">
                                <i class="fa-solid fa-user-slash"></i>&nbsp;Logout
                            </a>
                        </li>
                    </ul>
                <% } else { %>
                    <!-- Guest Nav Bar -->
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Register
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="register.jsp">
                                    <i class="fa-solid fa-user-plus"></i> Register Customer
                                </a></li>
                                <li><a class="dropdown-item" href="seller.jsp">
                                    <i class="fa-solid fa-user-plus"></i> Register Seller
                                </a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Login
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="login.jsp">
                                    <i class="fa-solid fa-user-lock"></i> Login Customer
                                </a></li>
                                <li><a class="dropdown-item" href="sellerlogin.jsp">
                                    <i class="fa-solid fa-user-lock"></i> Login Seller
                                </a></li>
                                
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="admin.jsp">Admin</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="about.jsp">About</a>
                        </li>
                    </ul>
                <% } %>
            <% } %>
        </div>
    </div>
</nav>
