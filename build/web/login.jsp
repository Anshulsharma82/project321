<%-- 
    Document   : login
    Created on : Nov 27, 2018, 9:23:08 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title> Sign up</title> 
        <style>
body{
	
	background-color:#fff;
	background-size:100% 100%;
    }
 .demo{
	background-color:#ccccff;
	width:300px;
	height:375px;
	<!--min-width:300px;-->
	<!--max-width:430px;-->
	<!--min-height:500px;-->
	<!--max-height:700px;-->
	height:70%;
	margin:auto;
	margin-top:7%;
	box-shadow:10px 10px 50px black;
	border:none;
	border-radius:2%;
	text-align:center;
	font-size:40px;
	font-family:ariel;
	color:#044;
	opacity:1;
	animation-name:test;
	animation-duration:5s;
	animation-fill-mode:forwards;
      }

.frm{
	font-size:23px;
	margin-top:50px;
        
    }
    .on{
        background-color: #4CAF50;
        color:white;
        padding: 10px 100px;
        cursor: pointer;
    }
    .link{
        font-size:18px;
        text-align:center;
    }
</style>
        </head>
    <body>
        <div style="text-align:center;">
    <img src="Loogo.jpg" height="8%" width="20%">
    <hr>
</div>
      <div  class='demo'>
          LOG IN
          <hr>
	<div class='txt'>  </div>  
        <div class='frm' >
            <form action="loginlogin.jsp">
                Username    <br>  <input type='text' name='nm' placeholder='enter username' > <br> 
                Password <br> <input type='password' name='pwd' placeholder='set password'> <br> <br> 
                <button class='on' type='submit'> LOG IN </button>
                <div class='link'>
                    <a href='signup.jsp'> Sign up </a>  <br>
                    <a href="forgot.jsp"> Forgot Password? </a>
                </div>
            </form>
            
            
        </div>
        
      </div>
        
    
        
    
    </body>
</html>
