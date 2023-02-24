package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.CompetitionService;

@RestController
public class CompetitionController {

	@Autowired
	private CompetitionService competitionService;
	
	@GetMapping("/api/competition/selectCompetition")
	public ResponseDto<?> searchAllCompetitionInfo() {
		
		return new ResponseDto<>(HttpStatus.OK.value(), competitionService.searchAllCompetitionInfo());
	}
}
