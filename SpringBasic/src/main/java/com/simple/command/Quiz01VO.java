package com.simple.command;

public class Quiz01VO {
	private String year;
	private int month;
	private String day;
	
	public Quiz01VO() {
	}
	public Quiz01VO(String year, int month, String day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
}
