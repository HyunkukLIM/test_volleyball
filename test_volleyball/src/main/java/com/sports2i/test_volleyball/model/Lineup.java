package com.sports2i.test_volleyball.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Lineup {
	
	@Column(nullable = false)
	private String competitionCode;
	
	@Column(nullable = false)
	private String gender;
	
	@EmbeddedId
	private LineupId id;
	
	@Column(nullable = false)
	private String home1st;
	
	@Column(nullable = false)
	private String home2nd;
	
	@Column(nullable = false)
	private String home3rd;
	
	@Column(nullable = false)
	private String home4th;
	
	@Column(nullable = false)
	private String home5th;
	
	@Column(nullable = false)
	private String home6th;
	
	@Column(nullable = false)
	private String away1st;
	
	@Column(nullable = false)
	private String away2nd;
	
	@Column(nullable = false)
	private String away3rd;
	
	@Column(nullable = false)
	private String away4th;
	
	@Column(nullable = false)
	private String away5th;
	
	@Column(nullable = false)
	private String away6th;
}
