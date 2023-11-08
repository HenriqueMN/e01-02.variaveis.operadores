package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Programa que lê quatro números floats e retorna a diferença entre o produto de n1 e n2 e o produto de n3 e n4
		
		// Criação das variáveis e do Scanner
		float n1, n2, n3, n4;
		
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Insira o primeiro número: ");
		n1 = input.nextFloat();
		
		System.out.print("Insira o segundo número: ");
		n2 = input.nextFloat();
		
		System.out.print("Insira o terceiro número: ");
		n3 = input.nextFloat();
		
		System.out.print("Insira o quarto número: ");
		n4 = input.nextFloat();
		
		// Exibindo o cálculo da diferença
		System.out.print("\nDiferença: " + ((n1*n2)-(n3*n4)));
	}

}
