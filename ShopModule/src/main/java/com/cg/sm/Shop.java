package com.cg.sm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shop {

	private int id;
	private String name;
	private float price;	
	
	public Shop() {
		super();
	}
    
	public Shop(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
    @Id	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "shop1 [id=" + id + ", name=" + name + ", price=" + price + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}


