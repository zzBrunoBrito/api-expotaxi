/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiexpotaxi.dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class ConexaoBanco {

    public static Connection getConnection() { //throws URISyntaxException, SQLException {
        try {
            String dbUrl = "jdbc:postgresql://ec2-54-83-27-147.compute-1.amazonaws.com:5432/d1o8bcicho5jj?user=wrzjrwpjsawilf&password=2v9spjkBPlIxnmF2d8cgn80Sgn&?sslmode=require&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
            return DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//Fecha conexão com banco

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Fechada a conexão com o banco de dados.");
            }

        } catch (Exception erro) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados " + erro.getMessage());
        }
    }

    //Fecha conexão com banco
    public static void closeConnection(Connection connection, Statement statement) {
        try {
            if (connection != null) {
                closeConnection(connection);
            }
            if (statement != null) {
                statement.close();
                System.out.println("Statement fechado com sucesso.");
            }
        } catch (Exception erro) {
            System.out.println("Não foi possível fechar o statement.");
        }
    }

    //Fecha conexão com banco
    public static void closeConnection(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (connection != null || statement != null) {
                closeConnection(connection, statement);
            }
            if (resultSet != null) {
                resultSet.close();
                System.out.println("ResultSet fechado com sucesso");
            }
        } catch (Exception erro) {
            System.out.println("Não foi possível fechar o ResultSet");
        }
    }
}
