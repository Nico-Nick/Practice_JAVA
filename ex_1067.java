package curso_programacao;
import java.util.Scanner;

public class ex_1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int X = sc.nextInt();
		
			if (X >= 1 && X <= 1000) {
				
					for (int i=0; i<=X; i++) {
						
						int impar = 0;
					
						if(i % 2 != 0) {
							
							impar = impar + i;
							
							
							System.out.printf("%d%n", impar);
						}
						}
						
					}
		
			sc.close();
	}
}
