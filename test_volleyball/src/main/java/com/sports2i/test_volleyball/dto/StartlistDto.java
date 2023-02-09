package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Startlist;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
public class StartlistDto {
	
	public static class Request {
		
		private String competitionCode;
		private String gender;
		private String gameCode;
		private String homeAway;
		private String teamId;
		private String teamName;
		private String startingReserve;
		private String participantId;
		private int startingOrder;
		private String participantName;
		private String participantPosition;
		private String participantBIB;
		
		@Builder
		public Request(String competitionCode, String gender, String gameCode, String homeAway, String teamId,
				String teamName, String startingReserve, String participantId, int startingOrder,
				String participantName, String participantPosition, String participantBIB) {
			super();
			this.competitionCode = competitionCode;
			this.gender = gender;
			this.gameCode = gameCode;
			this.homeAway = homeAway;
			this.teamId = teamId;
			this.teamName = teamName;
			this.startingReserve = startingReserve;
			this.participantId = participantId;
			this.startingOrder = startingOrder;
			this.participantName = participantName;
			this.participantPosition = participantPosition;
			this.participantBIB = participantBIB;
		}
		
		public Startlist toEntity() {
			Startlist startlist = Startlist.builder()
					.competitionCode(competitionCode)
					.gender(gender)
					.gameCode(gameCode)
					.homeAway(homeAway)
					.teamId(teamId)
					.teamName(teamName)
					.startingReserve(startingReserve)
					.participantId(participantId)
					.startingOrder(startingOrder)
					.participantName(participantName)
					.participantPosition(participantPosition)
					.participantBIB(participantBIB)
					.build();
			return startlist;					
		}		
	}
	
	@Getter
	public static class Response {
		
		private String competitionCode;
		private String gender;
		private String gameCode;
		private String homeAway;
		private String teamId;
		private String teamName;
		private String startingReserve;
		private String participantId;
		private int startingOrder;
		private String participantName;
		private String participantPosition;
		private String participantBIB;
		
		public Response(Startlist startlist) {
			
			this.competitionCode = startlist.getCompetitionCode();
			this.gender = startlist.getGender();
			this.gameCode = startlist.getGameCode();
			this.homeAway = startlist.getHomeAway();
			this.teamId = startlist.getTeamId();
			this.teamName = startlist.getTeamName();
			this.startingReserve = startlist.getStartingReserve();
			this.participantId = startlist.getParticipantId();
			this.startingOrder = startlist.getStartingOrder();
			this.participantName = startlist.getParticipantName();
			this.participantPosition = startlist.getParticipantPosition();
			this.participantBIB = startlist.getParticipantBIB();					
		}
	}		
}
