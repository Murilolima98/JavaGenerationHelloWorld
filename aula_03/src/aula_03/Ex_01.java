package aula_03;

import java.util.Scanner;

public class Ex_01 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro valor ");
		int valorUm = leia.nextInt();
		System.out.println("Digite o Segundo valor ");
		int valorDois = leia.nextInt();
		System.out.println("Digite o terceiro valor ");
		int valorTres = leia.nextInt();
		
		if (valorUm + valorDois > valorTres) {
			System.out.println("A soma dos dois primeiro são maiores que o terceiro ");
		}else {
			System.out.println("Não é maior que o terceiro ");
		}
			

		
	}

}
