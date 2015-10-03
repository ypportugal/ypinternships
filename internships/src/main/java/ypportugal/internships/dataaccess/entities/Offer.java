package ypportugal.internships.dataaccess.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="offer")
public class Offer {

	private String name;
	
	public Offer() {
		//Empty
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
