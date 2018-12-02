<%-- 
    Document   : recoverpassword
    Created on : Nov 21, 2018, 9:19:06 PM
    Author     : ABHISHEK KAREER
--%>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%
            String user=request.getParameter("nm");
          
            String pass=request.getParameter("pwd");
            
           
           
            
             try
           {   
             String url = "jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true&verifyServerCertificate=false&allowMultiQueries=true";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","a1611981073");
            String query="UPDATE signup SET password ='"+pass+"' WHERE username='"+user+"' ";
            Statement st=conn.createStatement();
            int q=st.executeUpdate(query);
            if(q>0)
            {
                
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                
                
                rd.forward(request,response);
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("forgot.jsp");
                out.println("<script type=\"text/javascript\">");
            out.println("alert('username not found!!');");
            out.println("</script>");
                rd.forward(request,response);
            }
            st.close();
            
        }
        
        catch(Exception e)
        {
            out.println("got an exception");
            out.println(e.getMessage());
        }
        %>
    </body>
</html>