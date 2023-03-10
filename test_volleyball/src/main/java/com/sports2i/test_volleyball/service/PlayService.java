package com.sports2i.test_volleyball.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.model.Actiondictionary;
import com.sports2i.test_volleyball.model.Play;
import com.sports2i.test_volleyball.repository.ActiondictionaryRepository;
import com.sports2i.test_volleyball.repository.PlayDtoTime;
import com.sports2i.test_volleyball.repository.PlayRepository;

@Service
public class PlayService {
	
	@Autowired
	private PlayRepository playRepository;
	
	@Autowired
	private ActiondictionaryRepository actiondictionaryRepository;
	
	@Transactional
	public Integer searchLastActionSeq() {
		
		List<Integer> listLastRally = new ArrayList<>();
		listLastRally = playRepository.findLastRallyList();
		
		int iLastRallySeq = 0;
		
		if (listLastRally.size() == 0) {
			
			iLastRallySeq = 1;
		}
		else {
			
			iLastRallySeq = listLastRally.get(0);
			iLastRallySeq++;
		}
		
		return iLastRallySeq;
	}
	
	@Transactional
	public List<Object> searchPlayList() {
		
		// 향후 listLastRally 값에 대한 액션만 불러오도록 코드 수정		
		
		List<Play> listPlayList = new ArrayList<>();
		List<Object> listTotalPlay = new ArrayList<>();
		List<Integer> listLastRally = new ArrayList<>();
		
		listLastRally = playRepository.findLastRallyList();
		listPlayList = playRepository.findByActionList();
		
		for(Integer iRallySeq : listLastRally) {
			
			List<PlayDto.Response> listPlayResponseDto = new ArrayList<>();
			
			for (Play play : listPlayList) {
				if (iRallySeq == play.getRallySeq())
					listPlayResponseDto.add(new PlayDto.Response(play));
			}
			
			listTotalPlay.add(listPlayResponseDto);			
		}
		
		return listTotalPlay;
	}
	
	public Map<String, String> searchGameStatus() {

		return playRepository.findGameStatus();
	}
	
