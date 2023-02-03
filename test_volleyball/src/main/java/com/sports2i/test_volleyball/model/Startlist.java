package com.sports2i.test_volleyball.model;

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
@Entity
@Builder
public class Startlist {
	
	@Column(nullable = false)
	private String competitionCode;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private String gameCode;
	
	@Column(nullable = false)
	private String homeaway;
	
	@Column(nullable = false)
	private String teamId;
	
	@Column(nullable = false)
	private String teamName;
	
	@Column(nullable = false)
	private String startingReserve;
	
	@Id
	@Column(nullable = false)
	private String participantId;
	
	@Column(nullable = false)
	private int startingOrder;
	
	@Column(nullable = false)
	private String participantName;
	
	@Column(nullable = false)
	private String participantPosition;
	
	@Column(nullable = false)
	private String participantBIB;
}