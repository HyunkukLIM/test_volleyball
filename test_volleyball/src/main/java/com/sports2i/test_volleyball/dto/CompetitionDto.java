package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Competition;

import lombok.Builder;
import lombok.Getter;

public class CompetitionDto {

	public static class Request {
		
		private String category;
		private String competitionCode;
		private String competitionName;
		private String gender;
		private String startDate;
		private String endDate;
		private int totalRoundNum;
		private int totalTeamNum;
		
		@Builder
		public Request(String category, String competitionCode, String competitionName, String gender, String startDate,
				String endDate, int totalRoundNum, int totalTeamNum) {
			super();
			this.category = category;
			this.competitionCode = competitionCode;
			this.competitionName = competitionName;
			this.gender = gender;
			this.startDate = startDate;
			this.endDate = endDate;
			this.totalRoundNum = totalRoundNum;
			this.totalTeamNum = totalTeamNum;
		}
		
		public Competition toEntity() {
			
			Competition competition = Competition.builder()
					.category(category)
					.competitionCode(competitionCode)
					.competitionName(competitionName)
					.gender(gender)
					.startDate(startDate)
					.endDate(endDate)
					.totalRoundNum(totalRoundNum)
					.totalTeamNum(totalTeamNum)
					.build();
				return competition;
		}
	}
	
	@Getter
	public static class Response {
		
		private String category;
		private String competitionCode;
		private String competitionName;
		private String gender;
		private String startDate;
		private String endDate;
		private int totalRoundNum;
		private int totalTeamNum;
		
		public Response(Competition competition) {
			
			this.category = competition.getCategory();
			this.competitionCode = competition.getCompetitionCode();
			this.competitionName = competition.getCompetitionName();
			this.gender = competition.getGender();
			this.startDate = competition.getStartDate();
			this.endDate = competition.getEndDate();
			this.totalRoundNum = competition.getTotalRoundNum();
			this.totalTeamNum = competition.getTotalTeamNum();
		}
	}
}
