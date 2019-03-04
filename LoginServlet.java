/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

 
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        PrintWriter out;
        out = response.getWriter();
      try
    {
      String name=request.getParameter("name");
      String password=request.getParameter("password");
      if(name.isEmpty()||password.isEmpty())
      {
      RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
         out.println("<font color=red><center>please fill all the fields<center></font>");
         rd.include(request,response);
      }
      else
      {
      Class.forName("oracle.jdbc.driver.OracleDriver");
          try 
          {
              Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr"); 
              PreparedStatement pst = con.prepareStatement("select * from RECORDS where NAME=? and PASSWORD=? ");
          
              pst.setString(1, name);
              pst.setString(2, password);
              
              ResultSet rs=pst.executeQuery();
              while(rs.next())
              {
                  response.sendRedirect("sucess.html");
                  return;
              }
              response.sendRedirect("error.html");
          }
          catch(Exception e)
          {
          e.printStackTrace();
          }
      }
      }
      catch(Exception e)
      {
      e.printStackTrace();
      }
   }

}
