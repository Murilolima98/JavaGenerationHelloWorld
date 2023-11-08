package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro valor");
		
		double numUm = sc.nextDouble();
		
		System.out.println("Digite o segundo valor ");
		
		double numDois = sc.nextDouble();
		
		System.out.println("Soma " + (numDois + numUm));
		System.out.println("Subtração " + (numDois - numUm));
		System.out.println("Divisão " + (numDois / numUm));
		System.out.println("Multiplicação " + (numDois * numUm));
		System.out.println("Módulo do numero 1 :" + numUm % 2);
		System.out.println("Módulo do numero 2 :" + numDois % 2);

		System.out.println("Raiz quadrada do numero 1" + (Math.sqrt(numUm)) );
		System.out.println("Raiz quadrada do numero 2" + (Math.sqrt(numDois)) );

		System.out.println("Potenciação do numero 1 pelo numero 2" + (Math.pow(numUm, numDois)));

		

	}

}
