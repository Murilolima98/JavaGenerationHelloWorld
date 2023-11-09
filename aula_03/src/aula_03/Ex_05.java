package aula_03;

import java.util.Scanner;

public class Ex_05 {
	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("1- Cachorro Quente - R$ 10.00");
		System.out.println("2-X-Salada - R$ 15.00 ");
		System.out.println("3-X-Bacon - R$ 18.00");
		System.out.println("4-Bauru - R$ 12.00");
		System.out.println("5-Refrigerante - R$ 8.00");
		System.out.println("6-Suco de laranja - R$ 13.00");
		
		System.out.println("\n\nDigite o item de sua escolha ");
		int opc = leia.nextInt();
		
		System.out.println("\n\ndigite a quantidade de itens");
		int qtd = leia.nextInt();
		
		String produto = " ";
		double preco =0;
		
		switch (opc) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10;
			break;
		case 2:
			produto = "X-Salada ";
			preco= 15;
			break;
		case 3:
			produto = "X-Bacon";
			preco= 18;
			break;
		case 4:
			produto = "Bauru";
			preco= 12;
			break;
		case 5:
			produto = "Refrigerante";
			 preco = 8;
			 break;
		case 6:
			produto= "Suco de laranja";
			preco = 13;
			default:
				System.out.println("Opção invalída");
				return;
				
		}
		double total = preco * qtd;
		
		System.out.println("Produto :" + produto);
		System.out.println( " O valor total foi de R$"+total);
	}


}
