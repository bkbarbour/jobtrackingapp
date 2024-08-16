package com.bbarb75.jobtrackingapp.controllers;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import com.bbarb75.jobtrackingapp.service.JobAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AddJobController {
    @Autowired
    private JobAppService jobAppService;

    public AddJobController(JobAppService jobAppService) {
        this.jobAppService = jobAppService;
    }

    @GetMapping("/addjob")
    public String addJob(Model model) {
        JobApp jobApp = new JobApp();
        model.addAttribute("jobApp", jobApp);
        return "addjob";
    }

    @PostMapping("/addjob")
    public String submitJob(@Validated @ModelAttribute("jobApp") JobApp jobApp, BindingResult bindingResult, Model model) {
        model.addAttribute("jobApp", jobApp);
        if (bindingResult.hasErrors()) {
            return "addjob";
        }else{
            jobAppService.save(jobApp);
            return "mainscreen";
        }
    }



}
