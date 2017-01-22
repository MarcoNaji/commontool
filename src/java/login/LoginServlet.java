/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Author Java2db.com
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    int user_ID_from_DB ;
    String user_name_from_DB = "";
    String user_password_from_DB = "";
    Connection connection = null;
    Statement querySmt = null;
    ResultSet result = null;
    HttpSession session;
 
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
                session = request.getSession(true);
		session.setAttribute("user_id", null);
                session.setAttribute("user_name", null);
		session.invalidate();
                response.sendRedirect("index.jsp");
        // TODO Auto-generated method stub
    }
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String user_name = request.getParameter("username").trim();
        String password = request.getParameter("pass").trim();
        // Database operations using JDBC
        
        try {
            
 
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ontology";
            connection = DriverManager.getConnection(url, "root",
                    "");
            if (connection.equals(null)) {
                System.out.println("connection was failed");
            } else {
 
                System.out.println("connected successfully");
                // Select user from database to check user login id and password
                querySmt = connection.createStatement();
                result = querySmt
                        .executeQuery("select * from domain_expert where username = '"+ user_name + "'");
                if (!result.equals(null)) {
 
                    while (result.next()) {
                        user_ID_from_DB = result.getInt("id");
                        user_name_from_DB = result.getString("username").trim();
                        user_password_from_DB = result.getString("password")
                                .trim();
                        System.out.println(user_name_from_DB + " "
                                + user_password_from_DB);
                    }
                    // Database operations completed
                    request.getSession().removeAttribute("errorMessage");
                    if (user_name.isEmpty() || password.isEmpty()){
           request.getSession().setAttribute("errorMessage", "Blank Fields Detected!.");
           response.sendRedirect(request.getHeader("Referer"));  
        }
                    else if (user_name.equals(user_name_from_DB)
                            && password.equals(user_password_from_DB)) {
                        session = request.getSession(true);
                        session.setAttribute("user_id", user_ID_from_DB);
                        session.setAttribute("user_name", user_name_from_DB);
                        //session.setMaxInactiveInterval(30);
                        response.sendRedirect("HomeServlet");
                    } else {
                        request.getSession().setAttribute("errorMessage", "Wrong username/password.");
                        response.sendRedirect(request.getHeader("Referer"));
                    }
                } else {
                    request.getRequestDispatcher("/fail.jsp").forward(request,
                            response);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                result.close();
                querySmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
    }
 
}
