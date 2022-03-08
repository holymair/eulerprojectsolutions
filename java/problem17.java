public class Projecteuler {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");

		String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		for (int i = 1; i < 1000; i++) {
			int temp = i;
			int basamak = 0;
			while (temp != 0) {
				int nextDigit;
				if (temp <= 10)
					nextDigit = 0;
				else
					nextDigit = ((temp - temp % 10) / 10) % 10;
				if (basamak == 0 && nextDigit != 1) {
					if (temp % 10 != 0) {
						sb.append(ones[temp % 10]);						
					}
					temp = (temp - temp % 10) / 10;

				} else if (basamak == 1) {
					if (temp == i) {
						sb.append(ones[10 + temp % 10]);
						temp = (temp - temp % 10) / 10;
						temp = (temp - temp % 10) / 10;
					}
					  else {
						sb.append(tens[temp % 10]);
						temp = (temp - temp % 10) / 10;
					}

				} else if (basamak == 2) {
					sb.append("andhundred");
					sb.append(ones[temp % 10]);
					temp = (temp - temp % 10) / 10;
				}
				basamak++;
			}
			

		}
		sb.append("onethousand");
		sb.trimToSize();
		System.out.println(sb.capacity()-24);
	}

}
// KENDİM OKUSAM DA ANLAMAM BEN BU KODU
