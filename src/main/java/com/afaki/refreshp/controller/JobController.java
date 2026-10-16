package com.afaki.refreshp.controller;

import com.afaki.refreshp.model.Job;
import com.afaki.refreshp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobService jobService;
    @GetMapping("/api/jobs")
    public List<Job> getJob() {
     return jobService.getAllJobs() ;
    }
    @GetMapping("/api/jobs/{id}")
    public Job getJobById(@PathVariable long id) {
        return  jobService.getJobById(id);
    }
    @PostMapping("/api/jobs")
    public Job createJob(@RequestBody Job job) {
        return jobService.createJob(job);
    }
    @DeleteMapping("/api/jobs/{id}")
    public void deleteJobById(@PathVariable long id) {
        jobService.deleteJobById(id);
    }
}
