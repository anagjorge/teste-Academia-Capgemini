package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		List<String> lista = new ArrayList<>();

		System.out.println("Digite um número");
		int n = leitor.nextInt();

		for (int i = 0; i < n; i++) {
			lista.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}
		for (String j : lista) {
			System.out.println(j);
		}
	}
}
