package exercicio02;

import java.util.Scanner;


public class Cadastro {
	
	public static boolean validarSenha(String senha) {
		if(senha.length() < 6 || senha.isBlank() || senha.isEmpty()) {
			return false;			
		}	
		boolean numero = false;
		boolean minusculo = false;
		boolean maiusculo = false;
		boolean caracter = false;
		
		for(char s: senha.toCharArray()) {
			if (s >= '0' && s <= '9') {
	             numero = true;
	         } else if (s >= 'A' && s <= 'Z') {
	             maiusculo = true;
	         } else if (s >= 'a' && s <= 'z') {
	             minusculo = true;
	         } else {
	             caracter = true;
	         }
		}
		return numero && maiusculo && minusculo && caracter;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("Digite um nome: ");
		String nome = leitor.next();
		
		System.out.println("Digite uma senha: ");
		String senha = leitor.next();
		
		if (!validarSenha(senha)) {
			System.out.println(6 - senha.length());
		}
	}
}
