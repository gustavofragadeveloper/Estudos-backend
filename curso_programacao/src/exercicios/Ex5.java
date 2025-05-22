package exercicios;

import java.util.Locale;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numFuncionario = sc.nextInt();

		int horaTrabalhada = sc.nextInt();

		double valorHoraTrabalhada = sc.nextDouble();

		double salario = horaTrabalhada * valorHoraTrabalhada; 

		System.out.println("NUMBER = " + numFuncionario);

		System.out.printf("SALARY = U$ %.2f%n", salario);



		sc.close();




	}

}
