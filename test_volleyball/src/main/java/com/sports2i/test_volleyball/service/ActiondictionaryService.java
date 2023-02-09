package com.sports2i.test_volleyball.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports2i.test_volleyball.dto.ActiondictionaryDto;
import com.sports2i.test_volleyball.model.Actiondictionary;
import com.sports2i.test_volleyball.repository.ActiondictionaryRepository;

@Service
public class ActiondictionaryService {

	@Autowired
	private ActiondictionaryRepository actiondictionaryRepository;
	
	@Transactional
	public List<Actiondictionary> searchActionCodeList(){
		
		return actiondictionaryRepository.findAll();
	}
	
	public void saveCodeInfo(ActiondictionaryDto.Request dto) {
		
		actiondictionaryRepository.save(dto.toEntity());
	}
}
