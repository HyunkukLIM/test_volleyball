package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Workforce {
	
	@Column(nullable = false)
	private String year;
	
	@Column(nullable = false)
	private String competitionCode;
	
	@Id
	@Column(nullable = false)
	private String participantId;
	
	@Column(nullable = false)
	private String participantName;
	
	@Column(nullable = false)
	private String organization;
	
	@Column(nullable = false)
	private String role;
	
	@Column(nullable = true)
	private String position;
	
	private Timestamp createdTime;
}
