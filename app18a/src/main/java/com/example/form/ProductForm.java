package com.example.form;

import java.io.Serializable;

 public class ProductForm {
	private static final long serialVersionUID = 748392348L;
	private String name;
	private String description;
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}