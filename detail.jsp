<%-- 
    Document   : detail.jsp
    Created on : Oct 19, 2018, 7:15:29 PM
    Author     : daksh soni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
        <title>your data</title>
        <style>
            *
            {
                margin: 0;
                padding: 0;
            }
             .details
            {
                height: 550px;
            }
            center
            {
                height: 70px;
                background-color: #33ffcc;
                padding-top: 30px;
                font-family: Impact;
                font-size: 35px;
            }
              #name
            {
                
                font-family: Impact;
                font-size: 30px;
                
            }
           
            .record
            {
                height: 550px;
                background-color: #66ccff;
                padding-left: 420px;
                padding-top: 100px;
            }
            p
            {
                padding-top: 70px;
                font-family: Impact;
                font-size: 38px;
                padding-right: 22px;
            }
        </style>
    </head>
    <body>
        <div class="details">
            <center>!!&nbsp;&nbsp;YOUR  &nbsp; &nbsp; DETAILS&nbsp;&nbsp;   ARE&nbsp;&nbsp;!!</center>
            <div class="record">
 <%! 
     String name,email ,dob,gender,password;
     %>           
<%
    try
    {
name=request.getParameter("name");
email=request.getParameter("email");
dob=request.getParameter("dob");
gender=request.getParameter("option");
password=request.getParameter("password");
    }
    catch(Exception e)
    {}
%>
<table id="name">
    <tr>
        <td > YOUR NAME IS &nbsp; :</td>
        <td  >&nbsp;&nbsp;<%=name %></td>
    </tr>
    <tr>
        <td  >YOUR GMAIL ADDRESS IS &nbsp; :</td>
        <td>&nbsp;&nbsp;<%= email %></td>
        
    </tr>
    <tr>
        <td >YOUR DATE OF BIRTH IS &nbsp; :</td>
        <td>&nbsp;&nbsp;<%= dob %></td>
    </tr>
    <tr>
        <td >YOU ARE  &nbsp;:</td>
        
        <td>&nbsp;&nbsp;<%= gender %></td>
    </tr>
    <tr>
        <td >YOUR PASSWORD IS&nbsp;  :</td>
        <td>&nbsp;&nbsp;<%= password %></td>
    </tr>
</table>
    <br><br>
    <p>
        
        <%
        out.println("!! you are sucessfully Signup !!");
        
    %>
    </p>
            
    <br><br>
    NOW GO BACK TO <a href="index.html">home</a>
            </div>   
        </div>
    
    </body>
</html>
    