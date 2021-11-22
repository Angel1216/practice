package com.example.jpa.model;

import lombok.Data;

@Data
public class RandomNumberResponse {
	
	private Double number;

	public Double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

}
