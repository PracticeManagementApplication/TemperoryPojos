package com.demo;

public enum Role {

	PHYSICIAN("physician"), NURSE("nurse"), ADMIN("admin");

	private final String role;

	private Role(final String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

}
