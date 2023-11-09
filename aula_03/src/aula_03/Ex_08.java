package aula_03;

import java.util.Scanner;

public class Ex_08 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		float valor , saldo =1000.00f;
		int ope;
		
		System.out.println("1 - saldo");
		System.out.println("2 - saque");
		System.out.println("3 - depósito");
		
		ope = leia.nextInt();	
		
		
		switch (ope) {
		case 1 :
			System.out.println("saldo " + saldo);
			
			break;
		case 2:
			System.out.println("informe o valor do saque");
			valor = leia.nextFloat();
			if (saldo > valor ) {
				System.out.println("O novo saldo é " + (saldo - valor));
			}else 
				System.out.println("Saldo insuficiente");
			break;
		case 3:
			System.out.println("informe o valor do depósito");
			valor = leia.nextFloat();
			System.out.println("O nvo saldo é " + (saldo +valor));
			
			break;
			
			default:
				System.out.println("Operação inválida");
				
			
		}


	}


}
