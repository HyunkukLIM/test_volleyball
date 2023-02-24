package com.sports2i.test_volleyball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.model.Competition;
import com.sports2i.test_volleyball.repository.CompetitionRepository;

@Service
public class CompetitionService {

	@Autowired
	private CompetitionRepository competitionRepository;
	
	public List<Competition> searchAllCompetitionInfo() {
		
		return competitionRepository.findAll();
	}
}
