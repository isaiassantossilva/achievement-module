package com.santos.api.controller.achievements.dto;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementTopic;
import com.santos.core.entities.Coin;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class AchievementResponse {
    private String id;
    private AchievementTopic topic;
    private List<Integer> tierCounts;
    private Coin coin;

    public static AchievementResponse fromAchievement(Achievement achievement){
        return AchievementResponse.builder()
                    .id(achievement.getId())
                    .tierCounts(achievement.getTierCounts())
                    .coin(achievement.getCoin())
                    .topic(achievement.getTopic())
                .build();
    }
}
