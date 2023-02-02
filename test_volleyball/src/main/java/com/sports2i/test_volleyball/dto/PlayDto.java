package com.sports2i.test_volleyball.dto;

import com.sports2i.test_volleyball.model.Play;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


public class PlayDto {
	
	@Data
//	@AllArgsConstructor
//	@JsonInclude(Include.NON_NULL)
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
		private int openTry;
		private int openSuccess;
		private int openBlocked;
		private int openFault;
		private int syncTry;
		private int syncSuccess;
		private int syncBlocked;
		private int syncFault;
		private int slideTry;
		private int slideSuccess;
		private int slideBlocked;
		private int slideFault;
		private int backTry;
		private int backSuccess;
		private int backBlocked;
		private int backFault;
		private int quickTry;
		private int quickSuccess;
		private int quickBlocked;
		private int quickFault;
		private int cQuickTry;
		private int cQuickSuccess;
		private int cQuickBlocked;
		private int cQuickFault;
		private int serveTry;
		private int serveSuccess;
		private int serveBlocked;
		private int serveFault;
		private int digTry;
		private int digSuccess;	
		private int digFault;
		private int setTry;
		private int setSuccess;
		private int setBlocked;
		private int setFault;
		private int receiveTry;
		private int receiveSuccess;
		private int receiveFailure;
		private int blockTry;
		private int blockSuccess;
		private int blockEffective;
		private int blockFailure;
		private int blockFault;
		private int blockAssist;
		private int penalty;
		private int totalFault;
		
		@Builder
		private Request(String competitionCode, String gender, String gameCode, int setNum, int rallySeq, int homeScore, int awayScore,
				String teamId, String participantId, String mainAction, String detailAction, int openTry, int openSuccess, int openBlocked, int openFault,
				int syncTry, int syncSuccess, int syncBlocked, int syncFault, int slideTry, int slideSuccess,
				int slideBlocked, int slideFault, int backTry, int backSuccess, int backBlocked, int backFault,
				int quickTry, int quickSuccess, int quickBlocked, int quickFault, int cQuickTry, int cQuickSuccess,
				int cQuickBlocked, int cQuickFault, int serveTry, int serveSuccess, int serveBlocked, int serveFault,
				int digTry, int digSuccess, int digFault, int setTry, int setSuccess, int setBlocked, int setFault,
				int receiveTry, int receiveSuccess, int receiveFailure, int blockTry, int blockSuccess,
				int blockEffective, int blockFailure, int blockFault, int blockAssist, int penalty, int totalFault) {
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
					.quickTry(cQuickTry)
					.quickSuccess(cQuickSuccess)
					.quickBlocked(cQuickBlocked)
					.quickFault(cQuickFault)
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
		private int openTry;
		private int openSuccess;
		private int openBlocked;
		private int openFault;
		private int syncTry;
		private int syncSuccess;
		private int syncBlocked;
		private int syncFault;
		private int slideTry;
		private int slideSuccess;
		private int slideBlocked;
		private int slideFault;
		private int backTry;
		private int backSuccess;
		private int backBlocked;
		private int backFault;
		private int quickTry;
		private int quickSuccess;
		private int quickBlocked;
		private int quickFault;
		private int cQuickTry;
		private int cQuickSuccess;
		private int cQuickBlocked;
		private int cQuickFault;
		private int serveTry;
		private int serveSuccess;
		private int serveBlocked;
		private int serveFault;
		private int digTry;
		private int digSuccess;	
		private int digFault;
		private int setTry;
		private int setSuccess;
		private int setBlocked;
		private int setFault;
		private int receiveTry;
		private int receiveSuccess;
		private int receiveFailure;
		private int blockTry;
		private int blockSuccess;
		private int blockEffective;
		private int blockFailure;
		private int blockFault;
		private int blockAssist;
		private int penalty;
		private int totalFault;
		
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
			this.openTry = play.getOpenTry();
			this.openSuccess = play.getOpenSuccess();
			this.openBlocked = play.getOpenBlocked();
			this.openFault = play.getOpenFault();
			this.syncTry = play.getSyncTry();
			this.syncSuccess = play.getSyncSuccess();
			this.syncBlocked = play.getSyncBlocked();
			this.syncFault = play.getSyncFault();
			this.slideTry = play.getSlideTry();
			this.slideSuccess = play.getSlideSuccess();
			this.slideBlocked = play.getSlideBlocked();
			this.slideFault = play.getSlideFault();
			this.backTry = play.getBackTry();
			this.backSuccess = play.getBackSuccess();
			this.backBlocked = play.getBackBlocked();
			this.backFault = play.getBackFault();
			this.quickTry = play.getQuickTry();
			this.quickSuccess = play.getQuickSuccess();
			this.quickBlocked = play.getQuickBlocked();
			this.quickFault = play.getQuickFault();
			this.cQuickTry = play.getCQuickTry();
			this.cQuickSuccess = play.getCQuickSuccess();
			this.cQuickBlocked = play.getCQuickBlocked();
			this.cQuickFault = play.getCQuickFault();
			this.serveTry = play.getServeTry();
			this.serveSuccess = play.getServeSuccess();
			this.serveBlocked = play.getServeBlocked();
			this.serveFault = play.getServeFault();
			this.digTry = play.getDigTry();
			this.digSuccess = play.getDigSuccess();
			this.digFault = play.getDigFault();
			this.setTry = play.getSetTry();
			this.setSuccess = play.getSetSuccess();
			this.setFault = play.getSetFault();
			this.receiveTry = play.getReceiveTry();
			this.receiveSuccess = play.getReceiveSuccess();
			this.receiveFailure = play.getReceiveFailure();
			this.blockTry = play.getBlockTry();
			this.blockSuccess = play.getBlockSuccess();
			this.blockEffective = play.getBlockEffective();
			this.blockFailure = play.getBlockFailure();
			this.blockFault = play.getBlockFault();
			this.blockAssist = play.getBlockAssist();
			this.penalty = play.getPenalty();
			this.totalFault = play.getTotalFault();				
		}
	}
}