package com.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/your_database";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ PostgreSQL 연결 성공!");
        } catch (SQLException e) {
            System.out.println("⛔ PostgreSQL 연결 실패: " + e.getMessage());
        }
        return conn;
    }    
}
