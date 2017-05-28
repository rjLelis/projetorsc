/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;

/**
 *
 * @author Lelis
 */
public class ModuloConexao {

    // Método responsavel por estabelecer a conexão com o banco
    public static Connection conector() {

        Connection conexao;

        String driver = "com.mysql.jdbc.Driver";// Driver
        // Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/db_projetobd?verifyServerCertificate=false&useSSL=true";//Caminho do banco
        String user = "root";//Usuário
        String password = "";//Senha(geralmente vazia)
        // Estabelecendo a conexão com o banco 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            //System.out.println(e);// <-- Serve de apoio para esclarecer o erro
            return null;
        }
    }
}