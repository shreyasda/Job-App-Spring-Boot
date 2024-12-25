package com.shreyas.jobApp.job.impl;

import com.shreyas.jobApp.job.Job;
import com.shreyas.jobApp.job.JobService;

import java.util.ArrayList;
import java.util.List;

public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);
    }
}
