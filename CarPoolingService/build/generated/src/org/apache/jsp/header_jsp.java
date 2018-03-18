package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .marketing\n");
      out.write("            {\n");
      out.write("                padding-left: 15px;\n");
      out.write("                padding-right: 15px;   \n");
      out.write("            }\n");
      out.write("            .marketing .col-lg-4\n");
      out.write("            {\n");
      out.write("                text-align:center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .marketing .col-lg-4 p\n");
      out.write("            {\n");
      out.write("                margin-left: 10px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            footer\n");
      out.write("            {\n");
      out.write("               background-color: #000;\n");
      out.write("               padding: 50px;\n");
      out.write("            }\n");
      out.write("           .carousel \n");
      out.write("           {\n");
      out.write("               position: relative; \n");
      out.write("               top:0; \n");
      out.write("           }\n");
      out.write("           .carousel-inner \n");
      out.write("           {\n");
      out.write("               position: relative; \n");
      out.write("               width: 100%;\n");
      out.write("               overflow: hidden;}\n");
      out.write("           \n");
      out.write("         .navbar \n");
      out.write("          {\n");
      out.write("        \n");
      out.write("    position:absolute;\n");
      out.write("    top:30px;\n");
      out.write("    z-index:10;\n");
      out.write("    width:60%;\n");
      out.write("    opacity: 0.5;\n");
      out.write("   \n");
      out.write("         }\n");
      out.write("         body\n");
      out.write("         {\n");
      out.write("             font-size-adjust:20;\n");
      out.write("         }\n");
      out.write("       </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("         <div class=\"container\">\n");
      out.write("     <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("  <!-- Brand/logo -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("    <img src=\"carpoollogo.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write("  <!-- Links -->\n");
      out.write("  <ul class=\" nav navbar-nav\">\n");
      out.write("    <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"Home.jsp\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"ContactUs\">ContactUs</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"AboutUs\">AboutUs</a>\n");
      out.write("    </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"Information\">Information</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("         </div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("  </ul>\n");
      out.write("   \n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">  \n");
      out.write("        <img src=\"image1.jpeg\" alt=\"image\"  height=\"600px\" width=\"100%\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("    <h1>CarPool</h1>\n");
      out.write("    <p>Lets ride today</p>\n");
      out.write("    <p>\n");
      out.write("        <a class=\"btn btn-large btn-primary\" href=\"SignUp\">Sign Up</a></p>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image2.jpeg\" alt=\"Chicago\" height=\"600px\" width=\"100%\"  >\n");
      out.write("       <div class=\"container\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("    <h1>CarPool</h1>\n");
      out.write("    <p>Lets ride today</p>\n");
      out.write("    <p>\n");
      out.write("        <a class=\"btn btn-large btn-primary\" href=\"SignIn\">Sign in</a></p>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"image3.jpeg\" alt=\"New York\"  height=\"600px\" width=\"100%\"      >\n");
      out.write("      <div class=\"carousel-caption\">  \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-marketing\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                   <img src=\"image4.jpg\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"304\" height=\"236\"> \n");
      out.write("                    <p><a class=\"btn btn-default\" href=\"#\">Book your car</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- col-lg-4 -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <img src=\"image5.jpg\" class=\"rounded-circle\" alt=\"Cinque Terre\" width=\"304\" height=\"236\"> \n");
      out.write("                    <p><a class=\"btn btn-default\" href=\"#\">Book your carpoolservice</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <!-- col-lg-4 -->\n");
      out.write("         \n");
      out.write("        <footer>\n");
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
      out.write("  \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>");
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
