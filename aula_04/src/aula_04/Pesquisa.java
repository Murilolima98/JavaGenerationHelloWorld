package aula_04;

import java.util.Scanner;

public class Pesquisa {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idade,esporte,futebol=0,voleiM18 =0, basquetMen18=0, outros=0;
		
		String cont = "S";
		
		while (cont.equalsIgnoreCase("S")) {
			System.out.println("Digite sua idade : ");
			idade = leia.nextInt();
			do {
				System.out.println("Digite seu esporte favorito (1-Futebol/2-Volei/3-Basquete/4-Outros: )");
				esporte = leia.nextInt();
			} while (esporte < 1 || esporte > 4 );
			
			if(esporte == 1)
				futebol++;
			
			if (esporte == 2 && idade >18)
				voleiM18 ++;
			
			if (esporte == 3 && idade < 18 )
				basquetMen18++;
			
			if (esporte == 4)
				outros++;
			
			System.out.println("Deseja continuar ? (S/N)");
			cont = leia.next() .toUpperCase();
			
			
		}
		
		System.out.println("total de pessoas que gostam de futebol : " + futebol);
		System.out.println("total de pessoas que gostam de volei e são maiores de 18 anos :  " + voleiM18);
		System.out.println("total de pessoas que gostam de basquete e são menores de 18 anos : " + basquetMen18);
		System.out.println("total de pessoas que gostam de outros esportes : " + outros);



	}

}
