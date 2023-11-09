package aula_03;

import java.util.Scanner;

public class Ex_07 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o primeiro valor ");
		double numUm = leia.nextInt();
		
		System.out.println("Digite o segundo valor");
		int numDois = leia.nextInt();
		
		System.out.println("digite a operação");
		int operacao = leia.nextInt();
		
		 double resultado = 0;
		 
		switch (operacao) {
		case 1:
			resultado = numUm + numDois;
			break;
		case 2:
		 resultado = numUm - numDois;
			break;
		case 3:
			if (numDois != 0) {
				resultado = numUm / numDois;
			}else {
				System.out.println("Divisão por zero");
			}
			break;
		case 4:
			resultado = numUm * numDois;
				break;
			default:
				System.out.println("Opção invalida");
			return;
		}
		
		System.out.println("Rsultado é : " + resultado );
	}

}
