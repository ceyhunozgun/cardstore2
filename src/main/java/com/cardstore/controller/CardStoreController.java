package com.cardstore.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cardstore.dao.Card;
import com.cardstore.dao.CardRepository;

@RestController
public class CardStoreController {

	@Autowired
	@Qualifier("dummyCardRepositoryImpl")
	CardRepository cardRepository;


	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public List<Card> getCards() {
	    return (List<Card>) cardRepository.findAll();
	}
	
	@RequestMapping(value = "/cards", method = RequestMethod.POST)
	public Card saveCard(@RequestBody Card card) {
		card.setId(new Long((int)(1000 * Math.random())));
		card.setDateLoaded(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
	    cardRepository.save(card);
	    return card;
	}

	@RequestMapping(value = "/cards/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Card getCard(@PathVariable("id") Long id) {
	    return (Card) cardRepository.findOne(id);
	}
}
