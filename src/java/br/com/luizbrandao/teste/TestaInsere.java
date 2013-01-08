package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;

public class TestaInsere {
	public static void main(String[] args) throws SQLException{
		
		Scanner teclado = new Scanner(System.in);
	
		Contato contato = new Contato();
		
		System.out.println("Nome: ");
		contato.setNome(teclado.nextLine());
		
		System.out.println("Email: ");
		contato.setEmail(teclado.nextLine());
		
		System.out.println("Endereço: ");
		contato.setEndereco(teclado.nextLine());
		
		System.out.println("Data de Nascimento: ");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}