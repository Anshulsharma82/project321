<%-- 
    Document   : addmission
    Created on : Nov 28, 2018, 10:57:57 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <style>
            body{
             
                background-repeat:no-repeat;
                background-image: 100%;
                background-size: auto;
               
            }
            .a
            {
                padding: 12px 20px;
                width:95%;
                align: center;
                margin-left:40px;
                
            }
            .b{
                 font-size:20px;
                 
                  border: 1px solid black;
                  width: 100%;
                  height: 100%;
              }
              .c{
                  margin-left:38px;
                  
              }
              .d{
                  margin-left:40px;
                   padding: 10px 100px;
                   background-color: lightpink;
                    color:white;
              }
              .bg{
                  height:100%;
                     background-image:url("bg3.jpg");
                     background-repeat:no-repeat;
                background-image: 100%;
                background-size: cover;
               
              }
        </style> 
        
    </head>
    <body>
        <div class="bg">
        <h1 align="center"> ADDMISSION FORM</h1>
        <div class="b">
            <form action="addmissionservlet" method="get">
                <input class="a" type="text" name="fn" placeholder="FIRST NAME" required> <br><br>
                <input class="a" type="text" name="ln" placeholder="LAST NAME" > <br> <br>
                <input class="a" type="email" name="emaill" placeholder="EMAIL" required> <br> <br>
                <input class="a" type="tel" name="mob" placeholder="MOBILE-NO." required> <br> <br>
                <input class="a" type="text" name="cityy" placeholder="TYPE YOUR CITY" required> <br> <br>
                <input class="a" type="tel"  name="markss" placeholder="ENTER 10+2 MARKS" required> <br> <br>
            <select class="a" name="abc" value="sd">
                 <option  disabled selected>SELECT COURSE:</option>
                <option>B.TECH</option>
                <option>M.TECH</option>
                <option>B.A.</option>
                <option>M.A.</option>
                <option>B.SC</option>
                <option>B.COM </option>
            </select> <br> <br>
            <div class="c"><select name="datee" value="df">
                <option disabled selected>SELECT DATE: </option>
                  <option>1</option>
                   <option>2</option>
                    <option>3</option>
                     <option>4</option>
                      <option>5</option>
                       <option>6</option>
                   <option>7</option>
                    <option>8</option>
                     <option>9</option>
                      <option>10</option>
                       <option>11</option>
                   <option>12</option>
                    <option>13</option>
                     <option>14</option>
                      <option>15</option>
                       <option>16</option>
                   <option>17</option>
                    <option>18</option>
                     <option>19</option>
                      <option>20</option>
                       <option>21</option>
                   <option>22</option>
                    <option>23</option>
                     <option>24</option>
                      <option>25</option>
                       <option>26</option>
                   <option>27</option>
                    <option>28</option>
                     <option>29</option>
                      <option>30</option>
                       <option>31</option>
                </select>
                <select name="monthe" value="fg">
                    <option disabled selected> SELECT MONTH: </OPTION>
                    <option>JANUARY </option>
                    <option> FEBRUARY</option>
                    <option>MARCH </option>
                    <option>APRIL </option>
                    <option>MAY </option>
                    <option>JUNE </option>
                    <option>JULY </option>
                    <option>AUGUST </option>
                    <option>SEPTEMBER </option>
                    <option>OCTOBER </option>
                    <option>NOVEMBER </option>
                    <option>DECEMBER </option>
                </select>
                <select name="yearr" value="hj">
                    <option disabled selected>SELECT YEAR </option>
                    <option>1980 </option>
                    <option> 1981</option>
                    <option> 1982</option>
                    <option>1983 </option>
                    <option>1984 </option>
                    <option> 1985</option>
                    <option>1986 </option>
                    <option> 1987</option>
                    <option>1988 </option>
                    <option>1989 </option>
                    <option> 1990</option>
                    <option>1991 </option>
                    <option>1992 </option>
                    <option>1993 </option>
                    <option>1994 </option>
                    <option> 1995</option>
                    <option> 1996</option>
                    <option> 1997</option>
                    <option>1998 </option>
                    <option>1999 </option>
                    <option> 2000</option>
                    <option> 2001</option>
                    <option>2002 </option>
                </select>
            </div>
            
            <br>
            <button type="submit" class="d"> APPLY NOW </button>
            </form>
        </div>
        </div>
    </body>
</html>
