package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .left{\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .right{\n");
      out.write("                float:right;\n");
      out.write("                font-size:25px;\n");
      out.write("            }\n");
      out.write("            .op{\n");
      out.write("                background-color:black;\n");
      out.write("            }\n");
      out.write("            .d{\n");
      out.write("                float:left;\n");
      out.write("                font-size:30px;\n");
      out.write("                width:300px;\n");
      out.write("                height:150px;\n");
      out.write("                border:inset;\n");
      out.write("            }\n");
      out.write("            .e{\n");
      out.write("                float:right;\n");
      out.write("            }\n");
      out.write("         .d  a:hover:not(.active) {\n");
      out.write("    background-color:linen;\n");
      out.write("}\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"op\">\n");
      out.write("           \n");
      out.write("            <p class=\"left\">\n");
      out.write("                <img src=\"Loogo.jpg\" height=\"8%\" width=\"30%\" >\n");
      out.write("            </p>\n");
      out.write("            <p class=\"right\">\n");
      out.write("                <a href=\"log in.html\"> LOG IN </a>&nbsp&nbsp\n");
      out.write("                <a href=\"signup.html\"> SIGN UP </a>&nbsp&nbsp\n");
      out.write("                <a href=\"x.html\">COMPLAINTS </a> &nbsp&nbsp\n");
      out.write("                <a href='help.html'>HELP <a>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("            <br> \n");
      out.write("         <hr width=\"100%\">\n");
      out.write("         \n");
      out.write("         <img src=\"bg.jpg\" width=\"100%\">\n");
      out.write("         <p align='center'> CONTACT US  </p>  <br>\n");
      out.write("         <div align=\"center\">\n");
      out.write("             <a href=\"https://www.facebook.com/\">\n");
      out.write("                 <img src=\"facebook.jpg\" height=\"50px\" width=\"50px\" > </a>\n");
      out.write("             <a href=\"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession\">\n");
      out.write("                 <img src=\"gmail.png\" height=\"50px\" width=\"50px\"> </a>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
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
