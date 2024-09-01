/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-08-31 19:34:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.revature.entities.Admin;
import com.revature.entities.Cart;
import com.revature.dao.CartDao;
import com.revature.entities.User;
import java.util.List;
import com.revature.entities.Category;
import com.revature.helper.ConnectionProvider;
import com.revature.dao.CategoryDao;
import com.revature.entities.Message;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Components/alert_message.jsp", Long.valueOf(1724998760584L));
    _jspx_dependants.put("/Components/navbar.jsp", Long.valueOf(1725132431465L));
    _jspx_dependants.put("/Components/common_css_js.jsp", Long.valueOf(1724868596744L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(9);
    _jspx_imports_classes.add("com.revature.entities.Message");
    _jspx_imports_classes.add("com.revature.entities.Admin");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.revature.entities.Cart");
    _jspx_imports_classes.add("com.revature.entities.Category");
    _jspx_imports_classes.add("com.revature.dao.CategoryDao");
    _jspx_imports_classes.add("com.revature.dao.CartDao");
    _jspx_imports_classes.add("com.revature.entities.User");
    _jspx_imports_classes.add("com.revature.helper.ConnectionProvider");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Registration</title>\r\n");
      out.write("<!--CSS-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\r\n");
      out.write("<!--font awesome-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--JavaScript-->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"JS/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--jQuery-->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\" integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!--sweet alert-->\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("label {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!--navbar -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User user = (User) session.getAttribute("activeUser");
Admin admin = (Admin) session.getAttribute("activeAdmin");

CategoryDao catDao = new CategoryDao(ConnectionProvider.getConnection());
List<Category> categoryList = catDao.getAllCategories();
int cartCount = 0;

if (user != null) {
    CartDao cartDao = new CartDao(ConnectionProvider.getConnection());
    cartCount = cartDao.getCartCountByUserId(user.getUserId());
}

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .navbar {\r\n");
      out.write("        font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("    .nav-link {\r\n");
      out.write("        color: #ffffff !important;\r\n");
      out.write("        font-size: 1rem;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar-brand {\r\n");
      out.write("        font-size: 1.25rem;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("    .dropdown-menu {\r\n");
      out.write("        background-color: #343a40 !important;\r\n");
      out.write("        border: none;\r\n");
      out.write("    }\r\n");
      out.write("    .dropdown-menu li a {\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("    }\r\n");
      out.write("    .dropdown-menu li a:hover {\r\n");
      out.write("        background-color: #495057 !important;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-outline-light {\r\n");
      out.write("        border-color: #ffffff;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("    }\r\n");
      out.write("    .btn-outline-light:hover {\r\n");
      out.write("        background-color: #ffffff;\r\n");
      out.write("        color: #343a40;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar-toggler-icon {\r\n");
      out.write("        background-image: url('data:image/svg+xml;charset=utf8,<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-menu\" viewBox=\"0 0 24 24\"><path d=\"M3 12h18M3 6h18M3 18h18\"/></svg>');\r\n");
      out.write("    }\r\n");
      out.write("    input\r\n");
      out.write("    {\r\n");
      out.write("    background-colour:white;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("            <i class=\"fa-sharp fa-solid fa-house\"></i>&ensp;RevatureShop\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            ");
 if (admin != null) { 
      out.write("\r\n");
      out.write("                <!-- Admin Nav Bar -->\r\n");
      out.write("                <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-light\" data-bs-toggle=\"modal\" data-bs-target=\"#add-category\">\r\n");
      out.write("                            <i class=\"fa-solid fa-plus fa-xs\"></i>&nbsp;Add Category\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-light\" data-bs-toggle=\"modal\" data-bs-target=\"#add-product\">\r\n");
      out.write("                            <i class=\"fa-solid fa-plus fa-xs\"></i>&nbsp;Add Product\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"admin.jsp\">");
      out.print(admin.getName());
      out.write("</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"LogoutServlet?user=admin\">\r\n");
      out.write("                            <i class=\"fa-solid fa-user-slash\"></i>&nbsp;Logout\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("                <!-- Guest/All Users Nav Bar -->\r\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            Category\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"products.jsp?category=0\">All Products</a></li>\r\n");
      out.write("                            ");
 for (Category c : categoryList) { 
      out.write("\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"products.jsp?category=");
      out.print(c.getCategoryId());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form class=\"d-flex pe-5\" role=\"search\" action=\"products.jsp\" method=\"get\">\r\n");
      out.write("                    <input name=\"search\" class=\"form-control me-2\" type=\"search\" placeholder=\"Search for products\" aria-label=\"Search\">\r\n");
      out.write("                    <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                ");
 if (user != null) { 
      out.write("\r\n");
      out.write("                    <!-- Logged-in User Nav Bar -->\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item pe-3\">\r\n");
      out.write("                            <a class=\"nav-link position-relative\" href=\"cart.jsp\">\r\n");
      out.write("                                <i class=\"fa-solid fa-cart-shopping\"></i>&nbsp;Cart\r\n");
      out.write("                                <span class=\"position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger\">");
      out.print(cartCount);
      out.write("</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item pe-3\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"profile.jsp\">");
      out.print(user.getUserName());
      out.write("</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item pe-3\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"LogoutServlet?user=user\">\r\n");
      out.write("                                <i class=\"fa-solid fa-user-slash\"></i>&nbsp;Logout\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                    <!-- Guest Nav Bar -->\r\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                Register\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"register.jsp\">\r\n");
      out.write("                                    <i class=\"fa-solid fa-user-plus\"></i> Register Customer\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"seller.jsp\">\r\n");
      out.write("                                    <i class=\"fa-solid fa-user-plus\"></i> Register Seller\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                Login\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"login.jsp\">\r\n");
      out.write("                                    <i class=\"fa-solid fa-user-lock\"></i> Login Customer\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"sellerlogin.jsp\">\r\n");
      out.write("                                    <i class=\"fa-solid fa-user-lock\"></i> Login Seller\r\n");
      out.write("                                </a></li>\r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"admin.jsp\">Admin</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link\" href=\"about.jsp\">About</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid mt-4\">\r\n");
      out.write("		<div class=\"row g-0\">\r\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body px-5\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"container text-center\">\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("						<h3 class=\"text-center\">Create Account</h3>\r\n");
      out.write("						");
      out.write('\r');
      out.write('\n');

Message messg = (Message) session.getAttribute("message");
if (messg != null) {

      out.write("\r\n");
      out.write("<div class=\"alert ");
      out.print(messg.getCssClass());
      out.write("\" role=\"alert\" id=\"alert\">\r\n");
      out.write("	");
      out.print(messg.getMessage());
      out.write("\r\n");
      out.write("</div>\r\n");

session.removeAttribute("message");
}

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	setTimeout(function() {\r\n");
      out.write("		$('#alert').alert('close');\r\n");
      out.write("	}, 3000);\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<!--registration-form-->\r\n");
      out.write("						<form id=\"register-form\" action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">Your name</label> <input type=\"text\"\r\n");
      out.write("										name=\"user_name\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"First and last name\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">Email</label> <input type=\"email\"\r\n");
      out.write("										name=\"user_email\" placeholder=\"Email address\"\r\n");
      out.write("										class=\"form-control\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">Mobile number</label> <input\r\n");
      out.write("										type=\"number\" name=\"user_mobile_no\"\r\n");
      out.write("										placeholder=\"Mobile number\" class=\"form-control\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mt-5\">\r\n");
      out.write("									<label class=\"form-label pe-3\">Gender</label> <input\r\n");
      out.write("										class=\"form-check-input\" type=\"radio\" name=\"gender\"\r\n");
      out.write("										value=\"Male\"> <span class=\"form-check-label pe-3 ps-1\">\r\n");
      out.write("										Male </span> <input class=\"form-check-input\" type=\"radio\"\r\n");
      out.write("										name=\"gender\" value=\"Female\"> <span\r\n");
      out.write("										class=\"form-check-label ps-1\"> Female </span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-2\">\r\n");
      out.write("								<label class=\"form-label\">Address</label> <input type=\"text\"\r\n");
      out.write("									name=\"user_address\"\r\n");
      out.write("									placeholder=\"Enter Address(Area and Street))\"\r\n");
      out.write("									class=\"form-control\" required>\r\n");
      out.write("							</div>  \r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">City</label> <input\r\n");
      out.write("										class=\"form-control\" type=\"text\" name=\"city\"\r\n");
      out.write("										placeholder=\"City/District/Town\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">Pincode</label> <input\r\n");
      out.write("										class=\"form-control\" type=\"number\" name=\"pincode\"\r\n");
      out.write("										placeholder=\"Pincode\" maxlength=\"6\" required>\r\n");
      out.write("								</div>  \r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">State</label> <select name=\"state\"\r\n");
      out.write("										class=\"form-select\">\r\n");
      out.write("										<option selected>--Select State--</option>\r\n");
      out.write("										<option value=\"Andaman &amp; Nicobar Islands\">Andaman\r\n");
      out.write("											&amp; Nicobar Islands</option>\r\n");
      out.write("										<option value=\"Andhra Pradesh\">Andhra Pradesh</option>\r\n");
      out.write("										<option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\r\n");
      out.write("										<option value=\"Assam\">Assam</option>\r\n");
      out.write("										<option value=\"Bihar\">Bihar</option>\r\n");
      out.write("										<option value=\"Chandigarh\">Chandigarh</option>\r\n");
      out.write("										<option value=\"Chhattisgarh\">Chhattisgarh</option>\r\n");
      out.write("										<option value=\"Dadra &amp; Nagar Haveli &amp; Daman &amp; Diu\">Dadra\r\n");
      out.write("											&amp; Nagar Haveli &amp; Daman &amp; Diu</option>\r\n");
      out.write("										<option value=\"Delhi\">Delhi</option>\r\n");
      out.write("										<option value=\"Goa\">Goa</option>\r\n");
      out.write("										<option value=\"Gujarat\">Gujarat</option>\r\n");
      out.write("										<option value=\"Haryana\">Haryana</option>\r\n");
      out.write("										<option value=\"Himachal Pradesh\">Himachal Pradesh</option>\r\n");
      out.write("										<option value=\"Jammu &amp; Kashmir\">Jammu &amp;\r\n");
      out.write("											Kashmir</option> \r\n");
      out.write("										<option value=\"Jharkhand\">Jharkhand</option>\r\n");
      out.write("										<option value=\"Karnataka\">Karnataka</option>\r\n");
      out.write("										<option value=\"Kerala\">Kerala</option>\r\n");
      out.write("										<option value=\"Ladakh\">Ladakh</option>\r\n");
      out.write("										<option value=\"Lakshadweep\">Lakshadweep</option>\r\n");
      out.write("										<option value=\"Madhya Pradesh\">Madhya Pradesh</option>\r\n");
      out.write("										<option value=\"Maharashtra\">Maharashtra</option>\r\n");
      out.write("										<option value=\"Manipur\">Manipur</option>\r\n");
      out.write("										<option value=\"Meghalaya\">Meghalaya</option>\r\n");
      out.write("										<option value=\"Mizoram\">Mizoram</option>\r\n");
      out.write("										<option value=\"Nagaland\">Nagaland</option>\r\n");
      out.write("										<option value=\"Odisha\">Odisha</option>\r\n");
      out.write("										<option value=\"Puducherry\">Puducherry</option>\r\n");
      out.write("										<option value=\"Punjab\">Punjab</option>\r\n");
      out.write("										<option value=\"Rajasthan\">Rajasthan</option>\r\n");
      out.write("										<option value=\"Sikkim\">Sikkim</option>\r\n");
      out.write("										<option value=\"Tamil Nadu\">Tamil Nadu</option>\r\n");
      out.write("										<option value=\"Telangana\">Telangana</option>\r\n");
      out.write("										<option value=\"Tripura\">Tripura</option>\r\n");
      out.write("										<option value=\"Uttarakhand\">Uttarakhand</option>\r\n");
      out.write("										<option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("										<option value=\"West Bengal\">West Bengal</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mt-2\">\r\n");
      out.write("									<label class=\"form-label\">Password</label> <input\r\n");
      out.write("										type=\"password\" name=\"user_password\"\r\n");
      out.write("										placeholder=\"Enter Password\" class=\"form-control\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div id=\"submit-btn\" class=\"container text-center mt-4\">\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-outline-primary me-3\">Submit</button>\r\n");
      out.write("								<button type=\"reset\" class=\"btn btn-outline-primary\">Reset</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mt-3 text-center\">\r\n");
      out.write("								<h6>\r\n");
      out.write("									Already have an account?<a href=\"login.jsp\"\r\n");
      out.write("										style=\"text-decoration: none\"> Sign in</a>\r\n");
      out.write("								</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
