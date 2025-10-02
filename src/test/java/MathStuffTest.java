import com.github.superz97.dsa.math.MathStuff;
import com.github.superz97.dsa.math.model.InfluencerType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathStuffTest {

    @Test
    void testGetEstimateSpread() {
        List<Integer> followers = List.of(100, 200, 300);
        int result = MathStuff.getEstimateSpread(followers);
        assertEquals(747, result);
    }

    @Test
    void testGetFollowerPrediction() {
        int result = MathStuff.getFollowerPrediction(100, InfluencerType.FITNESS, 2);
        assertEquals(1600, result);
    }

    @Test
    void getInfluencerScore() {
        int result = MathStuff.getInfluencerScore(1024, 0.05);
        assertEquals(1, result);
    }

    @Test
    void testGetPossibleOrdersNumber() {
        int result = MathStuff.getPossibleOrdersNumber(5);
        assertEquals(120, result);
    }

    @Test
    void testGetDecayedFollowers() {
        int result = MathStuff.getDecayedFollowers(1000, 0.1, 2);
        assertEquals(810, result);
    }

    @Test
    void testLogScale() {
        List<Double> result = MathStuff.logScale(List.of(1.0, 10.0, 100.0), 10);
        assertEquals(List.of(0.0, 1.0, 2.0), result);
    }

    @Test
    void getAverageFollowerCount() {
        int result = MathStuff.getAverageFollowerCount(List.of(10, 20, 30, 40));
        assertEquals(25, result);
    }
}
