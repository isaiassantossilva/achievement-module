package com.santos.core.ports.driven;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementProgress;

import java.util.List;

public interface AchievementRepository {
    Achievement save(Achievement achievement);
    List<AchievementProgress> findUserAchievementProgress(String userId, String accountId, String origin);
}
