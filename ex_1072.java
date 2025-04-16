package curso_programacao;
import java.util.Scanner;

public class ex_1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
			
		int N = sc.nextInt();
		int X = 0;
		
			for (int i=0; i!=N; i++) {
				
				 X = sc.nextInt();				
			 
			if (X >= 10 && X <= 20) {
					
					in = in + 1;	
				
			}
			else {
					 out = out + 1;
			}
			
			}
			
			System.out.printf("%d in%n",in);
			System.out.printf("%d out",out);

	}

}
