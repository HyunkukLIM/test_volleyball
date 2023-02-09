package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.GameService;

@RestController
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/api/game/selectGame")
	public ResponseDto<?> searchGameInfo() {
		
		String strGameCode = "22-23VMENR3-123"; 
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameService.searchGameInfo(strGameCode));
	}
	
}
