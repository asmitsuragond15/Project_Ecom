<%@page import="com.revature.dao.AdminDao"%>
<%@page errorPage="error_exception.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Seller</title>
<%@include file="Components/common_css_js.jsp"%>
<style>
label {
	font-weight: bold;
}
</style>
</head>
<body>
	<!--navbar -->
	<%@include file="Components/navbar.jsp"%>


						
						
						
						
						
	<div class="container-fluid">
		<div class="row mt-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-header px-5">
						<div class="container text-center">
							<img src="Images/customerli.png" style="max-width: 100px;"
								class="img-fluid">
						</div>
						
						<h3 class="text-center">Register Seller</h3>
						<%@include file="Components/alert_message.jsp"%>

						<!--admin-form-->
						<form action="AdminServlet?operation=save" method="post">
							<div class="mb-3">
								<label class="form-label">Name</label> <input type="text"
									name="name" placeholder="Enter name" class="form-control"
									required>
							</div>
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="email"
									name="email" placeholder="Email address" class="form-control"
									required>
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input
									type="password" name="password" placeholder="Enter password"
									class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Phone</label> <input type="number"
									name="phone" placeholder="Enter phone number"
									class="form-control" required>
							</div>
							<div class="d-grid gap-2 col-6 mx-auto py-3">
								<button type="submit" class="btn btn-primary me-3">Register</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		
		</div>
	</div>
</body>
</html>