package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
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
	public List<GameDto.Response> searchGame(String strCompetitionCode, String strGameDate) {
		
		List<GameDto.Response> listGameReponse = new ArrayList<>();
		List<Game> listGame = new ArrayList<>();
		
		listGame = gameRepository.searchGame(strCompetitionCode, strGameDate);
		
		for (Game game : listGame) {
			
			listGameReponse.add(new GameDto.Response(game));
		}
		
		return listGameReponse;
	}
	
	@Transactional
	public GameDto.Response searchGameInfo(String strGameDate, String strGender, int iGameNum) {

		return new GameDto.Response(gameRepository.searchGameByGameInfo(strGameDate, strGender, iGameNum));
	}	
	
	@Transactional
	public List<Game> searchSetInfo(int iGameNum) {		

		return gameRepository.findByGameNum(iGameNum);
	}
	
	@Transactional
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
