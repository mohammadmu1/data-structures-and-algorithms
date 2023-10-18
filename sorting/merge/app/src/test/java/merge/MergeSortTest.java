package merge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] expected = {4, 8, 15, 16, 23, 42};
        App.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        App.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithOneElement() {
        int[] arr = {1};
        int[] expected = {1};
        App.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithDuplicateElements() {
        int[] arr = {5, 5, 3, 3, 1, 1};
        int[] expected = {1, 1, 3, 3, 5, 5};
        App.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }
}
