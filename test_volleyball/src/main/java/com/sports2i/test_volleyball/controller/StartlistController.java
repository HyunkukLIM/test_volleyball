package com.sports2i.test_volleyball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.dto.StartlistDto;
import com.sports2i.test_volleyball.service.ComputingService;
import com.sports2i.test_volleyball.service.StartlistService;

@RestController
public class StartlistController {
	
	@Autowired
	private StartlistService startlistService;
	
	@GetMapping("/api/startlist/selectPlayerList")
	public ResponseDto<?> searchPlayerList () {
//		System.out.println("여기까지 들어옴");
		return new ResponseDto<>(HttpStatus.OK.value(), startlistService.searchPlayerList());
	}
	
	@PostMapping("/api/startlist/insertStartlist")
	public ResponseDto<?> insertStartlist (@RequestBody List<StartlistDto.Request> requests) {		
//		System.out.println(request);
		
		startlistService.savePlayerInfo(requests);
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
	
	@PutMapping("/api/startlist/deleteStartlist")
	public ResponseDto<?> deleteStartlist (@RequestBody List<StartlistDto.Request> requests) {
		
		startlistService.deletePlayerInfo(requests);
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
}
