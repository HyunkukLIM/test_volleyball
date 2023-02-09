package com.sports2i.test_volleyball.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.sports2i.test_volleyball.model.Teamroster;

import lombok.Builder;
import lombok.Getter;

public class TeamrosterDto {

	public static class Request {
		
		private String teamId;
		private String teamName;
		private String role;
		private String participantName;
		private String participantId;
		private String participantPosition;
		private String participantBIB;
		
		@Builder
		public Request(String teamId, String teamName, String role, String participantName, String participantId,
				String participantPosition, String participantBIB) {
			super();
			this.teamId = teamId;
			this.teamName = teamName;
			this.role = role;
			this.participantName = participantName;
			this.participantId = participantId;
			this.participantPosition = participantPosition;
			this.participantBIB = participantBIB;
		}
		
		public Teamroster toEntity() {
			
			Teamroster teamroster = Teamroster.builder()
					.teamId(teamId)
					.teamName(teamName)
					.role(role)
					.participantName(participantName)
					.participantId(participantId)
					.participantPosition(participantPosition)
					.participantBIB(participantBIB)
					.build();
			return teamroster;
		}		
	}
	
	@Getter
	public static class Response {
		
		private String teamId;
		private String teamName;
		private String role;
		private String participantName;
		private String participantId;
		private String participantPosition;
		private String participantBIB;
		
		public Response(Teamroster teamroster) {
			
			this.teamId = teamroster.getTeamId();
			this.teamName = teamroster.getTeamName();
			this.role = teamroster.getRole();
			this.participantName = teamroster.getParticipantName();
			this.participantId = teamroster.getParticipantId();
			this.participantPosition = teamroster.getParticipantPosition();
			this.participantBIB = teamroster.getParticipantBIB();
		}
	}
}
