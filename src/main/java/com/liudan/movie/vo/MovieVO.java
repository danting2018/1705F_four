package com.liudan.movie.vo;

import com.liudan.movie.domain.Movie;

public class MovieVO extends Movie{

	private String uptimestart;
	private String uptimeend;
	private Double price1;
	private Double price2;
	private Integer longtimestart;
	private Integer longtimeend;
	private String orderMethod;
	private String orderColumn;
	public String getOrderColumn() {
		return orderColumn;
	}
	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
	public String getUptimestart() {
		return uptimestart;
	}
	public void setUptimestart(String uptimestart) {
		this.uptimestart = uptimestart;
	}
	public String getUptimeend() {
		return uptimeend;
	}
	public void setUptimeend(String uptimeend) {
		this.uptimeend = uptimeend;
	}
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	public Integer getLongtimestart() {
		return longtimestart;
	}
	public void setLongtimestart(Integer longtimestart) {
		this.longtimestart = longtimestart;
	}
	public Integer getLongtimeend() {
		return longtimeend;
	}
	public void setLongtimeend(Integer longtimeend) {
		this.longtimeend = longtimeend;
	}
	@Override
	public String toString() {
		return "MovieVO [uptimestart=" + uptimestart + ", uptimeend=" + uptimeend + ", price1=" + price1 + ", price2="
				+ price2 + ", longtimestart=" + longtimestart + ", longtimeend=" + longtimeend + ", orderMethod="
				+ orderMethod + ", orderColumn=" + orderColumn + "]";
	}
	public MovieVO(String uptimestart, String uptimeend, Double price1, Double price2, Integer longtimestart,
			Integer longtimeend, String orderMethod, String orderColumn) {
		super();
		this.uptimestart = uptimestart;
		this.uptimeend = uptimeend;
		this.price1 = price1;
		this.price2 = price2;
		this.longtimestart = longtimestart;
		this.longtimeend = longtimeend;
		this.orderMethod = orderMethod;
		this.orderColumn = orderColumn;
	}
	public MovieVO() {
		super();
	}
	
}
