package aula_03;

import java.util.Scanner;

public class Ex_06 {
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Nome do colaborador");
		
		String nome = leia.nextLine();
		
		System.out.println("Digite o codigo do colaborador");
		int codigo = leia.nextInt();
		
		System.out.println("Digite o salario");
		float salario = leia.nextFloat();
		
		String cargo = "";
		float reajuste = 0;
		
		
		switch (codigo) {
		case 1 :
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
		case 2 :
			cargo = "Vendedor";
			reajuste = 0.7f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.9f;
			break;
		case 4 :
			cargo = "Motorista";
			reajuste = 0.6f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.5f;
			break;
		case 6 :
			cargo = "Técnico de TI";
			reajuste = 0.8f;
			break;
			default:
				System.out.println("Opção inválida");
				return;
			
		
		}
		
		float novoSal = salario + (salario * reajuste);
		System.out.println(nome + " "+ cargo );
		System.out.println("Salário " + novoSal);
		
	}

}
