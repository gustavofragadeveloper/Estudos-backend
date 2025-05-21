import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		
		int num_1 = 10;
		int num_2 = 20;
		double num_3 = 12.34567;
		String nome = "Gustavo";
		int idade = 20; 
		double salario = 4500.00; 
		
		System.out.println(num_1 + num_2);
		System.out.println(num_3);
		System.out.printf("%.2f%n", num_3);
		System.out.printf("%.4f%n",num_3);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",num_3);
		System.out.println("Resultado = " + num_3 +  " metros!" );
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês%n", nome, idade, salario );
	
	}
	
	
	

}
