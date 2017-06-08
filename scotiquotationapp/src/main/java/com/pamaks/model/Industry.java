package com.pamaks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INDUSTRY")
public class Industry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INDUSTRY_ID", nullable=false)
	private int industryId;
	
	@Column(name="INDUSTRY_NAME", nullable=false)
	private String industryName;
	
	@Column(name="STATUS", nullable=false)
	private String status;
}