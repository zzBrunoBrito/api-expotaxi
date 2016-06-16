/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiexpotaxi.dao;

import com.apiexpotaxi.model.Endereco;
import com.apiexpotaxi.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class UsuarioDao {

    private static PreparedStatement insertPessoa = null;

    private static void insert(Usuario usuario) {
        try {
            Connection connection = null;
            connection = ConexaoBanco.getConnection();
            insertPessoa = connection.prepareStatement("INSERT INTO usuario (nome, idade, sexo, endereco, login, senha) VALUES (?, ?, ?, ?, ?, ?)");
            insertPessoa.setString(1, usuario.getNome());
            insertPessoa.setInt(2, usuario.getIdade());
            insertPessoa.setString(3, usuario.getSexo());
            insertPessoa.setObject(4, usuario.getEndereco());
            insertPessoa.setString(5, usuario.getLogin());
            insertPessoa.setString(6, usuario.getSenha());
            insertPessoa.executeUpdate();
            ConexaoBanco.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<Usuario>  listAll() {
        ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
        try {
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet resultSet = null;

            conn = ConexaoBanco.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM usuario");
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getInt("idade"),
                        resultSet.getString("sexo"),
                        resultSet.getString("login"),
                        resultSet.getString("senha"),
                        (Endereco) resultSet.getObject("endereco"));
                listaUsuario.add(usuario);
            }
            ConexaoBanco.closeConnection(conn);
        } catch (Exception e) {

        }
        return listaUsuario;
    }
}
