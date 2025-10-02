import com.github.superz97.dsa.algorithms.AlgorithmsIntro;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlgorithmsIntroTests {

    @Test
    void testGenerateRandomListOfIntegers() {
        int min = -9_999_999;
        int max = 9_999_999;
        int size = 10;
        List<Integer> result = AlgorithmsIntro.generateRandomListOfIntegers(min, max, size);
        assertEquals(size, result.size());
        for (int num : result) {
            assertTrue(num >= min && num <= max,
                    "Number out of range: " + num);
        }
    }

    @Test
    void testFindMinimum() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(1, AlgorithmsIntro.findMinimum(nums));
    }

    @Test
    void testFindSum() {
        List<Integer> nums = List.of(1, 2, 3, 4);
        assertEquals(10, AlgorithmsIntro.findSum(nums));
    }

}
