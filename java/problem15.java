public class Projecteuler {
	public static void main(String[] args) {
		long [][] array = new long[21][21];
		for(int i = 0; i<21;i++) {
			array[0][i] = 1;
		}
		for(int i = 0; i<21;i++) {
			array[i][0] = 1;
		}
		for(int i = 1; i < 21; i++) {
			for(int j = 1; j< 21;j++) {
				array[i][j] = array[i-1][j] + array[i][j-1];
			}
		}
		System.out.println(array[20][20]);
	}
	
}
