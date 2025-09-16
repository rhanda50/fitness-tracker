package com.rakesh.fitness.repository;

import com.rakesh.fitness.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> { }