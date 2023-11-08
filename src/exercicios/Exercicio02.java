package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Um programa que recebe 4 notas de um participante em variáveis do tipo float e calcula e exibe a média final dele
		
		// Criação das variáveis e do scanner
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		
		System.out.print("Digite a primeira nota: ");
		nota1 = input.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = input.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = input.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = input.nextFloat();
		
		// Cálculo da média final
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		// Exibição da média
		System.out.print("\nMédia final: " + mediaFinal);		
		
		

	}

}
