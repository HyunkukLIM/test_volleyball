package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Game {

	@Column(nullable = false)
	private String competitionCode;		
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private int roundSeq;
	
	@Column(nullable = false)
	private int gameNum;
	
	@Id
	@Column(nullable = false)
	private String gameCode;
	
	@Column(nullable = false)
	private String gameDate;
	
	@CreationTimestamp
	private Timestamp createdTime;	
	
	@Column(nullable = true)
	private String gameDay;
	
	@Column(nullable = true)
	private String gameTime;
	
	@Column(nullable = true)
	private String gameLocation;
	
	@Column(nullable = true)
	private String gameStatus;
	
	@Column(nullable = true)
	private String broadcaster;
	
	@Column(nullable = false)
	private String homeTeam;
	
	@Column(nullable = false)
	private String awayTeam;
	
	@Column(nullable = true)
	private String homeWL;
	
	@Column(nullable = true)
	private String awayWL;
	
	@Column(nullable = true)
	private String homeScore;
	
	@Column(nullable = true)
	private String awayScore;
	
	@Column(nullable = true)
	private String firstSetTime;
	
	@Column(nullable = true)
	private String secondSetTime;
	
	@Column(nullable = true)
	private String thirdSetTime;
	
	@Column(nullable = true)
	private String fourthSetTime;
	
	@Column(nullable = true)
	private String fifthSetTime;
}
