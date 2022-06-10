package com.amdocs.covidapi.pojo;

public class CovidCareCentres {
	
	private int id;
	private String name;
	private long pinCode;
	
	public CovidCareCentres(int id, String name, long pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.pinCode = pinCode;
	}
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
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	
	@Override
	public String toString() {
		return "CovidCareCentres [id=" + id + ", name=" + name + ", pinCode=" + pinCode + "]";
	}
	
	
}
