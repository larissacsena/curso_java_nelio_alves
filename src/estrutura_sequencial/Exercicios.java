package estrutura_sequencial;

import java.text.DecimalFormat;
import java.util.Locale;

public class Exercicios {
	public static void main(String[] args) {
		System.out.println(somar(-30, 10));
		System.out.println(calculaAreaCirculo(150.00));
		System.out.println(diferenca(5, 6, -7, 8));
		calculaSalario(25, 100, 5.50);
		valorPeca(12, 1, 5.30, 16, 2, 5.10);
		calculaAreas(3.0,4.0,5.2);
	}

	public static int somar(int x, int y) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		int resultado = x + y;
		return resultado;
	}

	public static String calculaAreaCirculo(double raio) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("####.0000");
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);
		String resultado = df.format(area);
		return resultado;
	}

	public static int diferenca(int a, int b, int c, int d) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */

		int resultado = a * b - c * d;
		return resultado;
	}

	public static double calculaSalario(int funcionario, double horas, double salario) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Double calculo = horas * salario;
		// ring resultado = "";
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", funcionario, calculo);
		return calculo;
	}

	public static double valorPeca(int cod1, int qtd1, double valor1, int cod2, int qtd2, double valor2) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */

		double preco1 = qtd1 * valor1;
		double preco2 = qtd2 * valor2;
		double resultado = preco1 + preco2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);
		return resultado;
	}

	public static double calculaAreas(double a, double b, double c) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */

		double pi = Math.PI;
		double triangulo = (a * c) / 2;
		double circulo = pi * Math.pow(c, 2);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a * b;
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangulo, circulo,trapezio,quadrado,retangulo);
		return triangulo;
	}

}
