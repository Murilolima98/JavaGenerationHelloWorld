package aula_02;

import java.util.Scanner;

public class Operadores {
	
	 static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numeroUm = 10;
		int numeroDois = 20;
		String valorUm = "2";
		String valorDois = "3";
		
		float media = 2.45987f;
		
		System.out.println("A soma dos dois números são de : " + (numeroUm + numeroDois));
		System.out.println("A soma dos dois valores são de : " + valorUm + valorDois);
		
		System.out.printf("A média é de %.2f", media );

	}

}
