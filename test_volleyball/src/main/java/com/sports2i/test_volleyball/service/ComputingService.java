package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.dto.StartlistDto;
import com.sports2i.test_volleyball.model.Game;

@Service
public class ComputingService {

	@Autowired
	private PlayService playService;
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private StartlistService startlistService;
	
	@Transactional
	public Map<String, String> updateGameInfo(String strActionCase, int iSetNum) {
		
		String strGameCode = "22-23VMENR3-123";
		String strGameStatus = null;
		Map<String, String> mResponse = new HashMap<>(); 
		
		int iHomeScore = 0;
		int iAwayScore = 0;
		
		switch(strActionCase) {
		
		case "STATUS" :
				
			Map<String, String> gameStatus = playService.searchGameStatus();
			
			String strMainAction = gameStatus.get("mainAction");
			
			switch(strMainAction) {
			
			case "START" : 
				strGameStatus = "LIVE";
				mResponse.put("Response", strGameStatus);
				break;
				
			case "END" : 
				strGameStatus = "INTERMEDIATE";
				mResponse.put("Response", strGameStatus);
				break;
			}
			
			break;
			
		case "SCORE" :
			
			Map<String, String> currentScore = playService.searchCurrentScore(iSetNum);
					
			iHomeScore = Integer.parseInt(String.valueOf(currentScore.get("homeScore")));
			iAwayScore = Integer.parseInt(String.valueOf(currentScore.get("awayScore")));
			
			mResponse.put("Response", "점수 입력 완료!");
			
			break;
		}
		
		List<Game> listGameInfo = gameService.searchSetInfo(strGameCode);
		
		// 세트 별 경기 정보 업데이트
		for (Game gameInfo : listGameInfo) {
			
			if (iSetNum == gameInfo.getSetNum()) {
				
				GameDto.Request requestScore = GameDto.Request.builder()
						.gameCode(gameInfo.getGameCode())
						.awayScore(iAwayScore)
						.awayScoreSum(0)
						.awaySetScore(0)
						.awayTeam(gameInfo.getAwayTeam())
						.awayWL(null)
						.broadcaster(null)
						.competitionCode(gameInfo.getCompetitionCode())
						.gameDate(gameInfo.getGameDate())
						.gameDay(null)
						.gameLocation(null)
						.gameNum(gameInfo.getGameNum())
						.gameStatus(strGameStatus)
						.gameTime(null)
						.gender(gameInfo.getGender())
						.homeScore(iHomeScore)
						.homeScoreSum(0)
						.homeSetScore(0)
						.homeTeam(gameInfo.getHomeTeam())
						.homeWL(null)
						.roundSeq(gameInfo.getRoundSeq())
						.setNum(gameInfo.getSetNum())
						.setTime(0)
						.spectatorNumber(null)
						.totalSetTime(0)				
						.build();
				
				gameService.saveGameInfo(requestScore);
			}
		}
		
		return mResponse;
	}
	
	
//	public void updateSetScore(List<Game> listUpdateGameInfo) {
//	
//	int iHomeSetScore = 0;
//	int iAwaySetScore = 0;
//	
//	String strGameCode = listUpdateGameInfo.get(0).getGameCode();
//	String strCompetitionCode = listUpdateGameInfo.get(0).getCompetitionCode();
//	String strHomeTeam = listUpdateGameInfo.get(0).getHomeTeam();
//	String strAwayTeam = listUpdateGameInfo.get(0).getAwayTeam();
//	String strGameDate = listUpdateGameInfo.get(0).getGameDate();
//	int iGameNum = listUpdateGameInfo.get(0).getGameNum();
//	String strGender = listUpdateGameInfo.get(0).getGender();
//	int iRoundSeq = listUpdateGameInfo.get(0).getRoundSeq();
//	
//	for (Game setScore : listUpdateGameInfo) {
//		
//		if (setScore.getSetNum() != 0) {
//			iHomeSetScore += setScore.getHomeSetScore();
//			iAwaySetScore += setScore.getAwaySetScore();
//		}
//	}
//	
//	// 경기 종합 정보 업데이트
//			
//	GameDto.Request requestSetScore = GameDto.Request.builder()
//			.gameCode(strGameCode)
//			.awayScore(0)
//			.awayScoreSum(0)
//			.awaySetScore(iAwaySetScore)
//			.awayTeam(strAwayTeam)
//			.awayWL(null)
//			.broadcaster(null)
//			.competitionCode(strCompetitionCode)
//			.gameDate(strGameDate)
//			.gameDay(null)
//			.gameLocation(null)
//			.gameNum(iGameNum)
//			.gameStatus(null)
//			.gameTime(null)
//			.gender(strGender)
//			.homeScore(0)
//			.homeScoreSum(0)
//			.homeSetScore(iHomeSetScore)
//			.homeTeam(strHomeTeam)
//			.homeWL(null)
//			.roundSeq(iRoundSeq)
//			.setNum(0)
//			.setTime(null)
//			.spectatorNumber(null)
//			.totalSetTime(null)
//			.build();
//	
//	gameService.saveSetInfo(requestSetScore);				
//}
	
	@Transactional	
	public void updateSetScore() {
		
		List<Map<String, String>> listCurrentScore = new ArrayList<>();
		listCurrentScore = playService.searchCurrentSetScore();
		
		int iHomeSetScore = 0;
		int iAwaySetScore = 0;
		int iHomeScoreSum = 0;
		int iAwayScoreSum = 0;
		
		for (Map<String, String> currentScore : listCurrentScore) {
			
//			int iSetNum = Integer.parseInt(String.valueOf(currentScore.get("setNum")));
			int iHomeScore = Integer.parseInt(String.valueOf(currentScore.get("homeScore")));
			int iAwayScore = Integer.parseInt(String.valueOf(currentScore.get("awayScore")));
			
			if (iHomeScore == 25) {
				iHomeSetScore++;
			}
			
			if (iAwayScore == 25) {
				iAwaySetScore++;
			}			
			
			iHomeScoreSum += iHomeScore;
			iAwayScoreSum += iAwayScore;
			
		}		
		
		gameService.updateSetInfo(iHomeSetScore, iAwaySetScore, iHomeScoreSum, iAwayScoreSum);		
	}
	
	public void updateSetTime() {
		
		
	}
	
	@Transactional
	public void updateGameStatus() {
		
		
	}
	
	@Transactional
	public void insertLineup(List<StartlistDto.Request> requests) {
		
		for (StartlistDto.Request request : requests) {
			
			startlistService.savePlayerInfo(request);
		}
	}
}
