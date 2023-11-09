package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o seu nome");
		
		String nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade ");
		
		int idade = leia.nextInt();
		
		if (idade > 0 && idade <= 10 ) {
			System.out.println(nome + " seu plano de saúde vai custar R$ 100,00");
			
		} else if (idade > 10 && idade <= 29) {
			System.out.println(nome + " seu plano de saúde vai custar R$ 200,00");

		}else if (idade > 29 && idade <= 45) {
			System.out.println(nome + " seu plano de saúde vai custar R$ 300,00");

		}else if (idade > 45 && idade <= 59) {
			System.out.println(nome + " seu plano de saúde vai custar R$ 400,00");

		}else if (idade > 59 && idade <= 65) {
			System.out.println(nome + " seu plano de saúde vai custar R$ 500,00");

		}else  {
			System.out.println(nome + " seu plano de saúde vai custar R$ 1000,00");

		}
		
		leia.close();
	}

}
