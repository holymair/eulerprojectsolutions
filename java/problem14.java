public class Projecteuler {
	
	static long length = 0;

	static long chainLength(long number) {

		if (number == 1) {
			length++;
			return 0;
		} else if (number % 2 == 0) {
			length++;
			return number / 2;
		} else {
			length++;
			return (number * 3) + 1;
		}
	}

	public static void main(String[] args) {
		long chainLength = 0,maxNumber = 0;
		for (int i = 2; i < 1_000_000; i++) {
			long number = i;
			while (number > 0) {
				number = chainLength(number);
			}
			//System.out.println("i: "+ i + " chain length: " + Projecteuler.length);
			if(Projecteuler.length > chainLength) {
				chainLength = Projecteuler.length;
				maxNumber= i;
			}
				
			Projecteuler.length = 0;
		}
		System.out.println(maxNumber);
	}
}
