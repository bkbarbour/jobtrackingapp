package com.bbarb75.jobtrackingapp.controllers;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import com.bbarb75.jobtrackingapp.service.JobAppService;
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
    public String listJobs(Model model) {
        List<JobApp> jobAppList = jobAppService.findAll();
        model.addAttribute("jobAppList", jobAppList);
        return "mainscreen";
    }
}
