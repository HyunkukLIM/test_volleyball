package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Actiondictionary;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
public class ActiondictionaryDto {
	
	public static class Request {
		
		private int codeOrder;
		private String mainCode;
		private String codeName;
		private String statColumn;
		private String statValue;
		
		@Builder
		public Request(int codeOrder, String mainCode, String codeName, String statColumn, String statValue) {
			super();
			this.codeOrder = codeOrder;
			this.mainCode = mainCode;
			this.codeName = codeName;
			this.statColumn = statColumn;
			this.statValue = statValue;
		}
		
		
		public Actiondictionary toEntity() {
			Actiondictionary actiondictionary = Actiondictionary.builder()
					.codeOrder(codeOrder)
					.mainCode(mainCode)
					.codeName(codeName)
					.statColumn(statColumn)
					.statValue(statValue)
					.build();
			return actiondictionary;
		}		
	}
	
	@Getter
	public static class Response {
		
		private int codeOrder;
		private String mainCode;
		private String codeName;
		private String statColumn;
		private String statValue;
		
		public Response(Actiondictionary actiondictionary) {
			
			this.codeOrder = actiondictionary.getCodeOrder();
			this.mainCode = actiondictionary.getMainCode();
			this.codeName = actiondictionary.getCodeName();
			this.statColumn = actiondictionary.getStatColumn();
			this.statValue = actiondictionary.getStatValue();
		}
	}
}
