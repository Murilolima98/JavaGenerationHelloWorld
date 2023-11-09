package aula_03;

import java.util.Scanner;

public class Ex_04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;

		System.out.println("Digite a primeira palvra");
		palavra1 = leia.next();

		System.out.println("Digite a segunda palvra");
		palavra2 = leia.next();
		System.out.println("Digite a terceira palvra");
		palavra3 = leia.next();
		
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
			}else { 
				if (palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}else {
					System.out.println("homem");
				}
				
			}
				
			}
		} else {
			
			if (palavra2.equalsIgnoreCase("inseto")) {
				
				
			}else {
			
		}

	}

}
