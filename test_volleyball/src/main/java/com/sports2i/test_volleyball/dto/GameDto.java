package com.sports2i.test_volleyball.dto;

import javax.persistence.Column;

import com.sports2i.test_volleyball.model.Game;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
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
		private String homeScore;
		private String awayScore;
		private String firstSetTime;
		private String secondSetTime;
		private String thirdSetTime;
		private String fourthSetTime;
		private String fifthSetTime;
		
		@Builder
		public Request(String competitionCode, String gender, int roundSeq, int gameNum, String gameCode,
				String gameDate, String gameDay, String gameTime, String gameLocation, String gameStatus,
				String broadcaster, String homeTeam, String awayTeam, String homeWL, String awayWL, String homeScore,
				String awayScore, String firstSetTime, String secondSetTime, String thirdSetTime, String fourthSetTime,
				String fifthSetTime) {
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
			this.homeScore = homeScore;
			this.awayScore = awayScore;
			this.firstSetTime = firstSetTime;
			this.secondSetTime = secondSetTime;
			this.thirdSetTime = thirdSetTime;
			this.fourthSetTime = fourthSetTime;
			this.fifthSetTime = fifthSetTime;
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
					.homeScore(homeScore)
					.awayScore(awayScore)
					.firstSetTime(firstSetTime)
					.secondSetTime(secondSetTime)
					.thirdSetTime(thirdSetTime)
					.fourthSetTime(fourthSetTime)
					.fifthSetTime(fifthSetTime)
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
		private String homeScore;
		private String awayScore;
		private String firstSetTime;
		private String secondSetTime;
		private String thirdSetTime;
		private String fourthSetTime;
		private String fifthSetTime;
		
		
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
			this.homeScore = game.getHomeScore();
			this.awayScore = game.getAwayScore();			
			this.firstSetTime = game.getFirstSetTime();
			this.secondSetTime = game.getSecondSetTime();
			this.thirdSetTime = game.getThirdSetTime();
			this.fourthSetTime = game.getFourthSetTime();
			this.fifthSetTime = game.getFifthSetTime();
		}
	}
}
