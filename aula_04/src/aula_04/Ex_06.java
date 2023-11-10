package aula_04;

import java.util.Scanner;

public class Ex_06 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int m3 = 0, valor, total=0;
		

		do {
			System.out.println("Digite um valor ");
			valor = leia.nextInt();
			if (valor %3 ==0 && valor != 0) {
				total ++;
				m3 += valor;
				
			}

		} while (valor != 0);
		
		double media =(total == 0) ? 0 : (double) m3 / total;
		System.out.println(" A média dos números múltiplos de 3 é:  " + media);

	}

}
