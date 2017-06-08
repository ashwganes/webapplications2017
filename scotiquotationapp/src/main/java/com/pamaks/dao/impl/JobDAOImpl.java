package com.pamaks.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pamaks.dao.JobDAO;
import com.pamaks.model.JobAttributes;

@Repository
public class JobDAOImpl implements JobDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int createJob(JobAttributes jobAttributes) {
		try {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(jobAttributes);
		
		session.getTransaction().commit();
		session.close();
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		return jobAttributes.getJobId();
	}

	@Override
	public List<JobAttributes> fetchJobs() {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();	
		List<JobAttributes> jobsList = session.createQuery("from JobAttributes").list();
		session.close();
		return jobsList;
	}

}
