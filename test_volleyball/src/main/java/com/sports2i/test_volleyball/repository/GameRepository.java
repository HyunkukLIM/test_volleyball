package com.sports2i.test_volleyball.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

	List<Game> findByGameCode(String strGameCode);
	
	@Query(value = "SELECT * "
			+ " FROM GAME "
			+ " WHERE setNum = 0 ", nativeQuery = true)
	Game searchsetByGameCode(String strGameCode);

	@Modifying
	@Transactional
	@Query(value = "UPDATE GAME "
			+ " SET homeSetScore = :iHomeSetScore, "
			+ "		awaySetScore = :iAwaySetScore "
			+ " WHERE setNum = 0 ", nativeQuery = true)
	void updateSetScore(int iHomeSetScore, int iAwaySetScore);
}
