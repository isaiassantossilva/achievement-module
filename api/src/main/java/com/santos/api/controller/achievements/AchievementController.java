package com.santos.api.controller.achievements;

import com.santos.api.controller.achievements.dto.AchievementRequest;
import com.santos.api.controller.achievements.dto.AchievementResponse;
import com.santos.core.ports.driver.AchievementPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/achievements")
@RequiredArgsConstructor
public class AchievementController {

    private final AchievementPort achievementPort;

    @PostMapping
    public AchievementResponse save(@RequestBody AchievementRequest achievementRequest){
        var achievement = achievementPort.save(achievementRequest.toAchievement());
        return AchievementResponse.fromAchievement(achievement);
    }

}
