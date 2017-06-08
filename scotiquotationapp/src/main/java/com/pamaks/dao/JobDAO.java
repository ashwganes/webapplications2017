package com.pamaks.dao;

import java.util.List;

import com.pamaks.model.JobAttributes;

public interface JobDAO {
	public int createJob(JobAttributes jobAttributes);
	public List<JobAttributes> fetchJobs();
}
