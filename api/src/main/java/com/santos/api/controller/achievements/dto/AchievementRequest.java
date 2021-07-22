package com.santos.api.controller.achievements.dto;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementTopic;
import com.santos.core.entities.Coin;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class AchievementRequest {
    private AchievementTopic topic;
    private List<Integer> tierCounts;
    private Coin coin;

    public Achievement toAchievement(){
        return Achievement.builder()
                    .tierCounts(tierCounts)
                    .coin(coin)
                    .topic(topic)
                .build();
    }
}
