package aulas;

import java.util.Scanner;

public class aula_scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		System.out.println("Vc digitou: " + x);
		
		sc.close();
	}

}
