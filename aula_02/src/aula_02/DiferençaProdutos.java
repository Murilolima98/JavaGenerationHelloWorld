package aula_02;

import java.util.Scanner;

public class DiferençaProdutos {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite o numero 1");
		int numUm = leia.nextInt();
		System.out.println("Digite o numero 2");
		int numDois = leia.nextInt();

		System.out.println("Digite o numero 3");
		int numTres = leia.nextInt();

		System.out.println("Digite o numero 4");
		int numQuatro = leia.nextInt();

		
		
		 int calculo = (numUm * numDois) - (numTres * numQuatro);
		 
		 System.out.println(calculo);
		
		
	}

	

}
