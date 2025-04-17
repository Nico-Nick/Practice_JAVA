package curso_programacao;
import java.math.BigInteger;
public class test_BigInteger {

	public static void main(String[] args) {
		//Testando o limite do meu PC kkkkk
		
		BigInteger x = new BigInteger("999999999999999999999999999999");
		BigInteger y = new BigInteger("123456789");
		BigInteger resultado = x.multiply(y);
		System.out.println(resultado);

	}

}
