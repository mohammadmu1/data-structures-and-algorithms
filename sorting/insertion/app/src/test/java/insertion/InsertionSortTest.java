package insertion;

import insertion.cc26.Sort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Sort sorter = new Sort();
        int[] result = sorter.insertionSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testInsertionSortWithSingleElement() {
        int[] input = {5};
        int[] expected = {5};
        Sort sorter = new Sort();
        int[] result = sorter.insertionSort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testInsertionSortWithMultipleElements() {
        int[] input = {8, 4, 23, 42, 16,15};
        int[] expected = {4,8, 15, 16, 23, 42};
        Sort sorter = new Sort();
        int[] result = sorter.insertionSort(input);
        assertArrayEquals(expected, result);
    }
}
