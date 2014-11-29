import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class PerfectSquaresTableTest {
    @Test
    public void isPerfectSquare() {
        PerfectSquaresTable table = new PerfectSquaresTable(10);

        assertThat(table.isPerfectSquare(0)).isTrue();
        assertThat(table.isPerfectSquare(1)).isTrue();
        assertThat(table.isPerfectSquare(4)).isTrue();
        assertThat(table.isPerfectSquare(9)).isTrue();
        assertThat(table.isPerfectSquare(16)).isTrue();
        assertThat(table.isPerfectSquare(25)).isTrue();
        assertThat(table.isPerfectSquare(100)).isTrue();

        // 121 is a perfect square but more than 10*10 so we return false
        assertThat(table.isPerfectSquare(121)).isFalse();

        assertThat(table.isPerfectSquare(2)).isFalse();
        assertThat(table.isPerfectSquare(3)).isFalse();
        assertThat(table.isPerfectSquare(5)).isFalse();
        assertThat(table.isPerfectSquare(6)).isFalse();
        assertThat(table.isPerfectSquare(7)).isFalse();
        assertThat(table.isPerfectSquare(8)).isFalse();
        assertThat(table.isPerfectSquare(10)).isFalse();
    }
}