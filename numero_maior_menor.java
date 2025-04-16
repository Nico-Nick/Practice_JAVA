package curso_programacao;
import java.util.Scanner;

public class numero_maior_menor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A < B && A < C) {
			System.out.printf("MENOR = %d", A);
		}
		if (B < A && B < C) {
			System.out.printf("MENOR = %d", B);
		}
		if (C < A && C < B) {
			System.out.printf("MENOR = %d", C);
		}
		if (A == B && A == C && B == C) {
			System.out.printf("MENOR = %d", A);
		}
		sc.close();
	}

}
