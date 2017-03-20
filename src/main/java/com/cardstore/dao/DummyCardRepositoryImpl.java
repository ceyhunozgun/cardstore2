package com.cardstore.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class DummyCardRepositoryImpl implements CardRepository
{
	static Map<Long,Card> cards = new HashMap();

	public List<Card> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList(cards.values());
	}

	public Card findOne(Long id) {
		// TODO Auto-generated method stub
		return cards.get(id);
	}

	public void save(Card entity) {
		cards.put(entity.getId(), entity);
	}
}
