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
import com.sports2i.test_volleyball.service.ComputingService;
import com.sports2i.test_volleyball.service.PlayService;

@RestController
public class PlayController {
	
	@Autowired
	private PlayService playService;
	
	@Autowired
	private ComputingService computingService;
	
	@GetMapping("/api/play/selectPlayList")
	public ResponseDto<?> searchPlayList () {
//		System.out.println("여기까지 들어옴");
		return new ResponseDto<>(HttpStatus.OK.value(), playService.searchPlayList());
	}
	
	@PostMapping("/api/play/insertPlay")
	public ResponseDto<?> savePlayInfo(@RequestBody List<PlayDto.Request> requests) {
//		System.out.println(request);
		
		int iSetNum = 0;
		
		int iLastRallySeq = playService.searchLastActionSeq();		
		
		for(PlayDto.Request request : requests) {
			//System.out.println(request);
			
			iSetNum = request.getSetNum();
			
			playService.savePlayInfo(request, iLastRallySeq);
		}
		
		// 입력된 경기 상세 테이블을 바탕으로 연산을 실행하여 값(숫자)을 선수 및 팀 누적 기록 테이블에 저장
		// 경기 종료 후 경기 상세 테이블을 바탕으로 연산을 실행하여 값(숫자)을 선수 및 팀 범실 누적 기록 테이블에 저장
		
		computingService.updateScore(iSetNum);
		computingService.updateSetScore();
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
}
