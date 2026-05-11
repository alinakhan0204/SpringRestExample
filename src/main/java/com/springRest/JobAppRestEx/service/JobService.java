package com.springRest.JobAppRestEx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.JobAppRestEx.model.JobPost;
import com.springRest.JobAppRestEx.repo.JobRepo;



@Service
public class JobService {
@Autowired
    public JobRepo repo;


    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();


    }


    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }


    public void updateJob(JobPost job) {
         repo.updateJob(job);
    }


    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }


}