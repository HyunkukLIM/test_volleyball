package com.sports2i.test_volleyball.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.model.Play;

@Repository
public interface PlayRepository extends JpaRepository<Play, Integer>{
	
//	Play findByRallySeq(int iLastRallySeq);
	
	@Query(value = " SELECT * "
			+ " FROM"
			+ " 	( "
			+ " 		SELECT setNum, "
			+ " 		SUM(homeScore) AS homeScore,"
			+ " 		SUM(awayScore) AS awayScore"
			+ " 		FROM PLAY "
			+ " 		GROUP BY setNum "
			+ " 	) MAIN "
//			+ " WHERE setNum = :iSetNum ", nativeQuery = true)
			+ " ORDER BY setNum DESC"
			+ " LIMIT 1 ", nativeQuery = true)
	Map<String, String> findCurrentScore();
	
	@Query(value = " SELECT setNum, "
			+ " SUM(homeScore) AS homeScore,"
			+ " SUM(awayScore) AS awayScore"
			+ " FROM PLAY "
			+ " GROUP BY setNum ", nativeQuery = true)
	List<Map<String, String>> findCurrentSetScore();
	
	@Query(value = " SELECT"
			+ "	mainAction, "
			+ " teamId "
			+ " FROM PLAY "
			+ " WHERE teamId = 'SYSTEM' "
			+ " ORDER BY actionSeq DESC "
			+ " LIMIT 1 ", nativeQuery = true)
	Map<String, String> findGameStatus();
	
	Play findByActionSeq(int actionSeq);
	
	@Query(value = "SELECT * "
			+ " FROM PLAY "
			+ " ORDER BY actionSeq DESC ", nativeQuery = true)
	List<Play> findByActionList();
	
	@Query(value = "SELECT Main.rallySeq"
			+ " FROM ("
			+ "			SELECT rallySeq, count(*)"
			+ "			FROM PLAY"
			+ "			WHERE rallySeq !=0"
			+ "			GROUP BY rallySeq"
			+ "      ) Main"
			+ " ORDER BY rallySeq DESC"
			+ " LIMIT 5", nativeQuery = true)
	List<Integer> findLastRallyList();
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM PLAY "
			+ " WHERE actionSeq >= :iFromActionSeq"
			+ "  ", nativeQuery = true)
	void deleteFromActionSeq(int iFromActionSeq);
}