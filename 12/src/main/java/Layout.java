public class Layout {
	private PerfectSquaresTable table;
	public int[] nums;

    public Layout(PerfectSquaresTable table, int[] nums) {
		this.table = table;
		this.nums = nums;
    }

    protected int pairsThatArePerfectSquares() {
        int numAdjacentPerfectSquares = 0;
        int sum;
        for(int i=0; i<nums.length - 1; i++) {
            if(table.isPerfectSquare(nums[i] + nums[i+1])) {
                numAdjacentPerfectSquares++;
            }
        }
        return numAdjacentPerfectSquares;
    }
}
