package com.sports2i.test_volleyball.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.WorkforceDto;
import com.sports2i.test_volleyball.repository.WorkforceRepository;

@Service
public class WorkforceService {
	
	@Autowired
	private WorkforceRepository worforceRepository;

	public List<WorkforceDto.Request> searchWorkforceList (String strCompetitionCode) {
		
		return worforceRepository.findByCompetitionCode(strCompetitionCode);
	}
}
