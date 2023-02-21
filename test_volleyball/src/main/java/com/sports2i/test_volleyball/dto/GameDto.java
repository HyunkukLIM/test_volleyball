package com.sports2i.test_volleyball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sports2i.test_volleyball.model.Game;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@JsonInclude(Include.NON_NULL)
public class GameDto {
	

	public static class Request {
		
		private String competitionCode;		
		private String gender;
		private int roundSeq;
		private int gameNum;
		private String gameCode;
		private String gameDate;	
		private String gameDay;
		private String gameTime;
		private String gameLocation;
		private String gameStatus;
		private String broadcaster;
		private String homeTeam;
		private String awayTeam;
		private String homeWL;
		private String awayWL;
		private int setNum;
		private int homeSetScore;
		private int awaySetScore;		
		private int homeScore;
		private int awayScore;
		private int homeScoreSum;
		private int awayScoreSum;
		private int setTime;
		private int totalSetTime;;
		private String spectatorNumber;
		
		@Builder
		public Request(String competitionCode, String gender, int roundSeq, int gameNum, String gameCode,
				String gameDate, String gameDay, String gameTime, String gameLocation, String gameStatus,
				String broadcaster, String homeTeam, String awayTeam, String homeWL, String awayWL, int setNum,
				int homeSetScore, int awaySetScore, int homeScore, int awayScore, int homeScoreSum,
				int awayScoreSum, int setTime, int totalSetTime, String spectatorNumber) {
			super();
			this.competitionCode = competitionCode;
			this.gender = gender;
			this.roundSeq = roundSeq;
			this.gameNum = gameNum;
			this.gameCode = gameCode;
			this.gameDate = gameDate;
			this.gameDay = gameDay;
			this.gameTime = gameTime;
			this.gameLocation = gameLocation;
			this.gameStatus = gameStatus;
			this.broadcaster = broadcaster;
			this.homeTeam = homeTeam;
			this.awayTeam = awayTeam;
			this.homeWL = homeWL;
			this.awayWL = awayWL;
			this.setNum = setNum;
			this.homeSetScore = homeSetScore;
			this.awaySetScore = awaySetScore;
			this.homeScore = homeScore;
			this.awayScore = awayScore;
			this.homeScoreSum = homeScoreSum;
			this.awayScoreSum = awayScoreSum;
			this.setTime = setTime;
			this.totalSetTime = totalSetTime;
			this.spectatorNumber = spectatorNumber;
		}
		
		public Game toEntity() {
			Game game = Game.builder()
					.competitionCode(competitionCode)
					.gender(gender)
					.roundSeq(roundSeq)
					.gameNum(gameNum)
					.gameCode(gameCode)
					.gameDate(gameDate)
					.gameDay(gameDay)
					.gameTime(gameTime)
					.gameLocation(gameLocation)
					.gameStatus(gameStatus)
					.broadcaster(broadcaster)
					.homeTeam(homeTeam)
					.awayTeam(awayTeam)
					.homeWL(homeWL)
					.awayWL(awayWL)
					.setNum(setNum)
					.homeSetScore(homeSetScore)
					.awaySetScore(awaySetScore)
					.homeScore(homeScore)
					.awayScore(awayScore)
					.homeScoreSum(homeScoreSum)
					.awayScoreSum(awayScoreSum)
					.setTime(setTime)
					.totalSetTime(totalSetTime)					
					.spectatorNumber(spectatorNumber)
					.build();
			return game;
		}		
	}
	
	@Getter
	public static class Response {
		
		private String competitionCode;		
		private String gender;
		private int roundSeq;
		private int gameNum;
		private String gameCode;
		private String gameDate;	
		private String gameDay;
		private String gameTime;
		private String gameLocation;
		private String gameStatus;
		private String broadcaster;
		private String homeTeam;
		private String awayTeam;
		private String homeWL;
		private String awayWL;
		private int setNum;
		private int homeSetScore;
		private int awaySetScore;		
		private int homeScore;
		private int awayScore;
		private int homeScoreSum;
		private int awayScoreSum;
		private int setTime;
		private int totalSetTime;;
		private String spectatorNumber;
		
		
		public Response(Game game) {
			
			this.competitionCode = game.getCompetitionCode();
			this.gender = game.getGender();
			this.roundSeq = game.getRoundSeq();
			this.gameNum = game.getGameNum();
			this.gameCode = game.getGameCode();
			this.gameDate = game.getGameDate();
			this.gameDay = game.getGameDay();
			this.gameTime = game.getGameTime();
			this.gameLocation = game.getGameLocation();
			this.gameStatus = game.getGameStatus();
			this.broadcaster = game.getBroadcaster();
			this.homeTeam = game.getHomeTeam();
			this.awayTeam = game.getAwayTeam();
			this.homeWL = game.getHomeWL();
			this.awayWL = game.getAwayWL();
			this.setNum = game.getSetNum();
			this.homeSetScore = game.getHomeSetScore();
			this.awaySetScore = game.getAwaySetScore();
			this.homeScore = game.getHomeScore();
			this.awayScore = game.getAwayScore();
			this.homeScoreSum = game.getHomeScoreSum();
			this.awayScoreSum = game.getAwayScoreSum();
			this.setTime = game.getSetTime();
			this.totalSetTime = game.getTotalSetTime();
			this.spectatorNumber = game.getSpectatorNumber();
		}
	}
}
