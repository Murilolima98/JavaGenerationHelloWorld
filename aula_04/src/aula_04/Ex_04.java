package aula_04;

import java.util.Scanner;

public class Ex_04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, mC = 0, hC = 0, nB = 0, mT = 0, hT = 0, outros = 0, back = 0, front = 0, mob = 0, fS = 0, somaIdade = 0,
				totalPes = 0;

		String continuar = "S";

		while (continuar.equalsIgnoreCase("S")) {
			System.out.println("Digite sua idade");
			idade = leia.nextInt();
			somaIdade += idade;
			
			System.out.println("Escolha sua identidade de gênero \n 1- Mulher Cis\n2- Homem Cis \n 3 - Mulher Trans"
					+ " \n 4 - Homem Trans\n 5 - Não Binarios \n 6 - Outros");
			int genero = leia.nextInt();

			System.out.println("Escolha o seu cargo Dev \n 1- Backend \n2 - Frontend \n 3 - Mobile \n4 -FullStack ");
			int cargo = leia.nextInt();

			totalPes++;

			if (cargo == 1)
				back++;

			else if ((genero == 1 || genero == 3) && cargo == 2) {
				mC++;
				mT++;
				front++;
			} else if ((genero == 2 || genero == 4) && cargo == 3 && idade > 40) {
				hC++;
				hT++;
				mob++;
			} else if (genero == 5 && cargo == 4 && idade < 30) {
				nB++;
				fS++;
			}

			System.out.println("Deseja continuar? (S/N)");
			continuar = leia.next();

		}

		double media = somaIdade / totalPes;
		
		System.out.println("O número de pessoas desenvolvedoras Backend é :" + back);
		System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend são de : " + mC + mT + front);
		System.out.println(
				"O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos são de : " + (hC + hT + mob));
		System.out
				.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos são de :" + (nB + fS));
		System.out.println("O número total de pessoas que responderam à pesquisa : " + totalPes);
		System.out.println("A média de idade das pessoas que responderam à pesquisa : " + media);

	}

}
