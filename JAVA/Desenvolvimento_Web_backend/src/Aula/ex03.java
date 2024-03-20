package Aula;
import java.util.ArrayList;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int vet[] = new int[15];
		ArrayList<Integer> lista = new ArrayList();
		
		for (int y = 0; y < 15; y++) {
			System.out.println("digite um valor: ");
			lista.add(input.nextInt());
			
		}
		
		for (int x = lista.size() - 1; x >= 0; x--) {
			System.out.print(lista.get(x));
			System.out.print(",");
		}
		
	}
	
}
