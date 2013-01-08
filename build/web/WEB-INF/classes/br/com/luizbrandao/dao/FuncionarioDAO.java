package br.com.luizbrandao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.luizbrandao.jdbc.ConnectionFactory;
import br.com.luizbrandao.modelo.Funcionario;

public class FuncionarioDAO {

	private Connection connection;

	public FuncionarioDAO() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}

	public void adiciona(Funcionario funcionario) throws SQLException {
		String sql = "insert into funcionario (nome,senha) values (?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, funcionario.getNome());
		stmt.setString(2, funcionario.getSenha());

		stmt.execute();
		stmt.close();
	}

	public List<Funcionario> pesquisar() throws SQLException {
		List<Funcionario> funcionario = new ArrayList();

		String sql = "select nome senha from funcionarios";

		PreparedStatement stmt = this.connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Funcionario func = new Funcionario();
			func.setNome(rs.getString("nome"));
			func.setSenha(rs.getString("senha"));
			func.add(func);
		}
		rs.close();
		stmt.close();
		return funcionario;
	}
}