	public String savePlayInfo(List<PlayDto.Request> dtos) {
//		System.out.print(dto.toEntity());
		
		// 입력기에서 들어온 코드를 경기 상세 테이블에서는 곧바로 저장
		
		String strResponse = null;
		
		Actiondictionary statData = new Actiondictionary();
		
		int iLastRallySeq = searchLastActionSeq();
		
		for (PlayDto.Request dto : dtos) {
			
			if (dto.getTeamId().equals("SYSTEM")) {
			
				playRepository.save(dto.toEntity());
				
				strResponse = "STATUS";
			}
			else {
				
				dto.setRallySeq(iLastRallySeq);
				
				String strActionCode = dto.getMainAction().toString();
				
				statData = actiondictionaryRepository.findBymainCode(strActionCode);
				
				String strStatColumn = statData.getStatColumn();
				
				switch(strStatColumn) {
				
					case "openTry" : dto.setOpenTry(strActionCode);
					break;
					case "openSuccess" : dto.setOpenSuccess(strActionCode);
					break;
					case "openBlocked" : dto.setOpenBlocked(strActionCode);
					break;
					case "openFault" : dto.setOpenFault(strActionCode);
					break;
					case "syncTry" : dto.setSyncTry(strActionCode);
					break;
					case "syncSuccess" : dto.setSyncSuccess(strActionCode);
					break;
					case "syncBlocked" : dto.setSyncBlocked(strActionCode);
					break;
					case "syncFault" : dto.setSyncFault(strActionCode);
					break;
					case "slidTry" : dto.setSlideTry(strActionCode);
					break;
					case "slideSuccess" : dto.setSlideSuccess(strActionCode);
					break;
					case "slideBlocked" : dto.setSlideBlocked(strActionCode);
					break;
					case "slideFault" : dto.setSlideFault(strActionCode);
					break;
					case "backTry" : dto.setBackTry(strActionCode);
					break;
					case "backSuccess" : dto.setBackSuccess(strActionCode);
					break;
					case "backBlocked" : dto.setBackBlocked(strActionCode);
					break;
					case "backFault" : dto.setBackFault(strActionCode);
					break;
					case "quickTry" : dto.setQuickTry(strActionCode);
					break;
					case "quickSuccess" : dto.setQuickSuccess(strActionCode);
					break;
					case "quickBlocked" : dto.setQuickBlocked(strActionCode);
					break;
					case "quickFault" : dto.setQuickFault(strActionCode);
					break;
					case "cQuickTry" : dto.setCQuickTry(strStatColumn);
					break;
					case "cQuickSuccess" : dto.setCQuickSuccess(strActionCode);
					break;
					case "cQuickBlocked" : dto.setCQuickBlocked(strActionCode);
					break;
					case "cQuickFault" : dto.setCQuickFault(strActionCode);
					break;
					case "serveTry" : dto.setServeTry(strActionCode);
					break;
					case "serveSuccess" : dto.setServeSuccess(strActionCode);
					break;
					case "serveFault" : dto.setServeFault(strActionCode);
					break;
					case "digTry" : dto.setDigTry(strActionCode);
					break;
					case "digSuccess" : dto.setDigSuccess(strActionCode);
					break;
					case "digFault" : dto.setDigFault(strActionCode);
					break;
					case "setTry" : dto.setSetTry(strActionCode);
					break;
					case "setSuccess" : dto.setSetSuccess(strActionCode);
					break;
					case "setFault" : dto.setSetFault(strActionCode);
					break;
					case "receiveTry" : dto.setReceiveTry(strActionCode);
					break;
					case "receiveSuccess" : dto.setReceiveSuccess(strActionCode);
					break;
					case "receiveFailure" : dto.setReceiveFailure(strActionCode);
					break;
					case "blocktTry" : dto.setBlockTry(strActionCode);
					break;
					case "blockSuccess" : dto.setBlockSuccess(strActionCode);
					break;
					case "blockEffective" : dto.setBlockEffective(strActionCode);
					break;
					case "blockFailure" : dto.setBlockFailure(strActionCode);
					break;
					case "blockFault" : dto.setBlockFault(strActionCode);
					break;
					case "blockAssist" : dto.setBlockAssist(strActionCode);
					break;
				}
				
				playRepository.save(dto.toEntity());
				
				strResponse = "SCORE";
			}
		}
		
		return strResponse;
	}
	
	public Map<String, String> deletePlayList(PlayDto.Request dto) {
		
		Map<String, String> mResponse = new HashMap<>();
		
//		for (PlayDto.Request dto : dtos) {
//			
//			playRepository.delete(dto.toEntity());
//		}
		
		int iFromActionSeq = dto.getActionSeq();
		
		playRepository.deleteFromActionSeq(iFromActionSeq);
		
		mResponse.put("Response", "액션 삭제 완료!");
		
		return mResponse;
	}
	
	@Transactional
	public Map<String, String> searchCurrentScore() {
		
		Map<String, String> currentScore = new HashMap<>();
		currentScore = playRepository.findCurrentScore();
		
		return currentScore;
	}
	
	@Transactional
	public List<Map<String, String>> searchCurrentSetScore() {
		
		List<Map<String, String>> currentScore = new ArrayList<>();
		
		return currentScore = playRepository.findCurrentSetScore();
	}
	
