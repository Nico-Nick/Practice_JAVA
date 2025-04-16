package curso_programacao;
import java.util.Scanner;

public class ex_1038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double cachorro_Quente = 4;
		double x_Salada = 4.5;
		double x_Bacon = 5;
		double torrada_Simples = 2;
		double refrigerante = 1.5;
		
		if (codigo == 1) {
			 
		    double total = cachorro_Quente * quantidade;
		    
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 2) {
			
			double total = x_Salada * quantidade;
			
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 3) {
			
			double total = x_Bacon * quantidade;
			
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 4) {
			
			double total = torrada_Simples * quantidade;
			
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 5) {
			
				double total = refrigerante * quantidade; 
						
			System.out.printf("Total: R$ %.2f%n", total);
		}
		sc.close();
	}
}