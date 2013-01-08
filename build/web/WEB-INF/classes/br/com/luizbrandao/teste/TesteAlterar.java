package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;

public class TesteAlterar {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		Contato contato = new Contato();
		
		System.out.println("Nome: ");
		contato.setNome(teclado.nextLine());
		
		System.out.println("Email: ");
		contato.setEmail(teclado.nextLine());
		
		System.out.println("Endereço: ");
		contato.setEndereco(teclado.nextLine());
		
		System.out.println("ID: ");
		contato.setId(Long.parseLong(teclado.nextLine()));
		
		ContatoDAO dao = new ContatoDAO();
		dao.alterar(contato);
		
		System.out.println("Gravado!");
	}
}