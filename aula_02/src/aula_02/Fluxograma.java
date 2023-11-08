package aula_02;

import java.util.Scanner;

public class Fluxograma {
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite seu salário");
		
		int salario = leia.nextInt();
		
		System.out.println("Digite seu abono");
		
		int abono = leia.nextInt();
		
		int novoSalario = salario + abono;
		
		System.out.println("Seu novo salário é " + novoSalario);

	}

}
