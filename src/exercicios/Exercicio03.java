package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Programa que lê o salário bruto, o adicional noturno, as horas extras e os descontos e retorna o salário líquido
		
		// Criação das variáveis e do Scanner
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner input = new Scanner(System.in);
		
		// Leitura dos inputs
		System.out.print("Insira o salário bruto: ");
		salarioBruto = input.nextFloat();
		
		System.out.print("Insira o adicional noturno: ");
		adicionalNoturno = input.nextFloat();
		
		System.out.print("Insira as horas extras: ");
		horasExtras = input.nextFloat();
		
		System.out.print("Insira os descontos: ");
		descontos = input.nextFloat();
		
		// Cálculo do salário líquido
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// Exibindo o salário líquido
		System.out.println("\nSalário líquido: " + salarioLiquido);
	}

}
