package com.bbarb75.jobtrackingapp.service;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import com.bbarb75.jobtrackingapp.repositories.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobAppServiceImpl implements JobAppService{
    private JobRepo jobRepo;

    @Autowired
    public JobAppServiceImpl(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    @Override
    public List<JobApp> findAll(){
        return (List<JobApp>) jobRepo.findAll();
    }

    public List<JobApp> listAll(String keyword){
        if(keyword !=null){
            return jobRepo.search(keyword);
        }
        return (List<JobApp>) jobRepo.findAll();
    }

    @Override
    public JobApp findById(int id){
        Long theIdl=(long)id;
        Optional<JobApp> result = jobRepo.findById(theIdl);

        JobApp theJob = null;

        if(result.isPresent()){
            theJob = result.get();
        }
        else {
            return null;
        }
        return theJob;
    }

    @Override
    public void save(JobApp jobApp){
        jobRepo.save(jobApp);
    }
    @Override
    public void deleteById(int id){
        Long theIdl=(long)id;
        jobRepo.deleteById(theIdl);
    }

}
