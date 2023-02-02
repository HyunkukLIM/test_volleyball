package com.sports2i.test_volleyball.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.repository.PlayRepository;

@Service
public class PlayService {
	
	@Autowired
	private PlayRepository playRepository;
	
	@Transactional
	public List<PlayDto.Response> searchLastRally() {
		
		List<Integer> listLastRally = new ArrayList<>();
		
		listLastRally = playRepository.findLastActionList();
		
		return null;
	}
	
	@Transactional
	public List<PlayDto.Response> searchPlayList() {
		
		List<PlayDto.Response> listPlayResponseDto = new ArrayList<>();
		
		playRepository.findByActionList().forEach(play -> {
			listPlayResponseDto.add(new PlayDto.Response(play));
		});
		return listPlayResponseDto;
	}
	
	@Transactional
	public void savePlayInfo(PlayDto.Request dto) {
//		System.out.print(dto.toEntity());
		
		playRepository.save(dto.toEntity());		
	}

}