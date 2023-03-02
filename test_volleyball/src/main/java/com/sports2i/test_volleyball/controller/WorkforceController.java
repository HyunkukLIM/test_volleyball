package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.WorkforceService;

@RestController
public class WorkforceController {

	@Autowired
	private WorkforceService workforceService;
	
	@GetMapping("/api/workforce/selectworkforcelist")
	public ResponseDto<?> searchWorkforceList (@PathVariable(required=false) String strCompetitionCode) {
		
		return new ResponseDto<>(HttpStatus.OK.value(), workforceService.searchWorkforceList(strCompetitionCode));
	}
}
