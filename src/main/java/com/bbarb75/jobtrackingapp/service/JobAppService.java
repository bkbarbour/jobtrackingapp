package com.bbarb75.jobtrackingapp.service;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface JobAppService {
    public List<JobApp> findAll();
    public JobApp findById(int id);
    public void save (JobApp jobApp);
    public void deleteById(int theId);
    public List<JobApp> listAll(String keyword);
}
