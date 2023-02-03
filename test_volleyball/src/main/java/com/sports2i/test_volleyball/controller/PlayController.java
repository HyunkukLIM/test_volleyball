package com.sports2i.test_volleyball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.PlayDto;
import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.service.PlayService;

@RestController
public class PlayController {
	
	@Autowired
	private PlayService playService;
	
	@GetMapping("/api/play/selectPlayerList")
	public ResponseDto<?> searchPlayerList () {
//		System.out.println("여기까지 들어옴");
		return new ResponseDto<>(HttpStatus.OK.value(), playService.searchPlayerList());
	}
	
	@GetMapping("/api/play/selectPlayList")
	public ResponseDto<?> searchPlayList () {
//		System.out.println("여기까지 들어옴");
		return new ResponseDto<>(HttpStatus.OK.value(), playService.searchPlayList());
	}	
	
	@PostMapping("/api/play/insertPlay")
	public ResponseDto<?> savePlayInfo(@RequestBody List<PlayDto.Request> requests) {
//		System.out.println(request);
		
		for(PlayDto.Request request : requests) {
			//System.out.println(request);
			playService.savePlayInfo(request);
		}
		
//		playService.savePlayInfo(request);
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
}
