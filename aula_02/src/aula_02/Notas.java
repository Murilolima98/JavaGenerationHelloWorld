package aula_02;

import java.util.Scanner;

public class Notas {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite sua nota 1");
		int notaUm = leia.nextInt();
		System.out.println("Digite sua nota 2");
		int notaDois = leia.nextInt();

		System.out.println("Digite sua nota 3");
		int notaTres = leia.nextInt();

		System.out.println("Digite sua nota 4");
		int notaQuatro = leia.nextInt();
		
		 int media = (notaUm+notaDois+notaTres+notaQuatro)/4;
		 
		 System.out.println("Sua média é " + media);
		


	}

}
