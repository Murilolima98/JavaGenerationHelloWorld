package aula_04;

import java.util.Scanner;

public class Ex_05 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int valor;
		int somPosi = 0;

		do {
			System.out.println("Digite um valor ");
			valor = leia.nextInt();

			if (valor > 0) {
				somPosi += valor;
			}

		} while (valor != 0);

		System.out.println(" A soma dos números positivos :" + somPosi);

	}

}
