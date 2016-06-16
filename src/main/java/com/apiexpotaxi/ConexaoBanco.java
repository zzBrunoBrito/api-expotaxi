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
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class ConexaoBanco {

    private static PreparedStatement insertPessoa = null;

    private static Connection getConnection() { //throws URISyntaxException, SQLException {
        try {
            String dbUrl = "jdbc:postgresql://ec2-54-83-27-147.compute-1.amazonaws.com:5432/d1o8bcicho5jj?user=wrzjrwpjsawilf&password=2v9spjkBPlIxnmF2d8cgn80Sgn&sslmode=require";
            return DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void insert(int id, String nome) {
        try {
            Connection connection = null;
            connection = ConexaoBanco.getConnection();
            insertPessoa = connection.prepareStatement("INSERT INTO pessoa (id, nome) VALUES (?, ?)");
            insertPessoa.setInt(1, id);
            insertPessoa.setString(2, nome);
            insertPessoa.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insert(2, "bruno");
    }

}
