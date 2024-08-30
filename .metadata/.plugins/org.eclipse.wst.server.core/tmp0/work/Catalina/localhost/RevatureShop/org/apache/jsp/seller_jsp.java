/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-08-30 10:13:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.revature.dao.AdminDao;
import com.revature.entities.Admin;
import com.revature.entities.Cart;
import com.revature.dao.CartDao;
import com.revature.entities.User;
import java.util.List;
import com.revature.entities.Category;
import com.revature.helper.ConnectionProvider;
import com.revature.dao.CategoryDao;
import com.revature.entities.Message;

public final class seller_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Components/alert_message.jsp", Long.valueOf(1724998760584L));
    _jspx_dependants.put("/Components/navbar.jsp", Long.valueOf(1725012583736L));
    _jspx_dependants.put("/Components/common_css_js.jsp", Long.valueOf(1724868596744L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("com.revature.entities.Message");
    _jspx_imports_classes.add("com.revature.entities.Admin");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.revature.entities.Cart");
    _jspx_imports_classes.add("com.revature.entities.Category");
    _jspx_imports_classes.add("com.revature.dao.CategoryDao");
    _jspx_imports_classes.add("com.revature.dao.CartDao");
    _jspx_imports_classes.add("com.revature.entities.User");
    _jspx_imports_classes.add("com.revature.helper.ConnectionProvider");
    _jspx_imports_classes.add("com.revature.dao.AdminDao");
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
      			"error_exception.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Register Seller</title>\r\n");
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

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".navbar {\r\n");
      out.write("	font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-link {\r\n");
      out.write("	color: rgb(255 255 255/ 100%) !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu {\r\n");
      out.write("	background-color: #ffffff !important;\r\n");
      out.write("	border-color: #949494;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu li a:hover {\r\n");
      out.write("	background-color: #808080 !important;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-dark\"\r\n");
      out.write("	data-bs-theme=\"dark\">\r\n");
      out.write("\r\n");
      out.write("	<!-- admin nav bar -->\r\n");
      out.write("	");

	if (admin == null) {
	
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"admin.jsp\"><i\r\n");
      out.write("			class=\"fa-sharp fa-solid fa-house\" style=\"color: #ffffff;\"></i>&ensp;RevatureShop</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"container text-end\">\r\n");
      out.write("				<ul class=\"navbar-nav justify-content-end\">\r\n");
      out.write("					<li class=\"nav-item\"><button type=\"button\"\r\n");
      out.write("							class=\"btn nav-link\" data-bs-toggle=\"modal\"\r\n");
      out.write("							data-bs-target=\"#add-category\">\r\n");
      out.write("							<i class=\"fa-solid fa-plus fa-xs\"></i>Add Category\r\n");
      out.write("						</button></li>\r\n");
      out.write("					<li class=\"nav-item\"><button type=\"button\"\r\n");
      out.write("							class=\"btn nav-link\" data-bs-toggle=\"modal\"\r\n");
      out.write("							data-bs-target=\"#add-product\">\r\n");
      out.write("							<i class=\"fa-solid fa-plus fa-xs\"></i>Add Product\r\n");
      out.write("						</button></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" aria-current=\"page\"\r\n");
      out.write("						href=\"admin.jsp\">");
      out.print(admin.getName());
      out.write("</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" aria-current=\"page\"\r\n");
      out.write("						href=\"LogoutServlet?user=admin\"><i\r\n");
      out.write("							class=\"fa-solid fa-user-slash fa-sm\" style=\"color: #fafafa;\"></i>&nbsp;Logout</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- end -->\r\n");
      out.write("\r\n");
      out.write("	<!-- for all -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"index.jsp\"><i\r\n");
      out.write("			class=\"fa-sharp fa-solid fa-house\" style=\"color: #ffffff;\"></i>&ensp;RevatureShop</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"products.jsp\"\r\n");
      out.write("					role=\"button\" aria-expanded=\"false\"> Products </a>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Category </a>\r\n");
      out.write("					<ul class=\"dropdown-menu bg-dark\">\r\n");
      out.write("						<li><a class=\"dropdown-item  \"  href=\"products.jsp?category=0\">All\r\n");
      out.write("								Products</a></li>\r\n");
      out.write("						");

						for (Category c : categoryList) {
						
      out.write("\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"products.jsp?category=");
      out.print(c.getCategoryId());
      out.write('"');
      out.write('>');
      out.print(c.getCategoryName());
      out.write("</a></li>\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("					</ul></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form class=\"d-flex pe-5\" role=\"search\" action=\"products.jsp\"\r\n");
      out.write("				method=\"get\">\r\n");
      out.write("				<input name=\"search\" class=\"form-control me-2\" size=\"50\"\r\n");
      out.write("					type=\"search\" placeholder=\"Search for products\" aria-label=\"Search\"\r\n");
      out.write("					style=\"background-color: white !important;\">\r\n");
      out.write("				<button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<!-- when user is logged in -->\r\n");
      out.write("			");

			if (user != null) {
				CartDao cartDao = new CartDao(ConnectionProvider.getConnection());
				int cartCount = cartDao.getCartCountByUserId(user.getUserId());
			
      out.write("\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<li class=\"nav-item active pe-3\"><a\r\n");
      out.write("					class=\"nav-link position-relative\" aria-current=\"page\"\r\n");
      out.write("					href=\"cart.jsp\"><i class=\"fa-solid fa-cart-shopping\"\r\n");
      out.write("						style=\"color: #ffffff;\"></i> &nbsp;Cart<span\r\n");
      out.write("						class=\"position-absolute top-1 start-0 translate-middle badge rounded-pill bg-danger\">");
      out.print(cartCount);
      out.write("</span></a></li>\r\n");
      out.write("				<li class=\"nav-item active pe-3\"><a class=\"nav-link\"\r\n");
      out.write("					aria-current=\"page\" href=\"profile.jsp\">");
      out.print(user.getUserName());
      out.write("</a></li>\r\n");
      out.write("				<li class=\"nav-item pe-3\"><a class=\"nav-link\"\r\n");
      out.write("					aria-current=\"page\" href=\"LogoutServlet?user=user\"><i\r\n");
      out.write("						class=\"fa-solid fa-user-slash\" style=\"color: #fafafa;\"></i>&nbsp;Logout</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			");

			} else {
			
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- Example single danger button -->\r\n");
      out.write("<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Register Dropdown -->\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                Register\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"register.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-plus\" style=\"color: #ffffff;\"></i> Register Customer\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"seller.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-plus\" style=\"color: #ffffff;\"></i> Register Seller\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <!-- Login Dropdown -->\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                Login\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"login.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-lock\" style=\"color: #fafafa;\"></i> Login Customer\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"sellerlogin.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user-lock\" style=\"color: #ffffff;\"></i> Login Seller\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("		<li class=\"nav-item\"><a class=\"nav-link\" href=\"admin.jsp\"\r\n");
      out.write("					role=\"button\" aria-expanded=\"false\"> Admin </a>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	");

	}
	}
	
      out.write("\r\n");
      out.write("	<!-- end  -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row mt-5\">\r\n");
      out.write("			<div class=\"col-md-4 offset-md-4\">\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-header px-5\">\r\n");
      out.write("						<div class=\"container text-center\">\r\n");
      out.write("							<img src=\"Images/customerli.png\" style=\"max-width: 100px;\"\r\n");
      out.write("								class=\"img-fluid\">\r\n");
      out.write("						</div>\r\n");
      out.write("						\r\n");
      out.write("						<h3 class=\"text-center\">Register Seller</h3>\r\n");
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
      out.write("						<!--admin-form-->\r\n");
      out.write("						<form action=\"AdminServlet?operation=save\" method=\"post\">\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label class=\"form-label\">Name</label> <input type=\"text\"\r\n");
      out.write("									name=\"name\" placeholder=\"Enter name\" class=\"form-control\"\r\n");
      out.write("									required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label class=\"form-label\">Email</label> <input type=\"email\"\r\n");
      out.write("									name=\"email\" placeholder=\"Email address\" class=\"form-control\"\r\n");
      out.write("									required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label class=\"form-label\">Password</label> <input\r\n");
      out.write("									type=\"password\" name=\"password\" placeholder=\"Enter password\"\r\n");
      out.write("									class=\"form-control\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label class=\"form-label\">Phone</label> <input type=\"number\"\r\n");
      out.write("									name=\"phone\" placeholder=\"Enter phone number\"\r\n");
      out.write("									class=\"form-control\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"d-grid gap-2 col-6 mx-auto py-3\">\r\n");
      out.write("								<button type=\"submit\" class=\"btn btn-primary me-3\">Register</button>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
