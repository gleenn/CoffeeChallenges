//Write 1,000,000 as the product of two numbers; neither of which contains any zeroes.

import java.util.*;

public class Challenge2 {
	public static void main(final String[] args) {
		final int N = 1000000;
		List<Integer> factors = getFactors(N);	
		for(Integer i : factors) {
			if(i % 10 == 0) continue;	
			if(N / i % 10 == 0) continue;
			System.out.println("" + i + "*" + (N/i) + "=" + N);
		}
	}

	public static List<Integer> getFactors(int i) {
		List<Integer> factors = new ArrayList<Integer>();
		int limit = (int)Math.sqrt(i);
		for(int j=1; j<limit; j++) {
			if(i % j == 0) {
				factors.add(j);
			}
		}
		return factors;
	}
}
