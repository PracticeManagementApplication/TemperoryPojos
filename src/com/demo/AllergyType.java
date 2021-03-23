package com.demo;

public enum AllergyType {

	DRUG("drug"), FOOD("food"), INSECT("insct"), LATEX("latex");
	
	private String value;
	
	private AllergyType(final String value) {
		this.value = value;
	}

	public String getRole() {
		return value;
	}


}
