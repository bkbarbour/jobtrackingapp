package com.bbarb75.jobtrackingapp.controllers;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import com.bbarb75.jobtrackingapp.service.JobAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteJobController {
    @Autowired
    private JobAppService jobAppService;

    public DeleteJobController(JobAppService jobAppService) {
        this.jobAppService = jobAppService;
    }



    @GetMapping("/deletejob")
    public String deleteJob(@Validated @RequestParam("appNum") int theAppNum, Model model) {
        //Finish this next
        JobAppService repo = jobAppService;
        JobApp jobApp = repo.findById(theAppNum);
        //if statement for deletion
        repo.deleteById(theAppNum);
        return "confirmdeletejob";
    }
}
