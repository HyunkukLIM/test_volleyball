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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Play {
	
	@Column(nullable = false)
	private String competitionCode;
	
	@Column(nullable = false)
	private String gameCode;
	
	@Column(nullable = false)
	private String gender;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actionSeq;
	
	@Column(nullable = false)
	private int setNum;
	
	@Column(nullable = false)
	private int rallySeq;
	
	@CreationTimestamp
	private Timestamp createdTime;
	
	@Column(nullable = true)
	private int homeScore;
	
	@Column(nullable = true)
	private int awayScore;
	
	@Column(nullable = false)
	private String teamId;
	
	@Column(nullable = false)
	private String participantId;
	
	@Column(nullable = true)
	private String teamSuccess;
	
	@Column(nullable = true)
	private String teamFailure;
	
	@Column(nullable = true)
	private String mainAction;
	
	@Column(nullable = true)
	private String detailAction;
	
	@Column(nullable = true)
	private String openTry;
	
	@Column(nullable = true)
	private String openSuccess;
	
	@Column(nullable = true)
	private String openBlocked;
	
	@Column(nullable = true)
	private String openFault;
	
	@Column(nullable = true)
	private String syncTry;
	
	@Column(nullable = true)
	private String syncSuccess;
	
	@Column(nullable = true)
	private String syncBlocked;
	
	@Column(nullable = true)
	private String syncFault;
	
	@Column(nullable = true)
	private String slideTry;
	
	@Column(nullable = true)
	private String slideSuccess;
	
	@Column(nullable = true)
	private String slideBlocked;
	
	@Column(nullable = true)
	private String slideFault;
	
	@Column(nullable = true)
	private String backTry;
	
	@Column(nullable = true)
	private String backSuccess;
	
	@Column(nullable = true)
	private String backBlocked;
	
	@Column(nullable = true)
	private String backFault;
	
	@Column(nullable = true)
	private String quickTry;
	
	@Column(nullable = true)
	private String quickSuccess;
	
	@Column(nullable = true)
	private String quickBlocked;
	
	@Column(nullable = true)
	private String quickFault;
	
	@Column(nullable = true)
	private String cQuickTry;
	
	@Column(nullable = true)
	private String cQuickSuccess;
	
	@Column(nullable = true)
	private String cQuickBlocked;
	
	@Column(nullable = true)
	private String cQuickFault;
	
	@Column(nullable = true)
	private String serveTry;
	
	@Column(nullable = true)
	private String serveSuccess;
	
	@Column(nullable = true)
	private String serveBlocked;
	
	@Column(nullable = true)
	private String serveFault;
	
	@Column(nullable = true)
	private String digTry;
	
	@Column(nullable = true)
	private String digSuccess;	
	
	@Column(nullable = true)
	private String digFault;
	
	@Column(nullable = true)
	private String setTry;
	
	@Column(nullable = true)
	private String setSuccess;
	
	@Column(nullable = true)
	private String setBlocked;
	
	@Column(nullable = true)
	private String setFault;
	
	@Column(nullable = true)
	private String receiveTry;
	
	@Column(nullable = true)
	private String receiveSuccess;
	
	@Column(nullable = true)
	private String receiveFailure;
	
	@Column(nullable = true)
	private String blockTry;
	
	@Column(nullable = true)
	private String blockSuccess;
	
	@Column(nullable = true)
	private String blockEffective;
	
	@Column(nullable = true)
	private String blockFailure;
	
	@Column(nullable = true)
	private String blockFault;
	
	@Column(nullable = true)
	private String blockAssist;
	
	@Column(nullable = true)
	private int penalty;
	
	@Column(nullable = true)
	private int totalFault;
	
}
