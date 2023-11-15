package com.tech.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Your registration logic here (replace this with your actual logic)
        boolean isRegistered = registerUser(username, password);

        if (isRegistered) {
            // Redirect to the login page after successful registration
            response.sendRedirect("login.html");
        } else {
            // Redirect back to the registration page with an error message
            response.sendRedirect("register.html?error=failed");
        }
    }

    // Replace this method with your actual registration logic
    private boolean registerUser(String username, String password) {
        // Dummy registration logic
        // You would typically interact with a database to store user information
        return true;
    }
}