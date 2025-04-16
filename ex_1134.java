package curso_programacao;
import java.util.Scanner;

public class ex_1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int produto = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (produto != 4) {
			
			
		if (produto < 1 || produto > 4) {
			
			 produto = sc.nextInt();
			 
		}
		 else if (1 == produto) {
			 
			 produto = sc.nextInt();
			 alcool = alcool + 1;
			
		 }
		 else if (2 == produto) {
			 
			 produto = sc.nextInt();
			 gasolina = gasolina + 1;
		 }
		 else if (3 == produto)
		 {   
			 produto = sc.nextInt();
			 diesel = diesel + 1;
		 }
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		
		 }
 }
