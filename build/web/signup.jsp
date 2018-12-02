<%-- 
    Document   : signup
    Created on : Nov 27, 2018, 9:24:28 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <head>
        <title> Sign up</title> 
        <style>
body{
	
	background-color:white;
	background-size:100% 100%;
    }
 .demo{
	background-color:#ccccff;
	width:300px;
	height:475px;
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
          SIGN UP
          <hr>
	<div class='txt'>  </div>  
        <div class='frm' >
            <form action="signupservlet" method="get">
                
                Full Name <br> <input type='text' name="name" placeholder='enter full name'> <br> 
                Username   <br> <input type='text' name="user" placeholder='pick unique username'> <br> 
                Mobile-no.  <br><input type="tel" maxlength="10" name="mob" placeholder='enter phone number'> <br> 
                Email    <br>  <input type="email" name='emaill' placeholder='enter your email' > <br> 
                Password <br> <input type="password" name="pswd" placeholder='set password'> <br> <br> 
                <button class='on' type='submit'> Sign up </button>
<!--                <div class='link'>
                    <a href='log in.html'> Log in </a>  
                </div>-->
            </form>
            
            
        </div>
        
      </div>
        
    
        
    
    </body>
</html>
