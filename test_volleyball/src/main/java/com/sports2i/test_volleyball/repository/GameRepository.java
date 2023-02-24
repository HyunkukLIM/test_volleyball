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

	List<Game> findByGameNum(int iGameNum);
	
	@Query(value = "SELECT * "
			+ " FROM GAME "
			+ " WHERE gameCode = :strGameCode "
			+ " AND setNum = :iSetNum ", nativeQuery = true)
	Game searchGameBySet(String strGameCode, int iSetNum);
	
	@Query(value = "SELECT * "
			+ " FROM GAME "
			+ " WHERE gameDate = :strGameDate "
			+ "	AND gender = :strGender "
			+ "	AND gameNum = :iGameNum "
			+ " AND setNum = 0 ", nativeQuery = true)
	Game searchGameByGameInfo(String strGameDate, String strGender, int iGameNum);

	@Modifying
	@Transactional
	@Query(value = "UPDATE GAME "
			+ " SET "
			+ "		gameStatus = :strGameStatus "
			+ " WHERE 	gameCode = :strGameCode "
			+ "	AND		setNum = :iSetNum ", nativeQuery = true)
	void updateGameStatus(String strGameCode, int iSetNum, String strGameStatus);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE GAME "
			+ " SET "
			+ "     homeScore = :iHomeScore,"
			+ "     awayScore = :iAwayScore "
			+ " WHERE 	gameCode = :strGameCode "
			+ "	AND		setNum = :iSetNum ", nativeQuery = true)
	void updateScore(String strGameCode, int iSetNum, int iHomeScore, int iAwayScore);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE GAME "
			+ " SET homeSetScore = :iHomeSetScore, "
			+ "		awaySetScore = :iAwaySetScore,"
			+ "     homeScoreSum = :iHomeScoreSum,"
			+ "     awayScoreSum = :iAwayScoreSum "
			+ " WHERE setNum = 0 ", nativeQuery = true)
	void updateSetScore(int iHomeSetScore, int iAwaySetScore, int iHomeScoreSum, int iAwayScoreSum);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE GAME "
			+ "		SET setTime = :strSetTime"
			+ " WHERE setNum = :iSetNum"
			+ "  ", nativeQuery = true)
	void updateSetTime(String strSetTime, int iSetNum);
}
