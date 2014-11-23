// Challenge: Find three digits X, Y and Z such that XYZ in base10 (ten) is equal to ZYX in base9 (nine)?
public class Challenge1 {
	public static void main(final String[] args) {
		final int ten1 = 1;
		final int ten2 = 10;
		final int ten3 = 100;
		final int nine1 = 1;
		final int nine2 = 9;
		final int nine3 = 81;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					if(i*ten3 + j*ten2 + k*ten1 ==
						 k*nine3 + j*nine2 + i*nine1) {
						System.out.println("base10 " + i + j + k+ " == base9 " + k + j + i);
					}	
				}
			}
		}	
	}
}
