import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class LayoutTest {

    private PerfectSquaresTable table;

    @Before
    public void setUp() throws Exception {
        table = new PerfectSquaresTable(10);
    }

    @Test
    public void pairsThatAreSquares() {
        assertThat(new Layout(table, new int[] {1, 2, 3}).pairsThatArePerfectSquares()).isEqualTo(0);
        assertThat(new Layout(table, new int[] {1, 3, 6}).pairsThatArePerfectSquares()).isEqualTo(2);
        assertThat(new Layout(table, new int[] {1, 3, 6, 0}).pairsThatArePerfectSquares()).isEqualTo(2);
    }
}