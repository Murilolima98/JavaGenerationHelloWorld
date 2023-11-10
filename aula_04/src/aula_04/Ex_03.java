package aula_04;

import java.util.Scanner;

public class Ex_03 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idadeMenor =0, idadeMaior=0, idade =0;
		
		while (idade >=0) {
		System.out.println("Digite uma idade");
		idade = leia.nextInt();
		
		if (idade >= 50)
			idadeMaior ++;
		
		if (idade < 21)
			idadeMenor ++;
			
		}	 
		
		System.out.println("Total de pessoas menores de 21 é : " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 é : " + idadeMaior);

		
		
	}


}
