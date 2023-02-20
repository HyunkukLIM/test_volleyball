package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Lineup;
import com.sports2i.test_volleyball.model.LineupId;

import lombok.Builder;
import lombok.Getter;

public class LineupDto {

	public static class Request {
		
		private String competitionCode;
		private String gender;
		private LineupId id;
		private String home1st;
		private String home2nd;
		private String home3rd;
		private String home4th;
		private String home5th;
		private String home6th;
		private String away1st;
		private String away2nd;
		private String away3rd;
		private String away4th;
		private String away5th;
		private String away6th;
		
		@Builder	
		public Request(String competitionCode, String gender, LineupId id, String home1st, String home2nd,
				String home3rd, String home4th, String home5th, String home6th, String away1st, String away2nd,
				String away3rd, String away4th, String away5th, String away6th) {
			super();
			this.competitionCode = competitionCode;
			this.gender = gender;
			this.id = id;
			this.home1st = home1st;
			this.home2nd = home2nd;
			this.home3rd = home3rd;
			this.home4th = home4th;
			this.home5th = home5th;
			this.home6th = home6th;
			this.away1st = away1st;
			this.away2nd = away2nd;
			this.away3rd = away3rd;
			this.away4th = away4th;
			this.away5th = away5th;
			this.away6th = away6th;
		}

		public Lineup toEntity() {
			Lineup lineup = Lineup.builder()
					.competitionCode(competitionCode)
					.gender(gender)
					.id(id)
					.home1st(home1st)
					.home2nd(home2nd)
					.home3rd(home3rd)
					.home4th(home4th)
					.home5th(home5th)
					.home6th(home6th)
					.away1st(away1st)
					.away2nd(away2nd)
					.away3rd(away3rd)
					.away4th(away4th)
					.away5th(away5th)
					.away6th(away6th)
					.build();				
			return lineup;
		}
		
		@Getter
		public static class Response {
			
			private String competitionCode;
			private String gender;
			private LineupId id;
			private String home1st;
			private String home2nd;
			private String home3rd;
			private String home4th;
			private String home5th;
			private String home6th;
			private String away1st;
			private String away2nd;
			private String away3rd;
			private String away4th;
			private String away5th;
			private String away6th;
			
			
			public Response(Lineup lineup) {
				
				this.competitionCode = lineup.getCompetitionCode();
				this.gender = lineup.getGender();
				this.id = lineup.getId();
				this.home1st = lineup.getHome1st();
				this.home2nd = lineup.getHome2nd();
				this.home3rd = lineup.getHome3rd();
				this.home4th = lineup.getHome4th();
				this.home5th = lineup.getHome5th();
				this.home6th = lineup.getHome6th();
				this.away1st = lineup.getAway1st();
				this.away2nd = lineup.getAway2nd();
				this.away3rd = lineup.getAway3rd();
				this.away4th = lineup.getAway4th();
				this.away5th = lineup.getAway5th();
				this.away6th = lineup.getAway6th();
				
			}
		}
	}
}
