package com.cardstore.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CardRepository 
{

	List<Card> findAll();

	Card findOne(Long id);
	
	void save(Card card);
}
