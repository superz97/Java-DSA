package com.github.superz97.dsa.math;

import com.github.superz97.dsa.math.model.InfluencerType;

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
        int estimatedSpread = (int) (averageAudienceFollowers * Math.pow(numberOfFollowers, 1.2));
        return estimatedSpread;
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

}
