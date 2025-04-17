package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class ex_1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			int N = sc.nextInt();
			
				double valor_1 = 0;
				double valor_2 = 0;
				double valor_3 = 0;
			
			for (int i=0; i!=N; i++) {
				
				valor_1 = sc.nextDouble(); 
				valor_2 = sc.nextDouble();
				valor_3 = sc.nextDouble();
				
				double media = (valor_1 * 2.0 + valor_2 * 3.0 + valor_3 * 5.0) / 10.0;
				
				System.out.printf("%.1f%n", media);
				
			}
			
			sc.close();
	}

}

