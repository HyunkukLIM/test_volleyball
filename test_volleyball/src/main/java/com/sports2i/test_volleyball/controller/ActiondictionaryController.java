package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ActiondictionaryDto;
import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.ActiondictionaryService;

@RestController
public class ActiondictionaryController {
	
	@Autowired
	private ActiondictionaryService actiondictionaryService;
	
	@GetMapping("/api/code/selectActionCodeList")
	public ResponseDto<?> searchActionCodeList(){
		
		return new ResponseDto<>(HttpStatus.OK.value(), actiondictionaryService.searchActionCodeList());
	}
	
	@PostMapping("/api/code/insertCode")
	public ResponseDto<?> insertActionCode(@RequestBody ActiondictionaryDto.Request request){
		
		actiondictionaryService.saveCodeInfo(request);
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
}
