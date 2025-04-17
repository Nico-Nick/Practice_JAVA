package curso_programacao;
import java.util.Scanner;

public class ex_1132 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (X > Y) {
			
			max = X;
			min = Y;
		}
		else if (Y > X){
			
			max = Y;
			min = X;
		}
			
		int soma = 0;
		for (int i=min; i<=max; i++) {
			
			int mod = i % 13;
		 
			if (mod != 0) {
				
				 soma = soma + i;
			 
		 }
			
		}
		System.out.printf("%d", soma);
		
		sc.close();
	}

}
