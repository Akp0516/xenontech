package com.tech.servlet;

import com.tech.utils.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//LoginServlet.java


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String username = request.getParameter("username");
     String password = request.getParameter("password");

     // Validate credentials
     boolean isValidUser = validateUser(username, password);

     if (isValidUser) {
         // Set a session attribute to mark the user as logged in
         HttpSession session = request.getSession();
         session.setAttribute("loggedInUser", username);

         // Redirect to the home page
         response.sendRedirect("index.html");
     } else {
         // Redirect back to the login page with an error message
         response.sendRedirect("login.html?error=invalid");
     }
 }

 // Validate user credentials (dummy method, replace with your authentication logic)
 private boolean validateUser(String username, String password) {
     // Dummy authentication logic
     return "admin".equals(username) && "admin@123".equals(password);
 }
}
