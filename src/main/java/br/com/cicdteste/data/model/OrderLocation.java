package br.com.cicdteste.data.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="TB_ORDERLOCATION")
@AllArgsConstructor
@NoArgsConstructor
public class OrderLocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private Long id;
	
	private Double latitude;
	
	private Double longitude;
	
	private Date date;
	

}
