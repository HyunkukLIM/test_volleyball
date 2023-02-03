package com.sports2i.test_volleyball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports2i.test_volleyball.model.Startlist;

@Repository
public interface StartlistRepository extends JpaRepository<Startlist, Integer>{
		
}
