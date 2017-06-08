package com.pamaks.services;

import java.util.List;

import com.pamaks.model.JobAttributes;

public interface JobService {
	public int createJob(JobAttributes jobAttributes);
	public List<JobAttributes> fetchJobs();
}
