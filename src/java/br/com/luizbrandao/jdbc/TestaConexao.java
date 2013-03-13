package br.com.luizbrandao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionFactory.getConnection();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}