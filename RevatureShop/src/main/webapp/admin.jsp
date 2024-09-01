<%@page import="com.revature.entities.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_exception.jsp"%>
<%
Admin activeAdmin = (Admin) session.getAttribute("activeAdmin");
if (activeAdmin == null) {
    Message message = new Message("You are not logged in! Login first!!", "error", "alert-danger");
    session.setAttribute("message", message);
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <%@include file="Components/common_css_js.jsp"%>
    <style>
        body {
            background-color: #f4f7f8;
        }
        .container-fluid {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .card {
            border: none;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .card-body {
            padding: 2rem;
        }
        .card img {
            width: 60px;
            height: 60px;
            object-fit: contain;
        }
        .card-title {
            font-size: 1.25rem;
            margin-top: 1rem;
            color: #333;
        }
        .modal-header {
            background-color: #f8f9fa;
        }
        .modal-title {
            color: #333;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }
    </style>
</head>
<body>
    <!--navbar -->
    <%@include file="Components/navbar.jsp"%>

    <!--admin dashboard -->
    <div class="container-fluid py-4 px-3">
        <%@include file="Components/alert_message.jsp"%>
        <div class="row text-center mb-4">
            <div class="col">
                <img src="Images/admin.png" style="max-width: 150px;" class="img-fluid rounded-circle border">
                <h3 class="mt-3">Welcome, <%=activeAdmin.getName()%></h3>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <a href="display_category.jsp">
                    <div class="card text-bg-light mb-3 text-center">
                        <div class="card-body">
                            <img src="Images/cat.png" class="img-fluid" alt="Category">
                            <h4 class="card-title mt-3">Categories</h4>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-md-4">
                <a href="display_products.jsp">
                    <div class="card text-bg-light mb-3 text-center">
                        <div class="card-body">
                            <img src="Images/Productsi.png" class="img-fluid" alt="Products">
                            <h4 class="card-title mt-3">Products</h4>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-md-4">
                <a href="display_orders.jsp">
                    <div class="card text-bg-light mb-3 text-center">
                        <div class="card-body">
                            <img src="Images/orderi.png" class="img-fluid" alt="Orders">
                            <h4 class="card-title mt-3">Orders</h4>
                        </div>
                    </div>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 offset-md-2">
                <a href="display_users.jsp">
                    <div class="card text-bg-light mb-3 text-center">
                        <div class="card-body">
                            <img src="Images/useri.png" class="img-fluid" alt="Users">
                            <h4 class="card-title mt-3">Users</h4>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-md-4">
                <a href="display_admin.jsp">
                    <div class="card text-bg-light mb-3 text-center">
                        <div class="card-body">
                            <img src="Images/selleri.png" class="img-fluid" alt="Sellers">
                            <h4 class="card-title mt-3">Sellers</h4>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </div>
    <!--end-->

    <!-- add category modal-->
    <div class="modal fade" id="add-category" tabindex="-1" aria-labelledby="addCategoryModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="addCategoryModalLabel">Add Category</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <form action="AddOperationServlet" method="post" enctype="multipart/form-data">
                    <div class="modal-body">
                        <input type="hidden" name="operation" value="addCategory">
                        <div class="mb-3">
                            <label class="form-label"><b>Category Name</b></label>
                            <input type="text" name="category_name" placeholder="Enter category here" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label for="formFile" class="form-label"><b>Category Image</b></label>
                            <input class="form-control" type="file" name="category_img" id="formFile">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Add Category</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- end of modal -->

    <!-- add product modal-->
    <div class="modal fade" id="add-product" tabindex="-1" aria-labelledby="addProductModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="addProductModalLabel">Add Product</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <form action="AddOperationServlet" method="post" name="addProductForm" enctype="multipart/form-data">
                    <div class="modal-body">
                        <input type="hidden" name="operation" value="addProduct">
                        <div class="mb-3">
                            <label class="form-label"><b>Product Name</b></label>
                            <input type="text" name="name" placeholder="Enter product name" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label"><b>Product Description</b></label>
                            <textarea class="form-control" name="description" rows="4" placeholder="Enter product description"></textarea>
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label class="form-label"><b>Unit Price</b></label>
                                <input type="number" name="price" placeholder="Enter price" class="form-control" required>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label class="form-label"><b>Discount Percentage</b></label>
                                <input type="number" name="discount" onblur="validate()" placeholder="Enter discount if any" class="form-control">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <label class="form-label"><b>Product Quantity</b></label>
                                <input type="number" name="quantity" placeholder="Enter product quantity" class="form-control">
                            </div>
                            <div class="col-md-6 mb-3">
                                <label class="form-label"><b>Select Category</b></label>
                                <select name="categoryType" class="form-control">
                                    <option value="0">--Select Category--</option>
                                    <%
                                    for (Category c : categoryList) {
                                    %>
                                    <option value="<%=c.getCategoryId()%>"><%=c.getCategoryName()%></option>
                                    <%
                                    }
                                    %>
                                </select>
                            </div>
                        </div>
                        <div class="mb-3">
                            <label class="form-label"><b>Product Image</b></label>
                            <input type="file" name="photo" class="form-control" required>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Add Product</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- end of modal -->

    <script type="text/javascript">
        function validate() {
            var dis = document.addProductForm.discount.value;
            if (dis > 100 || dis < 0) {
                alert("Discount needs to be between 0-100!");
                return false;
            }
        }
    </script>
</body>
</html>
