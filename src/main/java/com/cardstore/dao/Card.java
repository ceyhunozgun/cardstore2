package com.cardstore.dao;

public class Card {
  
	 private Long id;
	 private String name;
	 private String ownerName;
	 private String dateLoaded;

	 public Card()
	 {
	 }
	 
	public Card(Long id, String name, String ownerName, String dateLoaded) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.dateLoaded = dateLoaded;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDateLoaded() {
		return dateLoaded;
	}

	public void setDateLoaded(String dateLoaded) {
		this.dateLoaded = dateLoaded;
	}

	 
	 
	 
}
