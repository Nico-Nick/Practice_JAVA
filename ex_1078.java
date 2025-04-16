package curso_programacao;
import java.util.Scanner;
public class ex_1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 1;
		int total= 0;
		
		if (2 < N && N <1000) {
		
		for (i=1; i <= 10; i++) {
			
			total = i * N;
			
			System.out.printf("%d x %d = %d%n", i, N, total);
		}
			
			
		}

	}

}
