import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class signupservlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String URL;
        URL ="jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true";
        try{  
            String name = request.getParameter("name");
            String username = request.getParameter("user"); 
             String mobile = request.getParameter("mob");
            String email = request.getParameter("emaill");                       
            String password = request.getParameter("pswd");            
           
         
            pw.println(name);
           
             pw.println(email);
            pw.println(username);          
            pw.println(password);           
            pw.println(mobile);
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(URL,"root","a1611981073")) {
                String q= "insert into signup values (?,?,?,?,?)";
                PreparedStatement stat = con.prepareStatement(q);
                 stat.setString(1,name);
                 stat.setString(2,username); 
                 stat.setString(3,mobile);
                 stat.setString(4,email);               
                 stat.setString(5,password);                 
                 
                
                 
                 int i = stat.executeUpdate();
                 if(i>0){
                     RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                     rd.forward(request,response);
                 }
                 else{
                     pw.println("failed to insert the data");
                 }  
                 stat.executeUpdate(q);
                 
            }
        }
        
  catch (Exception e){
  pw.println();
  }
        }
  }
       
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}