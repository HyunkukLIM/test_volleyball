package com.sports2i.test_volleyball.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LineupId implements Serializable {

	private String gameCode;
	private String setNum;
	private String rallySeq;
}
