package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             \n");
      out.write("            h1{\n");
      out.write("                font-size: 35px;\n");
      out.write("                color:#6666ff;\n");
      out.write("               font-family:verdana;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           nav_wrapper\n");
      out.write("           {\n");
      out.write("               list-style: none;\n");
      out.write("               display:inline;\n");
      out.write("               background-color: yellow;\n");
      out.write("           }\n");
      out.write("            carousel.item img\n");
      out.write("          {\n");
      out.write("              width:100%;\n");
      out.write("              heigth:80%\n");
      out.write("          }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     <header>\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("              <div id=\"Carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <h1> <img src=\"carpoollogo.png\" class=\"rounded\" alt=\"carpoollogo\" width=\"120\" height=\"100\">\n");
      out.write("               Transport Your World Pvt.Ltd</h1>\n");
      out.write("        <div class=\"nav_wrapeer\" nav class=\"navbar navbar-expand-sm bg-light navbar-light\">\n");
      out.write("            <ul class=\"nav nav-pills\">\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link active\" href=\"Home.jsp\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"ContactUs.jsp\">Contact Us</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">About Us</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Information</a>\n");
      out.write("    </li>\n");
      out.write("    \n");
      out.write("        <form class=\"form-inline\" action=\"/action_page.php\">\n");
      out.write("        <input class=\"form-control\" type=\"text\" placeholder=\"Search\">\n");
      out.write("        <button class=\"btn btn-success\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("</nav>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("  \n");
      out.write("\n");
      out.write("<div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("        <img src=\"image1.jpg\" class=\"img-responsive\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image2.jpg\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image3.jpg\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image4.jpg\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("   <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image2.jpg\" alt=\"Image\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#Carousel\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#Carousel\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("                       \n");
      out.write("   </header>\n");
      out.write("       \n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
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
