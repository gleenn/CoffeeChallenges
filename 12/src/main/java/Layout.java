import java.util.List;
import java.util.ListIterator;

public class Layout {
	private PerfectSquaresTable table;
	public List<Integer> nums;

    public Layout(PerfectSquaresTable table, List<Integer> nums) {
		this.table = table;
		this.nums = nums;
    }

    protected int pairsThatArePerfectSquares() {
        int numAdjacentPerfectSquares = 0;
		ListIterator<Integer> first = nums.listIterator();
		ListIterator<Integer> second = nums.listIterator();
		second.next();

		while(second.hasNext()) {
			if(table.isPerfectSquare(first.next() + second.next())) {
                numAdjacentPerfectSquares++;
            }
        }
        return numAdjacentPerfectSquares;
    }
}
