package com.sports2i.test_volleyball.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.model.Play;

@Repository
public interface PlayRepository extends JpaRepository<Play, Integer>{
	
	Play findByActionSeq(int actionSeq);
	
	@Query(value = "SELECT * "
			+ " FROM PLAY "
			+ " ORDER BY actionSeq DESC ", nativeQuery = true)
	List<Play> findByActionList();
	
	@Query(value = "SELECT Main.rallySeq"
			+ " FROM ("
			+ "		SELECT rallySeq, count(*)"
			+ "		FROM PLAY"
			+ "		WHERE rallySeq !=1"
			+ "		GROUP BY rallySeq"
			+ "     ) Main;", nativeQuery = true)
	List<Integer> findLastActionList();
}