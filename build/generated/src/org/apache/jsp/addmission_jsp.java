package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addmission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .a\n");
      out.write("            {\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                width:95%;\n");
      out.write("                align: center;\n");
      out.write("                margin-left:40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .b{\n");
      out.write("                 font-size:20px;\n");
      out.write("                  background: lightblue;\n");
      out.write("                  border: 1px solid black;\n");
      out.write("                  width: 100%;\n");
      out.write("                  height: 100%;\n");
      out.write("              }\n");
      out.write("              .c{\n");
      out.write("                  margin-left:38px;\n");
      out.write("                  \n");
      out.write("              }\n");
      out.write("              .d{\n");
      out.write("                  margin-left:40px;\n");
      out.write("                   padding: 10px 100px;\n");
      out.write("                   background-color: lightpink;\n");
      out.write("                    color:white;\n");
      out.write("              }\n");
      out.write("        </style> \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\"> ADDMISSION FORM</h1>\n");
      out.write("        <div class=\"b\">\n");
      out.write("            <form action=\"addmissionservlet\" method=\"get\">\n");
      out.write("                <input class=\"a\" type=\"text\" name=\"fn\" placeholder=\"FIRST NAME\" required> <br><br>\n");
      out.write("                <input class=\"a\" type=\"text\" name=\"ln\" placeholder=\"LAST NAME\" > <br> <br>\n");
      out.write("                <input class=\"a\" type=\"email\" name=\"emaill\" placeholder=\"EMAIL\" required> <br> <br>\n");
      out.write("                <input class=\"a\" type=\"tel\" name=\"mob\" placeholder=\"MOBILE-NO.\" required> <br> <br>\n");
      out.write("                <input class=\"a\" type=\"text\" name=\"cityy\" placeholder=\"TYPE YOUR CITY\" required> <br> <br>\n");
      out.write("                <input class=\"a\" type=\"tel\"  name=\"markss\" placeholder=\"ENTER 10+2 MARKS\" required> <br> <br>\n");
      out.write("            <select class=\"a\" name=\"abc\" value=\"sd\">\n");
      out.write("                 <option  disabled selected>SELECT COURSE:</option>\n");
      out.write("                <option>B.TECH</option>\n");
      out.write("                <option>M.TECH</option>\n");
      out.write("                <option>B.A.</option>\n");
      out.write("                <option>M.A.</option>\n");
      out.write("                <option>B.SC</option>\n");
      out.write("                <option>B.COM </option>\n");
      out.write("            </select> <br> <br>\n");
      out.write("            <div class=\"c\"><select name=\"datee\" value=\"df\">\n");
      out.write("                <option disabled selected>SELECT DATE: </option>\n");
      out.write("                  <option>1</option>\n");
      out.write("                   <option>2</option>\n");
      out.write("                    <option>3</option>\n");
      out.write("                     <option>4</option>\n");
      out.write("                      <option>5</option>\n");
      out.write("                       <option>6</option>\n");
      out.write("                   <option>7</option>\n");
      out.write("                    <option>8</option>\n");
      out.write("                     <option>9</option>\n");
      out.write("                      <option>10</option>\n");
      out.write("                       <option>11</option>\n");
      out.write("                   <option>12</option>\n");
      out.write("                    <option>13</option>\n");
      out.write("                     <option>14</option>\n");
      out.write("                      <option>15</option>\n");
      out.write("                       <option>16</option>\n");
      out.write("                   <option>17</option>\n");
      out.write("                    <option>18</option>\n");
      out.write("                     <option>19</option>\n");
      out.write("                      <option>20</option>\n");
      out.write("                       <option>21</option>\n");
      out.write("                   <option>22</option>\n");
      out.write("                    <option>23</option>\n");
      out.write("                     <option>24</option>\n");
      out.write("                      <option>25</option>\n");
      out.write("                       <option>26</option>\n");
      out.write("                   <option>27</option>\n");
      out.write("                    <option>28</option>\n");
      out.write("                     <option>29</option>\n");
      out.write("                      <option>30</option>\n");
      out.write("                       <option>31</option>\n");
      out.write("                </select>\n");
      out.write("                <select name=\"monthe\" value=\"fg\">\n");
      out.write("                    <option disabled selected> SELECT MONTH: </OPTION>\n");
      out.write("                    <option>JANUARY </option>\n");
      out.write("                    <option> FEBRUARY</option>\n");
      out.write("                    <option>MARCH </option>\n");
      out.write("                    <option>APRIL </option>\n");
      out.write("                    <option>MAY </option>\n");
      out.write("                    <option>JUNE </option>\n");
      out.write("                    <option>JULY </option>\n");
      out.write("                    <option>AUGUST </option>\n");
      out.write("                    <option>SEPTEMBER </option>\n");
      out.write("                    <option>OCTOBER </option>\n");
      out.write("                    <option>NOVEMBER </option>\n");
      out.write("                    <option>DECEMBER </option>\n");
      out.write("                </select>\n");
      out.write("                <select name=\"yearr\" value=\"hj\">\n");
      out.write("                    <option disabled selected>SELECT YEAR </option>\n");
      out.write("                    <option>1980 </option>\n");
      out.write("                    <option> 1981</option>\n");
      out.write("                    <option> 1982</option>\n");
      out.write("                    <option>1983 </option>\n");
      out.write("                    <option>1984 </option>\n");
      out.write("                    <option> 1985</option>\n");
      out.write("                    <option>1986 </option>\n");
      out.write("                    <option> 1987</option>\n");
      out.write("                    <option>1988 </option>\n");
      out.write("                    <option>1989 </option>\n");
      out.write("                    <option> 1990</option>\n");
      out.write("                    <option>1991 </option>\n");
      out.write("                    <option>1992 </option>\n");
      out.write("                    <option>1993 </option>\n");
      out.write("                    <option>1994 </option>\n");
      out.write("                    <option> 1995</option>\n");
      out.write("                    <option> 1996</option>\n");
      out.write("                    <option> 1997</option>\n");
      out.write("                    <option>1998 </option>\n");
      out.write("                    <option>1999 </option>\n");
      out.write("                    <option> 2000</option>\n");
      out.write("                    <option> 2001</option>\n");
      out.write("                    <option>2002 </option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\" class=\"d\"> APPLY NOW </button>\n");
      out.write("            </form>\n");
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
