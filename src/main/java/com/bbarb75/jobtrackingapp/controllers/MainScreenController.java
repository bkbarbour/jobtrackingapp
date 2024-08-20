package com.bbarb75.jobtrackingapp.controllers;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import com.bbarb75.jobtrackingapp.service.JobAppService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainScreenController {

    private JobAppService jobAppService;

    private List<JobApp> jobList;

    public MainScreenController(JobAppService jobAppService) {
        this.jobAppService = jobAppService;
    }

    @GetMapping("/mainscreen")
    public String listJobs(Model model, @Param("jobkeyword") String jobkeyword) {
        List<JobApp> jobList;

        if (jobkeyword != null && !jobkeyword.isEmpty()) {
            // Filter the list based on the keyword
            jobList = jobAppService.listAll(jobkeyword);
        } else {
            // Display the full list if no keyword is provided
            jobList = jobAppService.findAll();
        }

        model.addAttribute("jobAppList", jobList); // Pass the list (filtered or full) to the view
        model.addAttribute("jobkeyword", jobkeyword); // Pass the keyword back to the view
        return "mainscreen";
    }
}
