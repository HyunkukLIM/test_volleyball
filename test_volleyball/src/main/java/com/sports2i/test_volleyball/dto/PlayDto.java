package com.sports2i.test_volleyball.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sports2i.test_volleyball.model.Play;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


public class PlayDto {
	
	@Data
	@JsonInclude(Include.NON_NULL)
//	@AllArgsConstructor
//	@Builder
	public static class Request {
		
		private String competitionCode;
		private String gender;
		private String gameCode;
		private int setNum;
		private int rallySeq;
		private int homeScore;
		private int awayScore;
		private String teamId;
		private String participantId;
		private String mainAction;
		private String detailAction;
		private int actionSeq;
		private String openTry;
		private String openSuccess;
		private String openBlocked;
		private String openFault;
		private String syncTry;
		private String syncSuccess;
		private String syncBlocked;
		private String syncFault;
		private String slideTry;
		private String slideSuccess;
		private String slideBlocked;
		private String slideFault;
		private String backTry;
		private String backSuccess;
		private String backBlocked;
		private String backFault;
		private String quickTry;
		private String quickSuccess;
		private String quickBlocked;
		private String quickFault;
		private String cQuickTry;
		private String cQuickSuccess;
		private String cQuickBlocked;
		private String cQuickFault;
		private String serveTry;
		private String serveSuccess;
		private String serveBlocked;
		private String serveFault;
		private String digTry;
		private String digSuccess;	
		private String digFault;
		private String setTry;
		private String setSuccess;
		private String setBlocked;
		private String setFault;
		private String receiveTry;
		private String receiveSuccess;
		private String receiveFailure;
		private String blockTry;
		private String blockSuccess;
		private String blockEffective;
		private String blockFailure;
		private String blockFault;
		private String blockAssist;
		private int penalty;
		private int totalFault;
		
		@Builder
		private Request(String competitionCode, String gender, String gameCode, int setNum, int rallySeq, int homeScore, int awayScore,
				String teamId, String participantId, String mainAction, String detailAction, String openTry, String openSuccess, String openBlocked, String openFault,
				String syncTry, String syncSuccess, String syncBlocked, String syncFault, String slideTry, String slideSuccess,
				String slideBlocked, String slideFault, String backTry, String backSuccess, String backBlocked, String backFault,
				String quickTry, String quickSuccess, String quickBlocked, String quickFault, String cQuickTry, String cQuickSuccess,
				String cQuickBlocked, String cQuickFault, String serveTry, String serveSuccess, String serveBlocked, String serveFault,
				String digTry, String digSuccess, String digFault, String setTry, String setSuccess, String setBlocked, String setFault,
				String receiveTry, String receiveSuccess, String receiveFailure, String blockTry, String blockSuccess,
				String blockEffective, String blockFailure, String blockFault, String blockAssist, int penalty, int totalFault) {
			super();
			this.competitionCode = competitionCode;
			this.gender = gender;
			this.gameCode = gameCode;
			this.setNum = setNum;
			this.rallySeq = rallySeq;
			this.homeScore = homeScore;
			this.awayScore = awayScore;
			this.teamId = teamId;
			this.participantId = participantId;
			this.mainAction = mainAction;
			this.detailAction = detailAction;
			this.openTry = openTry;
			this.openSuccess = openSuccess;
			this.openBlocked = openBlocked;
			this.openFault = openFault;
			this.syncTry = syncTry;
			this.syncSuccess = syncSuccess;
			this.syncBlocked = syncBlocked;
			this.syncFault = syncFault;
			this.slideTry = slideTry;
			this.slideSuccess = slideSuccess;
			this.slideBlocked = slideBlocked;
			this.slideFault = slideFault;
			this.backTry = backTry;
			this.backSuccess = backSuccess;
			this.backBlocked = backBlocked;
			this.backFault = backFault;
			this.quickTry = quickTry;
			this.quickSuccess = quickSuccess;
			this.quickBlocked = quickBlocked;
			this.quickFault = quickFault;
			this.cQuickTry = cQuickTry;
			this.cQuickSuccess = cQuickSuccess;
			this.cQuickBlocked = cQuickBlocked;
			this.cQuickFault = cQuickFault;
			this.serveTry = serveTry;
			this.serveSuccess = serveSuccess;
			this.serveBlocked = serveBlocked;
			this.serveFault = serveFault;
			this.digTry = digTry;
			this.digSuccess = digSuccess;
			this.digFault = digFault;
			this.setTry = setTry;
			this.setSuccess = setSuccess;
			this.setBlocked = setBlocked;
			this.setFault = setFault;
			this.receiveTry = receiveTry;
			this.receiveSuccess = receiveSuccess;
			this.receiveFailure = receiveFailure;
			this.blockTry = blockTry;
			this.blockSuccess = blockSuccess;
			this.blockEffective = blockEffective;
			this.blockFailure = blockFailure;
			this.blockFault = blockFault;
			this.blockAssist = blockAssist;
			this.penalty = penalty;
			this.totalFault = totalFault;
		}
		
