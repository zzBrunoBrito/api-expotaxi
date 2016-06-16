/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiexpotaxi;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class ConexaoBanco {

    private static Connection getConnection() { //throws URISyntaxException, SQLException {
        try {
            String dbUrl = System.getenv("JDBC_DATABASE_URL");
            return DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        //a conexão é feita e é passa pra variavel conn;
        Connection conn = getConnection();
    }

}
