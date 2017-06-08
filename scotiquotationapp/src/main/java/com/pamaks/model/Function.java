package com.pamaks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNCTION")
public class Function {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FUNCTION_ID", nullable=false)
	private int industryId;
	
	@Column(name="FUNCTION_NAME", nullable=false)
	private String industryName;
	
	@Column(name="STATUS", nullable=false)
	private String status;
}