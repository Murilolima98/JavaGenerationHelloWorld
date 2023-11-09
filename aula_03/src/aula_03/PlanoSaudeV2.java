package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o seu nome");

		String nome = leia.nextLine();

		System.out.println("\n Faixas etárias :  ");
		System.out.println(" 1 - 0 a 10 anos");
		System.out.println(" 2 - 11 a 29 anos");
		System.out.println(" 3 - 30 a 45 anos");
		System.out.println(" 4 - 46 a 59 anos");
		System.out.println(" 5 - 60 a 65 anos");
		System.out.println(" 6 - Acima de 65 ");

		System.out.println("\n Digite a sua faixa etária ");

		int faixaIdade = leia.nextInt();

		switch (faixaIdade) {
		case 1:
			System.out.println(nome + " seu plano de saúde vai custar R$ 100,00");

			break;
		case 2:
			System.out.println(nome + " seu plano de saúde vai custar R$ 200,00");

			break;
		case 3:
			System.out.println(nome + " seu plano de saúde vai custar R$ 300,00");
			break;
		case 4:
			System.out.println(nome + " seu plano de saúde vai custar R$ 400,00");
			break;
		case 5:
			System.out.println(nome + " seu plano de saúde vai custar R$ 500,00");
			break;
		case 6:
			System.out.println(nome + " seu plano de saúde vai custar R$ 1000,00");
			break;

		default:
			System.out.println("Faixa etária inválida ");
		}
	}

}
