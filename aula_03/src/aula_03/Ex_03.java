package aula_03;

import java.util.Scanner;

public class Ex_03 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite seu nome");
		String nome = leia.nextLine();
		
		System.out.println("Digite sua idade ");
		int idade = leia.nextInt();
		
		if (idade >= 18 && idade <= 59) {
			System.out.printf("%s esta apto a doar sangue",nome);
		}else if (idade >= 60 && idade <=69) {
			System.out.println("É sua primeira doação?");
			boolean doar = leia.nextBoolean();
			if (doar == true) {
				System.out.printf("%s não esta apto a doar sangue",nome);
			}else {
				System.out.printf("%s esta apto a doar sangue",nome);
			}
		}else {
			System.out.printf("%s não esta apto para doar sangue",nome);
		}
		
		
	}

}
