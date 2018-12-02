<%-- 
    Document   : forgot
    Created on : Nov 27, 2018, 9:25:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <style>
      body{
	
	background-color:white;
	background-size:100% 100%;
    }
     #left{
        float:left;
    }
    #right{
        float:right;
        font-size:20px;
    }
    #ers{
        background-color:red;
    }
 .demo{
	background-color:#ccccff;
	width:300px;
	height:250px;
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
        padding:5px 20px;
        cursor: pointer;
    }
   
        </style>

    </head>
    <body>
         
     <div>
<p id="ers">
    
<p id="left">
<img src="Loogo.jpg" height="8%" width="30%" >
</p>
<p id="right">
<a href="signup.html"> Sign up</a>  
</p> 
<hr width='100%'>
</p>

</div>
        
       
         <div  class='demo'>  
	<div class='txt'>  </div>  
        <div class='frm' >
            <form action="forgotJSP.jsp">
                Enter your email and we'll send you a link to reset your password <br>
                <input type="text" name="nm" placeholder="Username" size="25" > <br>
                  <input type="password" name="pwd" placeholder="passwprd" size="25" >
                <button class='on' type='submit'> Reset Password </button>
                   </form>
            
            
        </div>
        
      </div>
    </body>
</html>

