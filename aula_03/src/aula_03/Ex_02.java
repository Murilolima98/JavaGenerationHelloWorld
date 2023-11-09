package aula_03;

import java.util.Scanner;

public class Ex_02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite um número!");
		int numero = leia.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.println("Se numero é par e positivo");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Seu numero é par e negativo");
		}else if (numero % 2 !=0 && numero > 0) {
			System.out.println("Seu número é impar e positivo");
		}else {
			System.out.println("Seu número é impar e negativo");
		}

	}

}
