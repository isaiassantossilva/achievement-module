package com.santos.core.ports.driver;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementProgress;

import java.util.List;

public interface AchievementPort {
    Achievement save(Achievement achievement);
    List<AchievementProgress> findUserAchievementProgress(String userId, String accountId, String origin);
}
