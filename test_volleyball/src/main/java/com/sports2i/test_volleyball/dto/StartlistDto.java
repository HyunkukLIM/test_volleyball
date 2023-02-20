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
		private String role;		
		private String participantId;
		private String participantName;
		private String startingReserve;
		private String participantPosition;
		private String participantBIB;
		
		@Builder
		public Request(String competitionCode, String gender, String gameCode, String homeAway, String teamId,
				String teamName, String role, String participantId, String participantName, String startingReserve,
				String participantPosition, String participantBIB) {
			super();
			this.competitionCode = competitionCode;
			this.gender = gender;
			this.gameCode = gameCode;
			this.homeAway = homeAway;
			this.teamId = teamId;
			this.teamName = teamName;
			this.role = role;
			this.participantId = participantId;
			this.participantName = participantName;
			this.startingReserve = startingReserve;
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
					.role(role)
					.participantId(participantId)
					.participantName(participantName)
					.startingReserve(startingReserve)
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
		private String role;		
		private String participantId;
		private String participantName;
		private String startingReserve;
		private String participantPosition;
		private String participantBIB;
		
		public Response(Startlist startlist) {
			
			this.competitionCode = startlist.getCompetitionCode();
			this.gender = startlist.getGender();
			this.gameCode = startlist.getGameCode();
			this.homeAway = startlist.getHomeAway();
			this.teamId = startlist.getTeamId();
			this.teamName = startlist.getTeamName();
			this.role = startlist.getRole();
			this.participantId = startlist.getParticipantId();
			this.participantName = startlist.getParticipantName();
			this.startingReserve = startlist.getStartingReserve();
			this.participantPosition = startlist.getParticipantPosition();
			this.participantBIB = startlist.getParticipantBIB();					
		}
	}		
}
