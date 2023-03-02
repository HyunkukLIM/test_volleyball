package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Workforce;

import lombok.Builder;
import lombok.Getter;

public class WorkforceDto {	

	public static class Request {
		
		private String year;
		private String competitionCode;
		private String participantId;
		private String participantName;
		private String organization;
		private String role;
		private String position;	
		
		@Builder
		public Request(String year, String competitionCode, String participantId, String participantName, String organization, String role,
				String position) {
			super();
			this.year = year;
			this.competitionCode = competitionCode;
			this.participantId = participantId;
			this.participantName = participantName;
			this.organization = organization;
			this.role = role;
			this.position = position;
		}
		
		public Workforce toEntity() {
			Workforce workforce = Workforce.builder()
					.year(year)
					.competitionCode(competitionCode)
					.participantId(participantId)
					.participantName(participantName)
					.organization(organization)
					.role(role)
					.position(position)
					.build();
			return workforce;
		}
	}
	
	@Getter
	public static class Response {
		
		private String year;
		private String competitionCode;
		private String participantId;
		private String participantName;
		private String organization;
		private String role;
		private String position;
		
		public Response(Workforce workforce) {
			
			this.year = workforce.getYear();
			this.competitionCode = workforce.getCompetitionCode();
			this.participantId = workforce.getParticipantId();
			this.participantName = workforce.getParticipantName();
			this.organization = workforce.getOrganization();
			this.role = workforce.getRole();
			this.position = workforce.getPosition();
		}
	}

}
