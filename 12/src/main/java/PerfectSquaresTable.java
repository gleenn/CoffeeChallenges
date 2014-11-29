import java.util.Arrays;

public class PerfectSquaresTable {
    int[] perfectSquares;

    public PerfectSquaresTable(final int max) {
        perfectSquares = new int[max+1];
        for(int i = 0; i <= max; i++) {
            perfectSquares[i] = i * i;
        }
    }

    public boolean isPerfectSquare(int n) {
        return Arrays.binarySearch(perfectSquares, n) >= 0;
    }
}
