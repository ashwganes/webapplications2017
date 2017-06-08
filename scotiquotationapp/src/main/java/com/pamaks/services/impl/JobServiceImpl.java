package com.pamaks.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pamaks.dao.impl.JobDAOImpl;
import com.pamaks.model.JobAttributes;
import com.pamaks.services.JobService;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	JobDAOImpl jobDaoImpl;

	@Override
	public int createJob(JobAttributes jobAttributes) {
		return jobDaoImpl.createJob(jobAttributes);
	}

	@Override
	public List<JobAttributes> fetchJobs() {
		return jobDaoImpl.fetchJobs();
	}
	
	

}
