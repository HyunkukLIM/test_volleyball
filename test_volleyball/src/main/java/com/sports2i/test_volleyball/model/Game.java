package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@DynamicInsert
public class Game {

	@Column(nullable = false)
	private String competitionCode;		
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private int roundSeq;
	
	@Column(nullable = false)
	private int gameNum;
	
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
	
	@Id
	@Column(nullable = true)
	private int setNum;
	
	@Column(nullable = false)
	private String homeTeam;
	
	@Column(nullable = false)
	private String awayTeam;
	
	@Column(nullable = true)
	private String homeWL;
	
	@Column(nullable = true)
	private String awayWL;
	
	@Column(nullable = true)
	@ColumnDefault("0")
	private int homeSetScore;
	
	@Column(nullable = true)
	@ColumnDefault("0")
	private int awaySetScore;
	
	@Column(nullable = true)
	@ColumnDefault("0")
	private int homeScore;

	@Column(nullable = true)
	@ColumnDefault("0")
	private int awayScore;
	
	@Column(nullable = true)
	@ColumnDefault("0")
	private int homeScoreSum;	
	
	@Column(nullable = true)
	@ColumnDefault("0")
	private int awayScoreSum;
	
	@Column(nullable = true)
	private String setTime;
	
	@Column(nullable = true)
	private String totalSetTime;
	
	@Column(nullable = true)
	private String spectatorNumber;

}
