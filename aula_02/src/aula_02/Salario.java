package aula_02;

import java.util.Scanner;

public class Salario {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite seu Salario ");
		
		int salario = leia.nextInt();
		
		System.out.println("Digite o adicional Noturno");
		int addNoturno = leia.nextInt();
		
		System.out.println("Digite as horas extras");
		int extra = leia.nextInt();
		
		int desconto = 200;
		
		int salarioLiq = (salario + addNoturno + (extra *5) - desconto);
		
		System.out.println( "Seu salário líquido é de : "+salarioLiq);
		
		
	}

	

}
