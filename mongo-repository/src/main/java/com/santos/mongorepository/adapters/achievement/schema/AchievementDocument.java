package com.santos.mongorepository.adapters.achievement.schema;

import com.santos.core.entities.Achievement;
import com.santos.core.entities.AchievementTopic;
import com.santos.core.entities.Coin;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document("achievement")
@Getter
@RequiredArgsConstructor
public class AchievementDocument {
    private final String id;

    @CreatedDate
    private LocalDateTime createdDate;
    @Version
    private int version;

    private List<Integer> tierCounts;
    private Coin coin;

    @Indexed(unique=true)
    private AchievementTopic topic;

    public static AchievementDocument create(String id){
        return new AchievementDocument(id);
    }

    public AchievementDocument replaceWith(Achievement achievement) {
        tierCounts = achievement.getTierCounts();
        coin = achievement.getCoin();
        topic = achievement.getTopic();

        return this;
    }
}
