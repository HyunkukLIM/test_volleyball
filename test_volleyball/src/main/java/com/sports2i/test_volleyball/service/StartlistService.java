package com.sports2i.test_volleyball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.StartlistDto;
import com.sports2i.test_volleyball.model.Startlist;
import com.sports2i.test_volleyball.repository.StartlistRepository;

@Service
public class StartlistService {
	
	@Autowired
	private StartlistRepository startlistRepository;
	
	@Transactional
	public List<Startlist> searchPlayerList() {
		
		return startlistRepository.findAll();
	}
	
	@Transactional
	public void savePlayerInfo(StartlistDto.Request dto) {
		
		startlistRepository.save(dto.toEntity());
	}

}
