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
	public Game searchGameInfo(String strGameCode) {		

		return gameRepository.searchGameByGameCode(strGameCode);
	}	
	
	public List<Game> searchSetInfo(int iGameNum) {		

		return gameRepository.findByGameNum(iGameNum);
	}
	
	public Game searchSetInfo(String strGameCode, int iSetNum) {		

		return gameRepository.searchGameBySet(strGameCode, iSetNum);
	}
	
//	public void saveGameInfo(GameDto.Request dto) {
//		
//		gameRepository.save(dto.toEntity());
//	}
	
	public void saveGameInfo(GameDto.Request dto) {
		
		gameRepository.save(dto.toEntity());
	}
	
	public void updateGameStatus(String strGameCode, int iSetNum, String strGameStatus) {
		
		gameRepository.updateGameStatus(strGameCode, iSetNum, strGameStatus);
	}
	
	public void updateScore(String strGameCode, int iSetNum, int iHomeScore, int iAwayScore) {
		
		gameRepository.updateScore(strGameCode, iSetNum, iHomeScore, iAwayScore);
	}
	
	public void updateSetInfo(int iHomeSetScore, int iAwaySetScore, int iHomeScoreSum, int iAwayScoreSum) {
		
		gameRepository.updateSetScore(iHomeSetScore, iAwaySetScore, iHomeScoreSum, iAwayScoreSum);
	}
	
	public void updateSetTime(String strSetTime, int iSetNum) {
		
		gameRepository.updateSetTime(strSetTime, iSetNum);
	}
	
	public void insertSet(GameDto.Request dto) {
		
		gameRepository.save(dto.toEntity());
	}
	
}
