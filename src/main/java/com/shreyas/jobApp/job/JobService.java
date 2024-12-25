package com.shreyas.jobApp.job;

import java.util.ArrayList;
import java.util.List;

public interface JobService {
    List<Job> findAll();

    void createJob(Job job);
}
