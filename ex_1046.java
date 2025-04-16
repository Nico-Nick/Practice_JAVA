package curso_programacao;
import java.util.Scanner;

public class ex_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			int duracao = (B + 24) - A;
		
					
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
			
		}
		else if (A < B) {
			
			int duracao = B - A;
			
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
			
		}
		else if (A == B) {
			
			System.out.printf("O JOGO DUROU 24 HORA(S)");
			
		}
	}

}
