package com.pamaks.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="JOB_ATTRIBUTES")
public class JobAttributes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="JOB_ID", nullable=false)
	private int jobId;
	
	@Column(name="INDUSTRY", nullable=false)
	private String industry;
	
	@Column(name="FUNCTION", nullable=false)
	private String functionType;
	
	@Column(name="COUNTRY", nullable=false)
	private String country;
	
	@Column(name="BRIEF_DESC", nullable=false)
	private String briefDesc;
	
	@Column(name="DETAIL_DESC", nullable=false)
	private String detailedDesc;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getFunctionType() {
		return functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBriefDesc() {
		return briefDesc;
	}
	public void setBriefDesc(String briefDesc) {
		this.briefDesc = briefDesc;
	}
	public String getDetailedDesc() {
		return detailedDesc;
	}
	public void setDetailedDesc(String detailedDesc) {
		this.detailedDesc = detailedDesc;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String toString() {
		return industry + "  " + functionType + "  " + country + "  " + briefDesc + "  " + detailedDesc;
	}
}