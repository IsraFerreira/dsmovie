package com.israelferreira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israelferreira.dsmovie.entities.Score;
import com.israelferreira.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
