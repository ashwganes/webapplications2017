package com.pamaks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COUNTRY_ID", nullable=false)
	private int countryId;
	
	@Column(name="COUNTRY_NAME", nullable=false)
	private String countryName;
	
	@Column(name="STATUS", nullable=false)
	private String status;
}