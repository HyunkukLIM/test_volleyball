package com.sports2i.test_volleyball.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

	Game findByGameCode(String strGameCode);
	
//	@Query(value = "UPDATE GAME"
//					+ " SET ")
//	void updateGameInfo(int iLastRallySeq);
}
