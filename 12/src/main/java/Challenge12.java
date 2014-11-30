import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;

public class Challenge12 {
    private static PerfectSquaresTable table;

    public static void main(final String[] args) {
        out.println(go(17)); // => [16, 9, 7, 2, 14, 11, 5, 4, 12, 13, 3, 6, 10, 15, 1, 8, 17]
    }

    public static List<Integer> go(int max) {
        table = new PerfectSquaresTable(max + max - 1);
        LinkedList<Integer> remaining = new LinkedList<Integer>();
        for(int i = 2; i <= max; i++) {
            remaining.add(i);
        }
        return go(max, new LinkedList<Integer>(asList(1)), remaining);
    }

    public static List<Integer> go(int max, LinkedList<Integer> current, LinkedList<Integer> remaining) {
        if(remaining.size() == 0) return current;
        for(int i = 0; i < remaining.size(); i++) {
            int bro = remaining.removeLast();

            if(table.isPerfectSquare(current.getFirst() + bro)) {
                current.addFirst(bro);
                List<Integer> result = go(max, current, remaining);
                if(result.size() == max) {
                    return result;
                } else {
                    current.removeFirst();
                }
            }
            if(table.isPerfectSquare(current.get(current.size()-1) + bro)) {
                current.addLast(bro);
                List<Integer> result = go(max, current, remaining);
                if(result.size() == max) {
                    return result;
                } else {
                    current.removeLast();
                }
            }

            remaining.addFirst(bro);
        }
        return null;
    }
}
