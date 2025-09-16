package com.rakesh.fitness.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document(collection="workouts")
@Data
public class Workout {
    private String id;
    private String userId;
    private String type;
    private double distance;
    private long durationSeconds;
    private Instant timestamp;
}