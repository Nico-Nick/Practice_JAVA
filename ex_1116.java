package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class ex_1116 {

	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
	  
	  Scanner sc = new Scanner(System.in);
	  
	  	int N = sc.nextInt();
	  	
	  	double X = 0;
	  	double Y = 0;
	  	
	  	for (int i=0; i!=N; i++) {
	  		
	  		X = sc.nextDouble();
	  		Y = sc.nextDouble();
	  		
	  		if (Y == 0) {
	  			
	  			System.out.printf("divisao impossivel%n");
	  			
	  		}
	  		
	  		else  {
	  			
	  			double total = X / Y;
	  			
	  			System.out.printf("%.1f%n", total);
	  			
	  		}
	  		
	  	}
	  	sc.close();
	}

}
