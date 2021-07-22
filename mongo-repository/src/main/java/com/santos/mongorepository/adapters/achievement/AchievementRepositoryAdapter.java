package com.santos.mongorepository.adapters.achievement;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementProgress;
import com.santos.core.ports.driven.AchievementRepository;
import com.santos.mongorepository.adapters.achievement.schema.AchievementDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AchievementRepositoryAdapter implements AchievementRepository {

    private static final String COLLECTION_NAME = "achievement";
    private final MongoTemplate database;

    @Override
    public Achievement save(Achievement achievement) {

        var document = AchievementDocument
                .create(null)
                .replaceWith(achievement);

        var id = database.save(document).getId();

        return findById(id);
    }

    @Override
    public List<AchievementProgress> findUserAchievementProgress(String userId, String accountId, String origin) {
        return null;
    }

    private Achievement findById(String id){
        return database.findById(id, Achievement.class, COLLECTION_NAME);
    }
}
