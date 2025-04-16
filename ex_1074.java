package curso_programacao;
import java.util.Scanner;

public class ex_1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Z = 0;
		String resultado = "";
		
		for (int i=0; i!=N; i++) {
			
				Z = sc.nextInt();

				
			if (Z % 2 != 0 && Z < 0) {
				
				resultado += "ODD NEGATIVE\n";
				
			}	
			
			else if (Z % 2 != 0 && Z > 0) {
				
				resultado += "ODD POSITIVE\n";
				
			}
			else if (Z % 2 == 0 && Z < 0) {
				
				resultado += "EVEN NEGATIVE\n";

				
			}
			else if (Z % 2 == 00 && Z > 0) {
				
				resultado += "EVEN POSITIVE\n";
				
			}
			else if (Z == 0) {
				
				resultado += "NULL\n";
			
		}
	
	}
			System.out.print(resultado);

}

}