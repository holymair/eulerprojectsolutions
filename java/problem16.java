import java.math.*;
public class Projecteuler {
	public static void main(String[] args) {
		BigInteger number;
		number = BigInteger.valueOf(1);
		int sum = 0;
		char[] a;
		for(int i = 0; i<1000; i++) {
			number = number.multiply(BigInteger.valueOf(2));
		}
		a = number.toString().toCharArray();
		for(char i : a) {
			sum += i - '0';
		}
		System.out.println(sum);
		
	}
	
}
