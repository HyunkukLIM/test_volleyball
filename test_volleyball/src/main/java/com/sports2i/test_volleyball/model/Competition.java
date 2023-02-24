package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Competition {
	
	@Column(nullable = false)
	private String category;
	
	@Id
	@Column(nullable = false)
	private String competitionCode;
	
	@Column(nullable = false)
	private String competitionName;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private String startDate;
	
	@Column(nullable = false)
	private String endDate;
	
	@Column(nullable = true)
	@ColumnDefault(value="0")
	private int totalRoundNum;
	
	@Column(nullable = true)
	@ColumnDefault(value="0")
	private int totalTeamNum;
	
	@CreationTimestamp
	private Timestamp createdTime;	
}
