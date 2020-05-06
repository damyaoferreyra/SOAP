package com.exemple.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Damião Ferreira
 * @since 06/05/2020
 *
 */
public class Product implements Serializable{

	private static final long serialVersionUID = -6659276904724149124L;
	private long id;
	private String name;
	private String description;
	private String dateCreated;
	private String dateUpdate;
	
	public Product() {
	}
	
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		dateCreated  = new Date().toString();
		dateUpdate = dateCreated;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	
	
}
