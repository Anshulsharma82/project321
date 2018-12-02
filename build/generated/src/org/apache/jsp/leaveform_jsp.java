package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaveform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("             .a{\n");
      out.write("\tbackground-color:#ccccff;\n");
      out.write("\twidth:300px;\n");
      out.write("\theight:520px;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tmargin:auto;\n");
      out.write("\tmargin-top:7%;\n");
      out.write("\tbox-shadow:10px 10px 50px black;\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-radius:2%;\n");
      out.write("\ttext-align:center;\n");
      out.write("\t\n");
      out.write("\tfont-family:ariel;\n");
      out.write("\tcolor:#044;\n");
      out.write("\t\n");
      out.write("      }\n");
      out.write("      .b\n");
      out.write("      {\n");
      out.write("          width:300px;\n");
      out.write("          height:100px;\n");
      out.write("      }\n");
      out.write("      .c{\n");
      out.write("          font-size:20px;\n");
      out.write("      }\n");
      out.write("      .d{\n");
      out.write("          text-align: center;\n");
      out.write("          color:black;\n");
      out.write("          \n");
      out.write("      }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"a\">\n");
      out.write("            <div class=\"b\">\n");
      out.write("                <h1> LEAVE FORM </h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"c\">\n");
      out.write("                NAME <br> <input type=\"text\" name=\"nm\" placeholder=\"enter your name\" size=\"25\"><br>\n");
      out.write("                ID <br> <input type=\"tel\" name=\"id\" placeholder=\"enter your id\" size=\"25\"> <br>\n");
      out.write("                TODAY'S DATE <br> <input type=\"date\" placeholder=\"Today date\" > <br> <br>\n");
      out.write("                <div class=\"d\">\n");
      out.write("                    <bold>  Holiday Request:</bold><br> <br>\n");
      out.write("                </div>\n");
      out.write("                FROM <br> <input type=\"date\" > <br>\n");
      out.write("                TO <br> <input type=\"date\"> <br>\n");
      out.write("                REASON <br> <textarea >\n");
      out.write("                    \n");
      out.write("                </textarea> <br> <br>\n");
      out.write("                <button  type=\"submit\"> SUBMIT </button>\n");
      out.write("            </div>\n");
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
