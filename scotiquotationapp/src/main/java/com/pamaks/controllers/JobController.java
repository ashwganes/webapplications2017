package com.pamaks.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pamaks.model.JobAttributes;
import com.pamaks.services.impl.JobServiceImpl;

@RestController
public class JobController {
	
	@Autowired
	JobServiceImpl jobServiceImpl;
	
	@RequestMapping(value="/createJob", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobAttributes>> createJob(@RequestBody JobAttributes jobAttributes) {
		jobAttributes.setCreationDate(new Date());
		int response = jobServiceImpl.createJob(jobAttributes);
		if(response!=-1) {
			List<JobAttributes> jobsList = jobServiceImpl.fetchJobs();
			return new ResponseEntity<List<JobAttributes>>(jobsList, HttpStatus.CREATED);
		}
		return new ResponseEntity<List<JobAttributes>>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	@RequestMapping(value="/fetchJobs.json", method=RequestMethod.GET)
	public ResponseEntity<List<JobAttributes>> fetchJobs() {
		List<JobAttributes> jobsList = jobServiceImpl.fetchJobs();
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.add("Content-Type", "application/json;charset=utf-8");
		if(jobsList.isEmpty()) {
			return new ResponseEntity<List<JobAttributes>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<JobAttributes>>(jobsList,responseHeaders,HttpStatus.OK);
	}
	
	@RequestMapping(value="/removeJob/{jobId}")
	public ResponseEntity<List<JobAttributes>> removeJob(@PathVariable(name="jobId") String jobId) {
		System.out.println("Job to be rmeoved --- " +jobId);
		return new ResponseEntity<List<JobAttributes>>(HttpStatus.OK);
		
	}
	
}
