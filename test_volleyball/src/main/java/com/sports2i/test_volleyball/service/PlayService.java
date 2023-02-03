package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.model.Actiondictionary;
import com.sports2i.test_volleyball.model.Play;
import com.sports2i.test_volleyball.model.Startlist;
import com.sports2i.test_volleyball.repository.ActiondictionaryRepository;
import com.sports2i.test_volleyball.repository.PlayRepository;
import com.sports2i.test_volleyball.repository.StartlistRepository;

@Service
public class PlayService {
	
	@Autowired
	private PlayRepository playRepository;
	
	@Autowired
	private StartlistRepository startlistRepository;
	
	@Autowired
	private ActiondictionaryRepository actiondictionaryRepository;
	
	@Transactional
	public List<Startlist> searchPlayerList() {
		
		return startlistRepository.findAll();
	}
	
	@Transactional
	public List<Object> searchPlayList() {
				
		List<Play> listPlayList = new ArrayList<>();
		List<Object> listTotalPlay = new ArrayList<>();
		List<Integer> listLastRally = new ArrayList<>();
		
		listLastRally = playRepository.findLastActionList();
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
		
//		List<PlayDto.Response> listPlayResponseDto = new ArrayList<>();
		
//		playRepository.findByActionList().forEach(play -> {
//			listPlayResponseDto.add(new PlayDto.Response(play));
//		});
//		return listPlayResponseDto;
	}
	
	@Transactional
	public void savePlayInfo(PlayDto.Request dto) {
//		System.out.print(dto.toEntity());
		
		// 입력기에서 들어온 코드를 경기 상세 테이블에서는 곧바로 저장
		
		Actiondictionary statData = new Actiondictionary();
		
		String strActionCode = dto.getMainAction().toString().substring(2);
		
		statData = actiondictionaryRepository.findBymainCode(strActionCode);
		
		String strStatColumn = statData.getStatColumn();
		
		switch(strStatColumn) {
			case "serveSuccess" : dto.setServeSuccess(strActionCode);
			break;
		}
		
		playRepository.save(dto.toEntity());
	}

}