package com.sports2i.test_volleyball.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.model.Game;
import com.sports2i.test_volleyball.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public Game searchGameInfo(String strGameCode) {		
		
		return gameRepository.findByGameCode(strGameCode);
	}
	
//	@Transactional
//	public void updateGameInfo(int iLastRallySeq) {
//		
//		
//	}
}
