public class Projecteuler {
	
	//Asal sayı kontrolü
	static boolean isPrime(int a) {
		for(int j = 2; j< a; j++) {
			if(a % j == 0) {
				return false;
			}				
		}
		return true;
	}
	public static void main(String[] args) {
		int number = 1,sum = 0,divisors = 1,maxDiv = 0,instantDiv = 0;
		while(divisors < 500) {
			divisors = 1;
			sum += number;
			int temp = sum;
			
			for(int i = 2; i <= temp; i++) {
							
				//Asal sayıysa
				if(isPrime(i)) {
					while(temp % i == 0) {
						//o anki asal sayıya kaç kere bölünebildiğini hesaplar
						instantDiv++;
						temp /= i;
					}					
				}
				// asal sayının üssünü 1 arttırıp çarpar
				divisors *= (instantDiv + 1);
				instantDiv = 0;
				maxDiv = 0;								
			}			
			number++;
			System.out.println(sum);
			System.out.println(divisors);
		}		
	}
}
