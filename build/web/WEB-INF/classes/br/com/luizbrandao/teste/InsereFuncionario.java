package br.com.luizbrandao.teste;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.luizbrandao.dao.FuncionarioDAO;
import br.com.luizbrandao.modelo.Funcionario;


public class InsereFuncionario {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		Funcionario contato = new Funcionario();
		
		System.out.println("Nome: ");
		contato.setNome(teclado.nextLine());
		
		System.out.println("Senha: ");
		contato.setSenha(teclado.nextLine());
			
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.adiciona(contato);
		
		System.out.println("Gravado!");
	}
}