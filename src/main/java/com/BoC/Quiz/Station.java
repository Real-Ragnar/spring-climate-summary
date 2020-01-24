package com.BoC.Quiz;

public class Station {
	private String stationName;
	private String province;
	private String date;
	private String meanTemp;
	private String maxTemp;
	private String minTemp;
	
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Station(String stationName, String date, String meanTemp) {
		super();
		this.stationName = stationName;
		this.date = date;
		this.meanTemp = meanTemp;
	}



	public Station(String stationName, String province, String date, String meanTemp, String maxTemp, String minTemp) {
		super();
		this.stationName = stationName;
		this.province = province;
		this.date = date;
		this.meanTemp = meanTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMeanTemp() {
		return meanTemp;
	}

	public void setMeanTemp(String meanTemp) {
		this.meanTemp = meanTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	
	
	
	
	
}
