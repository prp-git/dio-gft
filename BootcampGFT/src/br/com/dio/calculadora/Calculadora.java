package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int diferenca = diferenca(a,b);
		int produto = produto(a,b);
		double divisao = divisao(a,b);
		
		
		System.out.println("soma: " + soma);
		System.out.println("diferenca= " + diferenca);
		System.out.println("produto= " + produto);
		System.out.println("divisao= " + divisao);
		
	}

	public static int soma (int a, int b) {
		return a + b;
	}
	public static int diferenca (int a, int b) {
		return a - b;
	}
	public static int produto (int a, int b) {
		return a * b;
	}
	public static int divisao (int a, int b) {
		return a / b;
	}
}
