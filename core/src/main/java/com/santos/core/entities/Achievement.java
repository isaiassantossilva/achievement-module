package com.santos.core.entities;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Achievement {
    private String id;
    private List<Integer> tierCounts;
    private Coin coin;
    private AchievementTopic topic;
}
