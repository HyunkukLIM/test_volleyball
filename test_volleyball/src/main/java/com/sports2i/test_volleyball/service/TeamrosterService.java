package com.sports2i.test_volleyball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.TeamrosterDto;
import com.sports2i.test_volleyball.model.Teamroster;
import com.sports2i.test_volleyball.repository.TeamrosterRepository;

@Service
public class TeamrosterService {
	
	@Autowired
	private TeamrosterRepository teamrosterRepository;
	
	@Transactional
	public List<Teamroster> searchTeamroster() {		
		
		return teamrosterRepository.findAll();
	}
	
	@Transactional
	public void saveTeamrosterInfo(List<TeamrosterDto.Request> dtos) {
		
		for (TeamrosterDto.Request dto : dtos) {
			
			teamrosterRepository.save(dto.toEntity());
		}
	}
}
