package curso_programacao;
import java.util.Scanner;

public class ex_1044 {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int divisao = A % B;
		int divisao_2 = B % A;
		
		if (divisao == 0 || divisao_2 == 0) {
			
			System.out.println("Sao multiplos");
		}
		else {
			
			System.out.println("Nao sao Multiplos");
		}
	}

}
