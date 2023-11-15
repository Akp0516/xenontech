
package com.tech.servlet;

import com.tech.utils.DBUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;




@WebServlet("/contact")
public class ContactServlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String name = request.getParameter("name");
     String email = request.getParameter("email");
     String message = request.getParameter("message");

     // Save contact information to the database
     saveContactInfo(name, email, message);

     // Redirect to the thank you page
     response.sendRedirect("thankyou.html");
 }

 // Save contact information to the database (dummy method, replace with your logic)
 private void saveContactInfo(String name, String email, String message) {
     // Dummy save logic
     // In a real application, you would typically store the contact information in a database
 }
}
