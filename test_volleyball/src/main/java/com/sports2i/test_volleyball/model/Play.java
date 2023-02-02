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
	private String gender;
	
	@Column(nullable = false)
	private String gameCode;
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int actionSeq;
	
	@Column(nullable = false)
	private int setNum;
	
	@Column(nullable = false)
	private int rallySeq;
	
	@CreationTimestamp
	private Timestamp createTime;
	
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
	private int openTry;
	
	@Column(nullable = true)
	private int openSuccess;
	
	@Column(nullable = true)
	private int openBlocked;
	
	@Column(nullable = true)
	private int openFault;
	
	@Column(nullable = true)
	private int syncTry;
	
	@Column(nullable = true)
	private int syncSuccess;
	
	@Column(nullable = true)
	private int syncBlocked;
	
	@Column(nullable = true)
	private int syncFault;
	
	@Column(nullable = true)
	private int slideTry;
	
	@Column(nullable = true)
	private int slideSuccess;
	
	@Column(nullable = true)
	private int slideBlocked;
	
	@Column(nullable = true)
	private int slideFault;
	
	@Column(nullable = true)
	private int backTry;
	
	@Column(nullable = true)
	private int backSuccess;
	
	@Column(nullable = true)
	private int backBlocked;
	
	@Column(nullable = true)
	private int backFault;
	
	@Column(nullable = true)
	private int quickTry;
	
	@Column(nullable = true)
	private int quickSuccess;
	
	@Column(nullable = true)
	private int quickBlocked;
	
	@Column(nullable = true)
	private int quickFault;
	
	@Column(nullable = true)
	private int cQuickTry;
	
	@Column(nullable = true)
	private int cQuickSuccess;
	
	@Column(nullable = true)
	private int cQuickBlocked;
	
	@Column(nullable = true)
	private int cQuickFault;
	
	@Column(nullable = true)
	private int serveTry;
	
	@Column(nullable = true)
	private int serveSuccess;
	
	@Column(nullable = true)
	private int serveBlocked;
	
	@Column(nullable = true)
	private int serveFault;
	
	@Column(nullable = true)
	private int digTry;
	
	@Column(nullable = true)
	private int digSuccess;	
	
	@Column(nullable = true)
	private int digFault;
	
	@Column(nullable = true)
	private int setTry;
	
	@Column(nullable = true)
	private int setSuccess;
	
	@Column(nullable = true)
	private int setBlocked;
	
	@Column(nullable = true)
	private int setFault;
	
	@Column(nullable = true)
	private int receiveTry;
	
	@Column(nullable = true)
	private int receiveSuccess;
	
	@Column(nullable = true)
	private int receiveFailure;
	
	@Column(nullable = true)
	private int blockTry;
	
	@Column(nullable = true)
	private int blockSuccess;
	
	@Column(nullable = true)
	private int blockEffective;
	
	@Column(nullable = true)
	private int blockFailure;
	
	@Column(nullable = true)
	private int blockFault;
	
	@Column(nullable = true)
	private int blockAssist;
	
	@Column(nullable = true)
	private int penalty;
	
	@Column(nullable = true)
	private int totalFault;
	
}
