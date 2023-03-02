package com.sports2i.test_volleyball.repository;

import java.util.List;

import com.sports2i.test_volleyball.model.Game;

public interface GameRepositoryCustom {
	
	List<Game> searchGame(String strCompetitionCode, String strGameDate);
}
