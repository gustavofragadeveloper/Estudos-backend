import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("Digite o 1º número: ");
		num1 = leitura.nextInt();		
		System.out.println("Digite o 2º número: ");
		num2 = leitura.nextInt();	
		System.out.println("Digite o 3º número: ");
		num3 = leitura.nextInt();		
		
		System.out.println("Multiplicação: "+num1*num2*num3);
		System.out.println("Média: "+(num1+num2+num3)/3);
		System.out.println("Resto "+num1%num2);
		
		leitura.close();	
	}

}