		public Play toEntity() {
			Play play = Play.builder()
					.competitionCode(competitionCode)
					.gender(gender)
					.gameCode(gameCode)
					.setNum(setNum)
					.rallySeq(rallySeq)
					.homeScore(homeScore)
					.awayScore(awayScore)
					.teamId(teamId)
					.participantId(participantId)
					.mainAction(mainAction)
					.detailAction(detailAction)
					.openTry(openTry)
					.openSuccess(openSuccess)
					.openBlocked(openBlocked)
					.openFault(openFault)
					.syncTry(syncTry)
					.syncSuccess(syncSuccess)
					.syncBlocked(syncBlocked)
					.syncFault(syncFault)
					.slideTry(slideTry)
					.slideSuccess(slideSuccess)
					.slideBlocked(slideBlocked)
					.slideFault(slideFault)
					.backTry(backTry)
					.backSuccess(backSuccess)
					.backBlocked(backBlocked)
					.backFault(backFault)
					.quickTry(quickTry)
					.quickSuccess(quickSuccess)
					.quickBlocked(quickBlocked)
					.quickFault(quickFault)
					.cQuickTry(cQuickTry)
					.cQuickSuccess(cQuickSuccess)
					.cQuickBlocked(cQuickBlocked)
					.cQuickFault(cQuickFault)
					.serveTry(serveTry)
					.serveSuccess(serveSuccess)
					.serveBlocked(serveBlocked)
					.serveFault(serveFault)
					.digTry(digTry)
					.digSuccess(digSuccess)
					.digFault(digFault)
					.setTry(setTry)
					.setSuccess(setSuccess)
					.setBlocked(setBlocked)
					.setFault(setFault)
					.receiveTry(receiveTry)
					.receiveSuccess(receiveSuccess)
					.receiveFailure(receiveFailure)
					.blockTry(blockTry)
					.blockSuccess(blockSuccess)
					.blockEffective(blockEffective)
					.blockFailure(blockFailure)
					.blockFault(blockFault)
					.blockAssist(blockAssist)
					.penalty(penalty)
					.totalFault(totalFault)
					.build();
			return play;
		}		
	}
	
	@Getter
	public static class Response {
		
		private String competitionCode;
		private String gender;
		private String gameCode;
		private int setNum;
		private int rallySeq;
		private int homeScore;
		private int awayScore;
		private String teamId;
		private String participantId;
		private String mainAction;
		private String detailAction;
		private int actionSeq;
		
		public Response(Play play) {
			
			this.competitionCode = play.getCompetitionCode();
			this.gender = play.getGender();
			this.gameCode = play.getGameCode();
			this.setNum = play.getSetNum();
			this.rallySeq = play.getRallySeq();
			this.homeScore = play.getHomeScore();
			this.awayScore = play.getAwayScore();
			this.teamId = play.getTeamId();
			this.participantId = play.getParticipantId();
			this.mainAction = play.getMainAction();
			this.detailAction = play.getDetailAction();
			this.actionSeq = play.getActionSeq();		
		}
	}
}