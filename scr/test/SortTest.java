import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void test1() {
        int [] start = new int[]{3, 5, 1, 8};
        int [] expected_result = temp.getResult(start);
        int [] result = new int[]{1, 3, 5, 8};
        assertArrayEquals(result, expected_result);
    }


}