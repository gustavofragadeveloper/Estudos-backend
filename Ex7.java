package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();


		double triangulo = (a * c) / 2;
		double circulo = 3.14159 * (c = Math.pow(c, 2.0));
		double trapezio = ((a + b) * c) / 2;
		double quadrado = (b = Math.pow(b, 2.0));
		double retangulo = a * b;


		System.out.printf("Triângulo = %.2f%n", triangulo);
		System.out.printf("Circulo = %.2f%n", circulo);
		System.out.printf("Trapézio = %.2f%n", trapezio);
		System.out.printf("Quadrado = %.2f%n", quadrado);
		System.out.printf("Retângulo = %.2f%n", retangulo);

 

		sc.close();

		
	}

}