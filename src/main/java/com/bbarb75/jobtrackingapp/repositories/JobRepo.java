package com.bbarb75.jobtrackingapp.repositories;

import com.bbarb75.jobtrackingapp.entity.JobApp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Repository
public interface JobRepo extends CrudRepository<JobApp, Long> {
    @Query("SELECT p from JobApp p WHERE p.companyName LIKE %?1%")
    public List<JobApp> search(String companyName);
}
