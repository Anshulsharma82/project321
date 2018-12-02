package log;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class logservlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name="abc";
        String pwd="1234";
        String uname=request.getParameter("nm");
        String upwd=request.getParameter("pwd");
        if(name.equals(uname)&& pwd.equals(upwd)){
         /* response.sendRedirect("successful.html"); 
         */   
      /* RequestDispatcher rd=request.getRequestDispatcher("successful.html");
       rd.forward(request,response);*/
       HttpSession s=request.getSession();
       s.setAttribute("name",uname);
       RequestDispatcher rd=request.getRequestDispatcher("Frontpage.html");
           rd.forward(request,response);
        }
        else
        {
            
            
            response.sendRedirect("log in.html");
            
      		
		
       
          
        /*RequestDispatcher rd=request.getRequestDispatcher("unsuccessful.html");
        rd.forward(request,response);  }*/
        
    }

    

}
}
