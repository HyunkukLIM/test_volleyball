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
public class Teamroster {
	
	@Column(nullable = false)
	private int participantOrder;
	
	@Column(nullable = false)
	private String teamId;
	
	@Column(nullable = false)
	private String teamName;
	
	@Column(nullable = false)
	private String role;
	
	@Column(nullable = false)
	private String participantName;
	
	@Id
	@Column(nullable = false)
	private String participantId;
	
	@Column(nullable = true)
	private String participantPosition;
	
	@Column(nullable = false)
	private String participantBIB;
	
	@Column(nullable = true)
	private String lineupStatus;
	
	@CreationTimestamp
	private Timestamp createdTime;
}
