<%-- 
    Document   : homepage
    Created on : Nov 27, 2018, 9:26:48 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <style>
            .left{
                float:left;
            }
            .right{
                float:right;
                font-size:25px;
            }
            .op{
                background-color:black;
            }
            .d{
                float:left;
                font-size:30px;
                width:300px;
                height:150px;
                border:inset;
            }
            .e{
                float:right;
            }
         .d  a:hover:not(.active) {
    background-color:linen;
}
        </style> 
    </head>
    <body>
        welcom
         <%= 
             session.getAttribute("cuser").toString()
             %>
        
        <div class="op">
           
            <p class="left">
                <img src="Loogo.jpg" height="8%" width="30%" >
            </p>
            <p class="right">
                <a href="login."> LOG IN </a>&nbsp&nbsp
                <a href="signup.html"> SIGN UP </a>&nbsp&nbsp
                <a href="x.html">COMPLAINTS </a> &nbsp&nbsp
                <a href='help.html'>HELP <a>
            </p>
            
        
        </div>
            <br> 
         <hr width="100%">
         
         <img src="bg.jpg" width="100%">
         <p align='center'> CONTACT US  </p>  <br>
         <div align="center">
             <a href="https://www.facebook.com/">
                 <img src="facebook.jpg" height="50px" width="50px" > </a>
             <a href="https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession">
                 <img src="gmail.png" height="50px" width="50px"> </a>
         </div>
         
    </body>
    
</html>
