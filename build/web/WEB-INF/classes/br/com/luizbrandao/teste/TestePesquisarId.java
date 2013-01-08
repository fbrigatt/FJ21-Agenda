package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;

public class TestePesquisarId {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.pesquisar();
		
		for (Contato contato : contatos){
			System.out.println("Id: "+contato.getId());
			
		}
	}

}
