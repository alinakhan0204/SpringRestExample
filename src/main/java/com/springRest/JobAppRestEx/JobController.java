package com.springRest.JobAppRestEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.JobAppRestEx.model.JobPost;
import com.springRest.JobAppRestEx.service.JobService;

@RestController
public class JobController {

    @Autowired    
    JobService service;


    @GetMapping("getJobs")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();

    }

    @GetMapping("getJob/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping("getJob")
    public String addJobPost(@RequestBody JobPost job){
        service.addJob(job);
        return "Added";
    }

    @PutMapping("getJob")
    public JobPost updateJob(@RequestBody JobPost job){
        service.updateJob(job);
        return service.getJob(job.getPostId());
    }

    @DeleteMapping("getJob/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }
    
}
