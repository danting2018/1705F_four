package com.liudan.movie.domain;

public class Movie {

	private Integer mid;
	private String mname;
	private String author;
	private Double price;
	private String uptime;
	private Integer longtime;
	private String type;
	private String year;
	private String area;
	private Integer status;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getLongtime() {
		return longtime;
	}
	public void setLongtime(Integer longtime) {
		this.longtime = longtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", author=" + author + ", price=" + price + ", uptime="
				+ uptime + ", longtime=" + longtime + ", type=" + type + ", year=" + year + ", area=" + area
				+ ", status=" + status + "]";
	}
	
			
}
