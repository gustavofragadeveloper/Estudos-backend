package exercicios;

import java.util.Scanner;

public class Ex8_if_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um número e direi se é positivo ou negativo: ");
		int x = sc.nextInt();

		if (x >= 0) {
			
			System.out.println("O Número digitado é Positivo");
			
		}
		else {
			
			System.out.println("O Número digitado é Negativo");
		}
		
			
		sc.close();
		
		
		
		
	}

}
