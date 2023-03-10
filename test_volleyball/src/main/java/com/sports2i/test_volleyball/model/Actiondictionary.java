package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Actiondictionary {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int codeOrder;
	
	@Id
	@Column(nullable = false, columnDefinition = "varbinary(255)")
	private String mainCode;
	
	@Column(nullable = false)
	private String codeName;
	
	@Column(nullable = true)
	private String statColumn;
	
	@Column(nullable = true)
	private String statValue;
	
	@CreationTimestamp
	private Timestamp createdTime;
}
