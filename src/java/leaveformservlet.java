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



public class leaveformservlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String URL;
        URL ="jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true";
        try{  
            String name = request.getParameter("nm");
            String roll = request.getParameter("id"); 
             String datee = request.getParameter("datte");
            String datte1 = request.getParameter("fdate");                       
            String datte2 = request.getParameter("tdate");            
            String textarea = request.getParameter("textar"); 
         
            pw.println(name);
           
             pw.println(roll);
            pw.println(datee);          
            pw.println(datte1);           
            pw.println(datte2);
            pw.println(textarea);
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(URL,"root","a1611981073")) {
                String q= "insert into leaveform1 values (?,?,?,?,?,?)";
                PreparedStatement stat = con.prepareStatement(q);
                 stat.setString(1,name);
                 stat.setString(2,roll); 
                 stat.setString(3,datee);
                 stat.setString(4,datte1);               
                 stat.setString(5,datte2);                 
                 stat.setString(6, textarea);
                
                 
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