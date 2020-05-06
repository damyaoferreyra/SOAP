/**
 * 
 */
package com.exemple.wsdl.core.domain;

import java.io.Serializable;

/**
 * @author Damião Ferreira
 * @since 06/05/2020
 * @see used input product webservice, few variable. not date created, id.
 */
public class ProductInput implements Serializable{

	private static final long serialVersionUID = -6659276904724149124L;
	private String name;
	private String description;
	
	
	public ProductInput() {
	}
	
	public ProductInput(String name, String description) {
		this.name = name;
		this.description = description;
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
}
