package com.tech.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//DBUtil.java

public class DBUtil {
 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
 private static final String USERNAME = "your_username";
 private static final String PASSWORD = "your_password";

 public static Connection getConnection() {
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
     } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
         throw new RuntimeException("Failed to establish a database connection");
     }
 }
}


