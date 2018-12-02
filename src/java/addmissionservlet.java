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



public class addmissionservlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        String URL;
        URL ="jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true";
        try{  
            String fname = request.getParameter("fn");
            String lname = request.getParameter("ln");
            String email = request.getParameter("emaill");
            String mobile = request.getParameter("mob");
            String city = request.getParameter("cityy");
            String marks = request.getParameter("markss");
            String course = request.getParameter("abc");
            String datte = request.getParameter("datee");
             String mont = request.getParameter("monthe");
            String yeaar = request.getParameter("yearr");                       
                        
           
         
            pw.println(fname);
            pw.println(lname);
             pw.println(email);
              pw.println(mobile);
            pw.println(city);          
            pw.println(marks); 
             pw.println(course);
              pw.println(datte);
               pw.println(mont);
                pw.println(yeaar);
           
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(URL,"root","a1611981073")) {
                String q= "insert into addmission values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stat = con.prepareStatement(q);
                 stat.setString(1,fname);
                 stat.setString(2,lname); 
                 stat.setString(3,email);
                 stat.setString(4,mobile);               
                 stat.setString(5,city);                 
                 stat.setString(6,marks);
                 stat.setString(7,course);
                 stat.setString(8,datte);
                 stat.setString(9,mont);
                 stat.setString(10,yeaar);
                
                 
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