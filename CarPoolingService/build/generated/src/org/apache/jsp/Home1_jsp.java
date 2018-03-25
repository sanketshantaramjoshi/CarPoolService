package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("         <script src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("         <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .carousel\n");
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
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"carousel slide\"  id =\"myCarousel-indicators\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li class=\"active\" data-slide-to=\"0\" data-target=\"#myCarousel\"></li>\n");
      out.write("                <li data-slide-to=\"1\" data-target=\"#myCarousel\"></li>\n");
      out.write("                <li data-slide-to=\"2\" data-target=\"#myCarousel\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img alt=\"first slide\" src=\"image1.jpeg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <h1>CarpoolService</h1>\n");
      out.write("                            <p>this is car</p>\n");
      out.write("                            <p>\n");
      out.write("                                <a class=\"btn btn-large btn-primary\" href=\"SignIn.jsp\">SignIn</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <img alt=\"second slide\" src=\"image2.jpeg\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                          <h1>CarpoolService1</h1> \n");
      out.write("                          <p>this is carpool</p>\n");
      out.write("                          <p>\n");
      out.write("                              <a class=\"btn btn-large btn-primary\" href=\"SignUp.jsp\">SignUp</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("                  <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("                   <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("            </a>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
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
