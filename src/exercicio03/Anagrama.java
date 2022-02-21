package exercicio03;

import java.util.Scanner;

public class Anagrama {
	
	public static void isAnagrama(String palavra) {
		int n = 0;
         if(palavra.length() > 1) {		
			for (int i = 0; i < palavra.length(); i++) {
				String depois = palavra.substring(i, i + 1);
				isAnagrama( depois);
				n++;
			}
	     	System.out.println(""+n);
		}
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = leitor.nextLine();	
		isAnagrama(palavra);
	}
}
