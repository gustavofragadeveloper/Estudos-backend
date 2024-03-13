import java.util.Scanner;
public class AULA4 {
	public static void main(String[] args) {
		int distancia = 0;
		int tempo = 0;
		
		
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a distãncia em Km: ");
        distancia = input.nextInt();
        System.out.println("Digite a quantidade de horas do percuso: ");
        tempo = input.nextInt();
        
        System.out.println("VM: " +distancia/tempo);
        if(distancia/tempo > 120) {
        	System.out.println("multa");
        }
        
        
	}
}
