package com.sports2i.test_volleyball.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ActionDictionary {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int codeOrder;
	
	@Id
	private String mainCode;
	
	@Column(nullable = true)
	private String codeName;
	
	@Column(nullable = true)
	private String detailCode;
	
}
