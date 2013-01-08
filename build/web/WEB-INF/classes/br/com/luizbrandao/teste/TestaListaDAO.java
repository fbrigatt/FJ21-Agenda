package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;

public class TestaListaDAO {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos){
			System.out.println("Nome: "+contato.getNome());
			System.out.println("Email: "+contato.getEmail());
			System.out.println("Endereço "+contato.getEndereco());
			System.out.println("Data de Nascimento "+contato.getDataNascimento().getTime()+ "\n");
		}
	}
}