package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Um programa que recebe um valor de salário, um valor de abono e soma o abono ao salário retornando um novo salário
		
		// Criação das variáveis e do Scanner
		float salario, abono, novoSalario;
		
		Scanner input = new Scanner(System.in);
		
		// Recebimento dos inputs
		System.out.print("Digite o salário: ");
		salario = input.nextFloat();
		
		System.out.print("\nDigite o abono: ");
		abono = input.nextFloat();
		
		// Cálculo do novo salario
		novoSalario = salario + abono;
		
		// Exibe o novo salario
		System.out.println("\nNovo salário: " + novoSalario);

	}

}