	@Transactional
	public List<PlayDtoTime> searchSetTime() {

		return playRepository.findSetTime();
	}
	
//	@Transactional
//	public Map<String, String> savePlayInfo(PlayDto.Request dto, Integer iLastRallySeq) {
////		System.out.print(dto.toEntity());
//		
//		Map<String, String> mResponse = new HashMap<>();
//		
//		// 입력기에서 들어온 코드를 경기 상세 테이블에서는 곧바로 저장
//		
//		Actiondictionary statData = new Actiondictionary();
//		
//		if (dto.getTeamId().equals("SYSTEM")  
//			&& dto.getMainAction().equals("START")) {
//			playRepository.save(dto.toEntity());
//		}
//		else {
//			
//			dto.setRallySeq(iLastRallySeq);
//			
//			String strActionCode = dto.getMainAction().toString();
//			
//			statData = actiondictionaryRepository.findBymainCode(strActionCode);
//			
//			String strStatColumn = statData.getStatColumn();
//			
//			switch(strStatColumn) {
//			
//				case "openTry" : dto.setOpenTry(strActionCode);
//				break;
//				case "openSuccess" : dto.setOpenSuccess(strActionCode);
//				break;
//				case "openBlocked" : dto.setOpenBlocked(strActionCode);
//				break;
//				case "openFault" : dto.setOpenFault(strActionCode);
//				break;
//				case "syncTry" : dto.setSyncTry(strActionCode);
//				break;
//				case "syncSuccess" : dto.setSyncSuccess(strActionCode);
//				break;
//				case "syncBlocked" : dto.setSyncBlocked(strActionCode);
//				break;
//				case "syncFault" : dto.setSyncFault(strActionCode);
//				break;
//				case "slidTry" : dto.setSlideTry(strActionCode);
//				break;
//				case "slideSuccess" : dto.setSlideSuccess(strActionCode);
//				break;
//				case "slideBlocked" : dto.setSlideBlocked(strActionCode);
//				break;
//				case "slideFault" : dto.setSlideFault(strActionCode);
//				break;
//				case "backTry" : dto.setBackTry(strActionCode);
//				break;
//				case "backSuccess" : dto.setBackSuccess(strActionCode);
//				break;
//				case "backBlocked" : dto.setBackBlocked(strActionCode);
//				break;
//				case "backFault" : dto.setBackFault(strActionCode);
//				break;
//				case "quickTry" : dto.setQuickTry(strActionCode);
//				break;
//				case "quickSuccess" : dto.setQuickSuccess(strActionCode);
//				break;
//				case "quickBlocked" : dto.setQuickBlocked(strActionCode);
//				break;
//				case "quickFault" : dto.setQuickFault(strActionCode);
//				break;
//				case "cQuickTry" : dto.setCQuickTry(strStatColumn);
//				break;
//				case "cQuickSuccess" : dto.setCQuickSuccess(strActionCode);
//				break;
//				case "cQuickBlocked" : dto.setCQuickBlocked(strActionCode);
//				break;
//				case "cQuickFault" : dto.setCQuickFault(strActionCode);
//				break;
//				case "serveTry" : dto.setServeTry(strActionCode);
//				break;
//				case "serveSuccess" : dto.setServeSuccess(strActionCode);
//				break;
//				case "serveFault" : dto.setServeFault(strActionCode);
//				break;
//				case "digTry" : dto.setDigTry(strActionCode);
//				break;
//				case "digSuccess" : dto.setDigSuccess(strActionCode);
//				break;
//				case "digFault" : dto.setDigFault(strActionCode);
//				break;
//				case "setTry" : dto.setSetTry(strActionCode);
//				break;
//				case "setSuccess" : dto.setSetSuccess(strActionCode);
//				break;
//				case "setFault" : dto.setSetFault(strActionCode);
//				break;
//				case "receiveTry" : dto.setReceiveTry(strActionCode);
//				break;
//				case "receiveSuccess" : dto.setReceiveSuccess(strActionCode);
//				break;
//				case "receiveFailure" : dto.setReceiveFailure(strActionCode);
//				break;
//				case "blocktTry" : dto.setBlockTry(strActionCode);
//				break;
//				case "blockSuccess" : dto.setBlockSuccess(strActionCode);
//				break;
//				case "blockEffective" : dto.setBlockEffective(strActionCode);
//				break;
//				case "blockFailure" : dto.setBlockFailure(strActionCode);
//				break;
//				case "blockFault" : dto.setBlockFault(strActionCode);
//				break;
//				case "blockAssist" : dto.setBlockAssist(strActionCode);
//				break;
//			}
//			
//			playRepository.save(dto.toEntity());
//		}
//		
//		mResponse.put("Response", "액션 입력 완료!");
//		
//		return mResponse;
//	}
}