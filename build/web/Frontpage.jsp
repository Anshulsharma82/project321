<%-- 
    Document   : Frontpage
    Created on : Nov 29, 2018, 9:44:36 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
    
}

li {
    float: right;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: transparent;
}
.bb{
    float:left;
    
}
.aa{
    float:right;
    
}
.cc
{
    float:left;
    display: inline;
}
.dd
{
    float:right;
}
.ee{
    display: inline;
    bottom: 510px;
    left: 930px;
    position:absolute;
    
}
.ff {

   display: inline;
    bottom: 200px;
    left: 880px;
    position:absolute; 
}
.gg
{
      display: inline;
    bottom: -65px;
    left: 550px;
    position:absolute;
}
.hh{
    display: inline;
    bottom: -65px;
    left: 1100px;
    position:absolute;
}
* {box-sizing: border-box;}
body {font-family: Verdana, sans-serif;}
.mySlides {display: none;}
img {vertical-align: middle;}

/* Slideshow container */
.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}

/* Caption text */
.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

/* On smaller screens, decrease text size */
@media only screen and (max-width: 300px) {
  .text {font-size: 11px}
}
</style>
</head>
<body>
    <div >
        <div class="bb">
            
                
            
                   <img src="Loogo.jpg" height="30%" width="40%"> 
                  
            
        </div>
        <div class="aa">
            
        
            <ul>
 
  
  <li><a href="contact.jsp">CONTACT</a></li>
  <li><a href="addmission.jsp">ADDMISSION</a></li>
  <li><a href="signup.jsp">SIGN UP</a></li>
   <li><a class="active" href="Frontpage.jsp">HOME</a></li>
</ul>
            </div>
    </div>
    <div>
        <div class="cc">
            <br>
            <div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
  <img src="class.jpg" style="width:90%;height:500px">
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <img src="Loogo.jpg" style="width:80%;height:500px">
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <img src="pahad.jpg" style="width:120%;height:500px">
  <div class="text">Caption Three</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>
            <h2 class="ee"> YOUR CAREER NEED US </h2> 
            <p class="ff"><b><i> Chitkara University in Himachal Pradesh has been founded by Dr. Ashok  and Dr. Madhu Chitkara who have been passionate teachers for more than 40 years now. Since inception,  University has been different.<br> Our students have been different. So are our faculty, our academic strengths and our outlook on teaching <br>and learning.</i></b>
                <br><br> <b><i>
                Within a decade, most of our academic programs are ranked in top 50 programs in the country. The unique difference being that Chitkara University has been established by and managed by passionate academicians with the sole mission of making each and every student “industry-ready"
                    </i></b>
                </p>
        </div>
        
        <h3> 
        <%=
            session.getAttribute("cuser").toString() 
        %>
        </h3> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
        <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> 
        <hr>
        <div >
            FOR MORE INFORMATION <br>GIVE A MISS CALL ON <br> 01970-253749
            <p class="gg"> ADDMISSION HELPLINE NO.<br>95563-36670</p>
            <p class="hh"> NORTH-EAST HELPLINE NO. <br> 80076-59051 </p>
        </div>
    </div>
        <script>
var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    var dots = document.getElementsByClassName("dot");
    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    for (i = 0; i < dots.length; i++) {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    slides[slideIndex-1].style.display = "block";  
    dots[slideIndex-1].className += " active";
    setTimeout(showSlides, 2500); // Change image every 2 seconds
}
</script>
</body>
</html>

