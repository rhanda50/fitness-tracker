package com.rakesh.fitness.controller;

import com.rakesh.fitness.model.Workout;
import com.rakesh.fitness.repository.WorkoutRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fitness")
public class WorkoutController {

    private final WorkoutRepository workoutRepository;

    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @PostMapping("/workouts")
    public ResponseEntity<Workout> log(@RequestBody Workout w) {
        return ResponseEntity.ok(workoutRepository.save(w));
    }

    @GetMapping("/workouts/{userId}")
    public ResponseEntity<List<Workout>> list(@PathVariable String userId) {
        return ResponseEntity.ok(workoutRepository.findByUserIdOrderByTimestampDesc(userId));
    }
}