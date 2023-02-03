package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.model.Play;
import com.sports2i.test_volleyball.model.Startlist;
import com.sports2i.test_volleyball.repository.PlayRepository;
import com.sports2i.test_volleyball.repository.StartlistRepository;

@Service
public class PlayService {
	
	@Autowired
	private PlayRepository playRepository;
	
	@Autowired
	private StartlistRepository startlistRepository;
	
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
		
		String action = dto.getMainAction().toString();		
		
		

		playRepository.save(dto.toEntity());		
	}

}