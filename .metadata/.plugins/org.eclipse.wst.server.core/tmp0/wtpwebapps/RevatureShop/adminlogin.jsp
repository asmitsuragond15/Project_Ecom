<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<%@include file="Components/common_css_js.jsp"%>
<style>
label {
	font-weight: bold;
}

/* From Uiverse.io by kleenpulse */ 
.btn {
  --border-color: linear-gradient(-45deg, #ffae00, #7e03aa, #00fffb);
  --border-width: 0.125em;
  --curve-size: 0.5em;
  --blur: 30px;
  --bg: #080312;
  --color: #afffff;
  color: var(--color);
  cursor: pointer;
  /* use position: relative; so that BG is only for .btn */
  position: relative;
  isolation: isolate;
  display: inline-grid;
  place-content: center;
  padding: 0.5em 1.5em;
  font-size: 17px;
  border: 0;
  text-transform: uppercase;
  box-shadow: 10px 10px 20px rgba(0, 0, 0, 0.6);
  clip-path: polygon(
    /* Top-left */ 0% var(--curve-size),
    var(--curve-size) 0,
    /* top-right */ 100% 0,
    100% calc(100% - var(--curve-size)),
    /* bottom-right 1 */ calc(100% - var(--curve-size)) 100%,
    /* bottom-right 2 */ 0 100%
  );
  transition: color 250ms;
}

.btn::after,
.btn::before {
  content: "";
  position: absolute;
  inset: 0;
}

.btn::before {
  background: var(--border-color);
  background-size: 300% 300%;
  animation: move-bg7234 5s ease infinite;
  z-index: -2;
}

@keyframes move-bg7234 {
  0% {
    background-position: 31% 0%;
  }

  50% {
    background-position: 70% 100%;
  }

  100% {
    background-position: 31% 0%;
  }
}

.btn::after {
  background: var(--bg);
  z-index: -1;
  clip-path: polygon(
    /* Top-left */ var(--border-width)
      calc(var(--curve-size) + var(--border-width) * 0.5),
    calc(var(--curve-size) + var(--border-width) * 0.5) var(--border-width),
    /* top-right */ calc(100% - var(--border-width)) var(--border-width),
    calc(100% - var(--border-width))
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5)),
    /* bottom-right 1 */
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5))
      calc(100% - var(--border-width)),
    /* bottom-right 2 */ var(--border-width) calc(100% - var(--border-width))
  );
  transition: clip-path 500ms;
}

.btn:where(:hover, :focus)::after {
  clip-path: polygon(
    /* Top-left */ calc(100% - var(--border-width))
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5)),
    calc(100% - var(--border-width)) var(--border-width),
    /* top-right */ calc(100% - var(--border-width)) var(--border-width),
    calc(100% - var(--border-width))
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5)),
    /* bottom-right 1 */
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5))
      calc(100% - var(--border-width)),
    /* bottom-right 2 */
      calc(100% - calc(var(--curve-size) + var(--border-width) * 0.5))
      calc(100% - var(--border-width))
  );
  transition: 200ms;
}

.btn:where(:hover, :focus) {
  color: #fff;
}

.form-control{
  color: white;
  border: 2px solid #8707ff;
  border-radius: 10px;
  padding: 10px 25px;
  background: transparent;
  max-width: 100%;
}

.form-control:active {
  box-shadow: 2px 2px 15px #8707ff inset;
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
							<img src="Images/admin.png" style="max-width: 100px;"
								class="img-fluid">
						</div>
						<h3 class="text-center">Admin Login</h3>
						<%@include file="Components/alert_message.jsp"%>
					</div>
					<div class="card-body px-5">
						<!--login-form-->
						<form id="login-form" action="LoginServlet" method="post">
							<input type="hidden" name="login" value="admin"> 
							
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="email"
									name="email" placeholder="Email address" class="form-control"
									required>
							</div>
							<div class="mb-2">
								<label class="form-label">Password</label> <input
									type="password" name="password"
									placeholder="Enter your password" class="form-control" required>
							</div>

							<div id="login-btn" class="container text-center mt-5">
								<button type="submit" class="btn btn-outline-primary me-3">Login</button>
							</div>
						</form>
					</div>  
				</div>
			</div>
		</div>
	</div>

</body>
</html>