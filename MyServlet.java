/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class MyServlet extends HttpServlet
{
Connection con=null;
PreparedStatement pst=null;

   
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
  {
        response.setContentType("text/html;charset=UTF-8");
         
           PrintWriter out = response.getWriter();
            try
        {
         String name=request.getParameter("name");
         String email=request.getParameter("email");
         String dob=request.getParameter("dob");
         String option=request.getParameter("option");
         String password=request.getParameter("password");
         
         if(name.isEmpty() || email.isEmpty() || dob.isEmpty() || option.isEmpty() || password.isEmpty())
         {
         RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
         out.println("<font color=red><center>please fill all the fields<center></font>");
         rd.include(request,response);
         }
         else
         {
         
    try
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
    String query="insert into RECORDS values(?,?,?,?,?)";
    pst=con.prepareStatement(query);
    pst.setString(1, name);
    pst.setString(2, email);
    pst.setString(3, dob);
    pst.setString(4, option);
    pst.setString(5, password);
    pst.executeUpdate();
   
    
    pst.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e)
    {
        out.println("exception");
    }
    RequestDispatcher rd=request.getRequestDispatcher("detail.jsp");
            rd.forward(request,response);
         }
    }
        catch(Exception e)
        {
        out.println("exception in catch2");
        }
    }

    
}
