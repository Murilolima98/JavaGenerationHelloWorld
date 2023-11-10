package aula_04;

import java.util.Scanner;

public class Ex_02 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int totalP = 0;
		int totalI = 0;

		System.out.println("Digite os valores ");

		for (int i = 0; i <= 9; i++) {
			System.out.println("Número " + (i + 1) + " : ");
			int numero = leia.nextInt();
			if (numero % 2 == 0) {
				totalP ++;
			} else
				totalI ++;
		}
		
		System.out.println("A soma de número pares é " + totalP);
		System.out.println("A soma de número ímpares é " + totalI);


	}

}
