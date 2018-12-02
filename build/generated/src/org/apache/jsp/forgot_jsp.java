package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("      body{\n");
      out.write("\t\n");
      out.write("\tbackground-color:white;\n");
      out.write("\tbackground-size:100% 100%;\n");
      out.write("    }\n");
      out.write("     #left{\n");
      out.write("        float:left;\n");
      out.write("    }\n");
      out.write("    #right{\n");
      out.write("        float:right;\n");
      out.write("        font-size:20px;\n");
      out.write("    }\n");
      out.write("    #ers{\n");
      out.write("        background-color:red;\n");
      out.write("    }\n");
      out.write(" .demo{\n");
      out.write("\tbackground-color:#ccccff;\n");
      out.write("\twidth:300px;\n");
      out.write("\theight:250px;\n");
      out.write("\t<!--min-width:300px;-->\n");
      out.write("\t<!--max-width:430px;-->\n");
      out.write("\t<!--min-height:500px;-->\n");
      out.write("\t<!--max-height:700px;-->\n");
      out.write("\theight:70%;\n");
      out.write("\tmargin:auto;\n");
      out.write("\tmargin-top:7%;\n");
      out.write("\tbox-shadow:10px 10px 50px black;\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-radius:2%;\n");
      out.write("\ttext-align:center;\n");
      out.write("\tfont-size:40px;\n");
      out.write("\tfont-family:ariel;\n");
      out.write("\tcolor:#044;\n");
      out.write("\topacity:1;\n");
      out.write("\tanimation-name:test;\n");
      out.write("\tanimation-duration:5s;\n");
      out.write("\tanimation-fill-mode:forwards;\n");
      out.write("      }\n");
      out.write("\n");
      out.write(".frm{\n");
      out.write("\tfont-size:23px;\n");
      out.write("\tmargin-top:50px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("     .on{\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        color:white;\n");
      out.write("        padding:5px 20px;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("   \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("     <div>\n");
      out.write("<p id=\"ers\">\n");
      out.write("    \n");
      out.write("<p id=\"left\">\n");
      out.write("<img src=\"Loogo.jpg\" height=\"8%\" width=\"30%\" >\n");
      out.write("</p>\n");
      out.write("<p id=\"right\">\n");
      out.write("<a href=\"signup.html\"> Sign up</a>  \n");
      out.write("</p> \n");
      out.write("<hr width='100%'>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("         <div  class='demo'>  \n");
      out.write("\t<div class='txt'>  </div>  \n");
      out.write("        <div class='frm' >\n");
      out.write("            <form action=\"forgotJSP.jsp\">\n");
      out.write("                Enter your email and we'll send you a link to reset your password <br>\n");
      out.write("                <input type=\"text\" name=\"nm\" placeholder=\"Username\" size=\"25\" > <br>\n");
      out.write("                  <input type=\"password\" name=\"pwd\" placeholder=\"passwprd\" size=\"25\" >\n");
      out.write("                <button class='on' type='submit'> Reset Password </button>\n");
      out.write("                   </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
