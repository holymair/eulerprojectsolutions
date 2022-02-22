public class problem10 {
	
	public static boolean isPrime(int a) {
		if(a == 2)
			return true;
		for(int i = 2; i < (int)(Math.sqrt(a)) + 1; i++) {
			if(a % i == 0) 
				return false;			
		}
		return true;
	}
	public static void main(String[] args) {
		int number = 2;
		long sum = 0;
		while(number < 2000000) {
			if(isPrime(number) == true) {
				sum += number;
			}
			number++;
		}
		System.out.println(sum);

	}	
}
