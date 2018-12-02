<%-- 
    Document   : leaveform
    Created on : Nov 28, 2018, 7:42:57 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <style>
             .a{
	background-color:#ccccff;
	width:300px;
	height:520px;
	
	
	margin:auto;
	margin-top:7%;
	box-shadow:10px 10px 50px black;
	border:none;
	border-radius:2%;
	text-align:center;
	
	font-family:ariel;
	color:#044;
	
      }
      .b
      {
          width:300px;
          height:100px;
      }
      .c{
          font-size:20px;
      }
      .d{
          text-align: center;
          color:black;
          
      }
        </style>
    </head>
    <body>
        <div class="a">
            <div class="b">
                <h1> LEAVE FORM </h1>
                <hr>
            </div>
            <div class="c">
                <form action="leaveformservlet" method="post">
                NAME <br> <input type="text" name="nm" placeholder="enter your name" size="25"><br>
                ID <br> <input type="tel" name="id" placeholder="enter your id" size="25"> <br>
                TODAY'S DATE <br> <input type="date" placeholder="Today date" name="datte" > <br> <br>
                <div class="d">
                    <bold>  Holiday Request:</bold><br> <br>
                </div>
                FROM <br> <input type="date" name="fdate"> <br>
                TO <br> <input type="date" name="tdate"> <br>
                REASON <br> <textarea name="textar" >
                    
                </textarea> <br> <br>
                <button  type="submit"> SUBMIT </button>
                </form>
            </div>
        </div>
    </body>
</html>
