package com.sports2i.test_volleyball.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sports2i.test_volleyball.model.Game;
import com.sports2i.test_volleyball.model.QGame;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameRepositoryImpl implements GameRepositoryCustom{

	@Autowired
	private final JPAQueryFactory queryFactory;
	private QGame qGame = QGame.game;
	
	public List<Game> searchGame(String strCompetitionCode, String strGameDate) {
		return queryFactory.selectFrom(qGame)
				.where(eqCompetitionCode(strCompetitionCode),
						eqGameDate(strGameDate))
				.fetch();		
	}
	
	private BooleanExpression eqCompetitionCode(String strCompetitionCode) {
		return StringUtils.hasText(strCompetitionCode) ? qGame.competitionCode.eq(strCompetitionCode) : null;
	}
	
	private BooleanExpression eqGameDate(String strGameDate) {
		return StringUtils.hasText(strGameDate) ? qGame.gameDate.eq(strGameDate) : null;
	}
}
