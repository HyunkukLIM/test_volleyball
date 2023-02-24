package com.sports2i.test_volleyball.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.GameService;

@RestController
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping("/api/game/selectGame/{gameInfo}")
	public ResponseDto<?> searchGameInfo(@PathVariable("gameInfo") String gameInfo) {
		
		String strGameDate = gameInfo.substring(5);
		String strGender = gameInfo.substring(6, 7);
		int iGameNum = Integer.parseInt(gameInfo.substring(7, 9));
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameService.searchGameInfo(strGameDate, strGender, iGameNum));
	}
	
	@GetMapping("/api/game/selectSet")
	public ResponseDto<?> searchSetInfo() {
		
		int iGameNum = 123;
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameService.searchSetInfo(iGameNum));
	}
	
	@PostMapping("/api/game/insertSet")
	public ResponseDto<?> insertSet(@RequestBody GameDto.Request request) {
		
		gameService.insertSet(request);		
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
	
	
}
