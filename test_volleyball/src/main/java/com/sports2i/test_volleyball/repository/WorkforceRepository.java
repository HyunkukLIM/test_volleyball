package com.sports2i.test_volleyball.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.dto.WorkforceDto;
import com.sports2i.test_volleyball.model.Workforce;

@Repository
public interface WorkforceRepository extends JpaRepository<Workforce, Integer>{

	List<WorkforceDto.Request> findByCompetitionCode(String strCompetitionCode);
}
