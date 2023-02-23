package com.sports2i.test_volleyball.repository;

import java.sql.Timestamp;

public interface PlayDtoTime {
	
	int getSetNum();
	Timestamp getCreatedTime();
	String getTeamId();
	String getParticipantId();
	String getMainAction();	
}
