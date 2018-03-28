package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sanket1.CarPoolingService.daoimpl.CustomerDAOImpl;
import com.sanket1.CarPoolingService.entities.Customer;

public final class editcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" <script src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("         <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("         .navbar-wrapper\n");
      out.write("          {\n");
      out.write("              position: relative;\n");
      out.write("              z-index: 15;\n");
      out.write("          }\n");
      out.write("          .navbar .nav > li > a\n");
      out.write("          {\n");
      out.write("              color: #000;\n");
      out.write("              text-shadow:none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav > li > a:hover\n");
      out.write("          {\n");
      out.write("              color:#000;\n");
      out.write("              background: none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav .active > a\n");
      out.write("          {\n");
      out.write("              color: #000;\n");
      out.write("              background: none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav .active > a:hover\n");
      out.write("          {\n");
      out.write("          background: none\n");
      out.write("          }\n");
      out.write("          .navbar-wrapper\n");
      out.write("          {\n");
      out.write("              margin-top:20px;\n");
      out.write("          }\n");
      out.write("            .navbar-wrapper .navbar\n");
      out.write("            {\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("           .carousel-inner img {\n");
      out.write("      width: 100%;\n");
      out.write("      height: 500px;  }\n");
      out.write("             .carousel\n");
      out.write("            {\n");
      out.write("                margin-bottom: 60px;\n");
      out.write("                margin-top: 90px;\n");
      out.write("            }\n");
      out.write("            .carousel-caption\n");
      out.write("            {\n");
      out.write("                z-index: 10;\n");
      out.write("            }\n");
      out.write("            .carousel .item\n");
      out.write("            {\n");
      out.write("                height: 50px;\n");
      out.write("                background-color: #777;\n");
      out.write("            }\n");
      out.write("            .carousel-inner > .item > img\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left:0;\n");
      out.write("                min-width: 100%;\n");
      out.write("                height: 500px;\n");
      out.write("            }\n");
      out.write("            .carousel-caption p\n");
      out.write("            {\n");
      out.write("             margin-bottom: 20px;\n");
      out.write("             font-size: 21px;\n");
      out.write("             line-height: 1.4;\n");
      out.write("       \n");
      out.write("        \n");
      out.write("       </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("         <div class=\"container\">\n");
      out.write("    <NAVBAR>\n");
      out.write("        <div class=\"navbar-wrapper\">\n");
      out.write("            <div class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button class=\"navbar-toggle\" data-target=\".navbar-collapse\" data-toggle=\"collapse\" type=\"button\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                      <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span></button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">Cars</a>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"Home.jsp\">Home</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"AboutUs.jsp\">AboutUs</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"ContactUs\">ContactUs</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"Information.jsp\">Information</a>\n");
      out.write("                           </li>\n");
      out.write("                            </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         </div> \n");
      out.write("        \n");
      out.write("    </NAVBAR>\n");
      out.write("             <div id=\"myCarousel\" class=\"carousel slide\" >\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li class=\"active\" data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"image1.jpeg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Los Angeles</h3>\n");
      out.write("        <p>We had such a great time in LA!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image2.jpeg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Chicago</h3>\n");
      out.write("        <p>Thank you, Chicago!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>");
      out.write("\n");
      out.write("<p>\n");
      out.write("<form action=\"EditCustomer.do\" method=\"get\">\n");
      out.write("\n");

Customer customer = new CustomerDAOImpl().getCustomerByID(Integer.parseInt(request.getParameter("customerID")));
request.setAttribute("customer",customer);

      out.write("\n");
      out.write("<input type=\"hidden\" name=\"customerID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            Customer Name :<input type=\"text\" name=\"customerName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer Contact :<input type=\"text\" name=\"customerContact\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerContact}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer Gender :<input type=\"text\" name=\"customerGender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerGender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer Email :<input type=\"text\" name=\"customerEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer Address:<input type=\"text\" name=\"customerAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer DateOFBirth :<input type=\"text\" name=\"cuatomer DateOfBirth\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerDateOfBirth}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("            <br/>\n");
      out.write("            Customer Password :<input type=\"text\" name=\"customerPasword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.customerPassword}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" name=\"action\" value=\"Save Changes\" />\n");
      out.write("            <input type=\"submit\" name=\"action\"  value=\"Delete\" />\n");
      out.write("        </form>\n");
      out.write("   </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("         footer\n");
      out.write("            {\n");
      out.write("               background-color: #000;\n");
      out.write("               padding: 50px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("   <footer>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                        <p class=\"pull-rigth\"><a href=\"#\">Back to top</a></p>\n");
      out.write("                        <p>\n");
      out.write("                            &COPY; 2018 Transport your company, Inc.\n");
      out.write("                            &middot; <a href=\"Privacy\">Privacy</a>\n");
      out.write("                            &middot; <a href=\"Terms and condition\">Terms & condition</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
