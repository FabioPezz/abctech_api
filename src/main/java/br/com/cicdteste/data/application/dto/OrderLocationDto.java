package br.com.cicdteste.data.application.dto;

import java.util.Date;

import lombok.Data;

@Data
public class OrderLocationDto {

	private Double latitude;
	private Double longitude;
	private Date dateTime;
	
	public Double getLatitude() {
		return latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}
