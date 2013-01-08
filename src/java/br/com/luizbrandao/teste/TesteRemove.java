package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;

public class TesteRemove {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		Contato contato = new Contato();
		
		System.out.println("Digite a Id do contato a ser removido: ");
		contato.setId(Long.parseLong(teclado.nextLine()));
		
		ContatoDAO dao = new ContatoDAO();
		dao.remover(contato);
		
		System.out.println("Usuario removido com sucesso!");
	}
}