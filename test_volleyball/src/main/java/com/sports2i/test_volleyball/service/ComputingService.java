package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.model.Game;

@Service
public class ComputingService {

	@Autowired
	private PlayService playService;
	
	@Autowired
	private GameService gameService;
	

	public void updateScore() {
		
		String strGameCode = "22-23VMENR3-123";
		
		Map<String, String> currentScore = new HashMap<String, String>();
		currentScore = playService.searchCurrentScore();
		
//		System.out.println(currentScore.get("setNum"));
//		System.out.println(String.valueOf(currentScore.get("homeScore")));
//		System.out.println(String.valueOf(currentScore.get("awayScore")));
		
		int iSetNum = Integer.parseInt(String.valueOf(currentScore.get("setNum")));
		int iHomeScore = Integer.parseInt(String.valueOf(currentScore.get("homeScore")));
		int iAwayScore = Integer.parseInt(String.valueOf(currentScore.get("awayScore")));
		int iHomeSetScore = 0;
		int iAwaySetScore = 0;
		int iHomeScoreSum = 0;
		int iAwayScoreSum = 0;
		
		if (iHomeScore == 25) {
			iHomeSetScore++;
		}
		
		if (iAwayScore == 25) {
			iAwaySetScore++;
		}
		
		List<Game> listGameInfo = gameService.searchGameInfo(strGameCode);
//		List<Game> listUpdateGameInfo = new ArrayList<>();
		
		// 세트 별 경기 정보 업데이트
		for (Game gameInfo : listGameInfo) {
			
			if (iSetNum == gameInfo.getSetNum()) {
				
				GameDto.Request requestScore = GameDto.Request.builder()
						.gameCode(gameInfo.getGameCode())
						.awayScore(iAwayScore)
						.awayScoreSum(iAwayScoreSum)
						.awaySetScore(iAwaySetScore)
						.awayTeam(gameInfo.getAwayTeam())
						.awayWL(null)
						.broadcaster(null)
						.competitionCode(gameInfo.getCompetitionCode())
						.gameDate(gameInfo.getGameDate())
						.gameDay(null)
						.gameLocation(null)
						.gameNum(gameInfo.getGameNum())
						.gameStatus(null)
						.gameTime(null)
						.gender(gameInfo.getGender())
						.homeScore(iHomeScore)
						.homeScoreSum(iHomeScoreSum)
						.homeSetScore(iHomeSetScore)
						.homeTeam(gameInfo.getHomeTeam())
						.homeWL(null)
						.roundSeq(gameInfo.getRoundSeq())
						.setNum(gameInfo.getSetNum())
						.setTime(null)
						.spectatorNumber(null)
						.totalSetTime(null)				
						.build();
				
				gameService.saveGameInfo(requestScore);
				
//				listUpdateGameInfo.add(updateGameInfo);
			}
		}
		
//		updateSetScore(listUpdateGameInfo);
	}
	
	
	public void updateSetScore() {
		
		Map<String, String> currentScore = new HashMap<String, String>();
		currentScore = playService.searchCurrentScore();
		
		int iSetNum = Integer.parseInt(String.valueOf(currentScore.get("setNum")));
		int iHomeScore = Integer.parseInt(String.valueOf(currentScore.get("homeScore")));
		int iAwayScore = Integer.parseInt(String.valueOf(currentScore.get("awayScore")));
		
		int iHomeSetScore = 0;
		int iAwaySetScore = 0;
		int iHomeScoreSum = 0;
		int iAwayScoreSum = 0;
		
		if (iHomeScore == 25) {
			iHomeSetScore++;
		}
		
		if (iAwayScore == 25) {
			iAwaySetScore++;
		}
		
		gameService.updateSetInfo(iHomeSetScore, iAwaySetScore);		
	}
	

//	public void updateSetScore(List<Game> listUpdateGameInfo) {
//		
//		int iHomeSetScore = 0;
//		int iAwaySetScore = 0;
//		
//		String strGameCode = listUpdateGameInfo.get(0).getGameCode();
//		String strCompetitionCode = listUpdateGameInfo.get(0).getCompetitionCode();
//		String strHomeTeam = listUpdateGameInfo.get(0).getHomeTeam();
//		String strAwayTeam = listUpdateGameInfo.get(0).getAwayTeam();
//		String strGameDate = listUpdateGameInfo.get(0).getGameDate();
//		int iGameNum = listUpdateGameInfo.get(0).getGameNum();
//		String strGender = listUpdateGameInfo.get(0).getGender();
//		int iRoundSeq = listUpdateGameInfo.get(0).getRoundSeq();
//		
//		for (Game setScore : listUpdateGameInfo) {
//			
//			if (setScore.getSetNum() != 0) {
//				iHomeSetScore += setScore.getHomeSetScore();
//				iAwaySetScore += setScore.getAwaySetScore();
//			}
//		}
//		
//		// 경기 종합 정보 업데이트
//				
//		GameDto.Request requestSetScore = GameDto.Request.builder()
//				.gameCode(strGameCode)
//				.awayScore(0)
//				.awayScoreSum(0)
//				.awaySetScore(iAwaySetScore)
//				.awayTeam(strAwayTeam)
//				.awayWL(null)
//				.broadcaster(null)
//				.competitionCode(strCompetitionCode)
//				.gameDate(strGameDate)
//				.gameDay(null)
//				.gameLocation(null)
//				.gameNum(iGameNum)
//				.gameStatus(null)
//				.gameTime(null)
//				.gender(strGender)
//				.homeScore(0)
//				.homeScoreSum(0)
//				.homeSetScore(iHomeSetScore)
//				.homeTeam(strHomeTeam)
//				.homeWL(null)
//				.roundSeq(iRoundSeq)
//				.setNum(0)
//				.setTime(null)
//				.spectatorNumber(null)
//				.totalSetTime(null)
//				.build();
//		
//		gameService.saveSetInfo(requestSetScore);				
//	}
}
