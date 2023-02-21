package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.model.Game;
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
	
	@GetMapping("/api/game/selectSet")
	public ResponseDto<?> searchSetInfo() {
		
		String strGameCode = "22-23VMENR3-123";
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameService.searchSetInfo(strGameCode));
	}
	
	@PostMapping("/api/game/insertSet")
	public ResponseDto<?> insertSet(@RequestBody GameDto.Request request) {
		
		gameService.insertSet(request);		
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
	
	
}
