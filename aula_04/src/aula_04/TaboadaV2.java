package aula_04;

import java.util.Scanner;

public class TaboadaV2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero,contador = 1;
		
		System.out.println("Digite um númro ");
		
		numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.println(numero + " x " + contador + " = " +  (numero * contador));
			contador ++;
		}
		
	}

}
