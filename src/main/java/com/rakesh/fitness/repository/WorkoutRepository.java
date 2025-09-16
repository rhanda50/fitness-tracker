package com.rakesh.fitness.repository;

import com.rakesh.fitness.model.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface WorkoutRepository extends MongoRepository<Workout, String> {
    List<Workout> findByUserIdOrderByTimestampDesc(String userId);
}