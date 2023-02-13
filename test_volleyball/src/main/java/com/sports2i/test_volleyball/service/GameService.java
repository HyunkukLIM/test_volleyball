package com.sports2i.test_volleyball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.model.Game;
import com.sports2i.test_volleyball.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public List<Game> searchGameInfo(String strGameCode) {		

		return gameRepository.findByGameCode(strGameCode);
	}	
	
	@Transactional
	public Game searchSetInfo(String strGameCode) {		

		return gameRepository.searchsetByGameCode(strGameCode);
	}
	
	public void saveGameInfo(GameDto.Request dto) {
		
		gameRepository.save(dto.toEntity());
	}
	
	public void updateSetInfo(int iHomeSetScore, int iAwaySetScore) {
		
		gameRepository.updateSetScore(iHomeSetScore, iAwaySetScore);
	}
	
}
