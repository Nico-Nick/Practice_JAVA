package curso_programacao;
import java.util.Scanner;

public class ex_1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			
			// se for impar, some mais 1
			if (x % 2 != 0) {
				x = x + 1;
			}
			
			// expressao simplificada: 5 * x + 20
			int a = x;
			int b = x + 2;
			int c = x + 4;
			int d = x + 6;
			int e = x + 8;

			int soma = a + b + c + d + e;			
			System.out.println(soma);
			
			x = sc.nextInt();
		}
		
		sc.close();
	}
}

