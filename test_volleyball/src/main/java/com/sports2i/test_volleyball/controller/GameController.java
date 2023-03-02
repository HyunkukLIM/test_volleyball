package com.sports2i.test_volleyball.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.GameDto;
import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.GameService;

@RestController
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = {"/api/game/selectGame"})
	public ResponseDto<?> searchGame(@RequestParam(required=false) String competitioncode,
									@RequestParam(required=false) String gamedate) {
		
		String strCompetitionCode = competitioncode;
		String strGameDate = gamedate;
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameService.searchGame(strCompetitionCode, strGameDate));
	}
	
	@GetMapping(value = {"/api/game/selectGame/{gameInfo}"})
	public ResponseDto<?> searchGameInfo(@PathVariable(required=false) String strgameInfo) {		
		
		GameDto.Response gameInfo = null;
		String strGameDate = null;
		String strGender = null;
		int iGameNum = 0;
		
		if (strgameInfo != null) {
		
			strGameDate = strgameInfo.substring(0, 10);
			strGender = strgameInfo.substring(10, 11);
			iGameNum = Integer.parseInt(strgameInfo.substring(11, 14));
			
			gameInfo = gameService.searchGameInfo(strGameDate, strGender, iGameNum);
		}
		
		return new ResponseDto<>(HttpStatus.OK.value(), gameInfo);
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
