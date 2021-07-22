package com.santos.core.userstories;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementProgress;
import com.santos.core.ports.driven.AchievementRepository;
import com.santos.core.ports.driver.AchievementPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementUS implements AchievementPort {

    private final AchievementRepository achievementRepository;

    @Override
    public Achievement save(Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    @Override
    public List<AchievementProgress> findUserAchievementProgress(String userId, String accountId, String origin) {
        return null;
    }
}
