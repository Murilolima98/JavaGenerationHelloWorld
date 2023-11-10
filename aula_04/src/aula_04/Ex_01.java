package aula_04;

import java.util.Scanner;

public class Ex_01 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numUm, numDois;

		System.out.println("Digite o primeiro valor");
		numUm = leia.nextInt();

		System.out.println("Digite o segundo valor ");
		numDois = leia.nextInt();
		if (numUm > numDois) {
			System.out.println("Intervalo invalido");
		}
		for (int i = numUm; i <= numDois; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e 5 ");
			}

		}
	}

}
