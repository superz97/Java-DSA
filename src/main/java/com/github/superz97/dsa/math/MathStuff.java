package com.github.superz97.dsa.math;

import com.github.superz97.dsa.math.model.InfluencerType;

import java.util.ArrayList;
import java.util.List;

public class MathStuff {

    public static int getEstimateSpread(List<Integer> audiencesFollowers) {
        if (audiencesFollowers == null || audiencesFollowers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Integer follower : audiencesFollowers) {
            sum += follower;
        }
        int averageAudienceFollowers = sum / audiencesFollowers.size();
        int numberOfFollowers = audiencesFollowers.size();
        return (int) (averageAudienceFollowers * Math.pow(numberOfFollowers, 1.2));
    }

    public static int getFollowerPrediction(int followerCount,
                                            InfluencerType influencerType,
                                            int numberOfMonths) {
        // total = a1 * r^n
        int exponent = switch (influencerType) {
            case InfluencerType.FITNESS -> 4;
            case InfluencerType.COSMETIC -> 3;
            default -> 2;
        };
        return (int) (followerCount * Math.pow(exponent, numberOfMonths));
    }

    public static int getInfluencerScore(int numberOfFollowers, double averageEngagementPercentage) {
        return (int) Math.ceil(averageEngagementPercentage * (Math.log(numberOfFollowers) / Math.log(2)));
    }

    public static int getPossibleOrdersNumber(int numberOfPosts) {
        int result = 1;
        for (int i = 1; i <= numberOfPosts; i++) {
            result *= i;
        }
        return result;
    }

    public static int getDecayedFollowers(int initialFollowers,
                                          double fractionLostDaily,
                                          int days) {
        double retentionRate = 1 - fractionLostDaily;
        double remainingFollowers = Math.ceil(initialFollowers * Math.pow(retentionRate, days));
        return (int) remainingFollowers;
    }

    public static List<Double> logScale(List<Double> data, double base) {
        List<Double> result = new ArrayList<>();
        for (double number : data) {
            double logValue = Math.log(number) / Math.log(base);
            result.add(logValue);
        }
        return result;
    }

    public static int getAverageFollowerCount(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

}
