package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a operação que deseja: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.print(": ");

		int opcao = scanner.nextInt();

		System.out.print("Digite o operandor 1: ");
		int operando1 = scanner.nextInt();

		System.out.print("Digite o operandor 2: ");
		int operando2 = scanner.nextInt();
		int resultado = 0;

		switch (opcao) {
		
			case 1:
				
				resultado = somar(operando1, operando2);
				
				break;
	
			case 2:		
				
				resultado = subtrair(operando1, operando2);
				
				break;
	
			case 3:
				
				resultado = multiplicar(operando1, operando2);
				
				break;
	
			case 4:
				
				resultado = dividir(operando1, operando2);
				
				break;
	
			default:
				System.out.println("Operador invalido!");
				break;
		}
		
		boolean resultadoValidado = validador(resultado);
		
		if (resultadoValidado) {
			System.out.println("O resultado é: " + resultado);
		} else {
			System.out.println("O resultado não é válido");
		}
		
		
		scanner.close();
	}

	private static int somar(int operando1, int operando2) {
		int resultado = operando1 + operando2;
		return resultado;
	}
	private static int subtrair(int operando1, int operando2) {
		int resultado = operando1 - operando2;
		return resultado;
	}
	private static int multiplicar(int operando1, int operando2) {
		int resultado = operando1 * operando2;
		return resultado;
	}
	private static int dividir(int operando1, int operando2) {
		int resultado = operando1 / operando2;
		return resultado;
	}
	private static boolean validador(int resultado) {
		
		return resultado < 300;
		
	}
}


