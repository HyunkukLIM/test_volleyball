package com.sports2i.test_volleyball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sports2i.test_volleyball.dto.ResponseDto;
import com.sports2i.test_volleyball.dto.TeamrosterDto;
import com.sports2i.test_volleyball.service.TeamrosterService;

@RestController
public class TeamrosterController {
	
	@Autowired
	private TeamrosterService teamrosterService;
	
	@GetMapping("/api/team/selectTeamroster")
	public ResponseDto<?> searchTeamroster() {
		
		return new ResponseDto<>(HttpStatus.OK.value(), teamrosterService.searchTeamroster());
	}
	
	@PostMapping("/api/team/insertTeamroster")
	public ResponseDto<?> insertTeamroster(@RequestBody List<TeamrosterDto.Request> requests) {
		
		teamrosterService.saveTeamrosterInfo(requests);
		
		return new ResponseDto<>(HttpStatus.OK.value(), 1);
	}
}
