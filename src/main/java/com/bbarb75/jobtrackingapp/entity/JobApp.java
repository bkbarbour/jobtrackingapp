package com.bbarb75.jobtrackingapp.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Jobs")
public class JobApp implements Serializable {

    //fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int appNum; //will be hidden on front end, only for DB tracking
    private String companyName;
    private String experienceLevel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateApplied;
    private String sentiment;
    private String coverLetter;
    private String location;





    //no arg constructor
    public JobApp() {

    }
    //getters and setters
    public int getAppNum() {
        return appNum;
    }

    public void setAppNum(int appNum) {
        this.appNum = appNum;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Date getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(Date dateApplied) {
        this.dateApplied = dateApplied;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getRemote() {
        return remote;
    }

    public void setRemote(String remote) {
        this.remote = remote;
    }

    private String remote;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //full constructor
    public JobApp(int appNum, String companyName, String experienceLevel, Date dateApplied, String sentiment, String coverLetter, String location, String remote) {
        this.appNum = appNum;
        this.companyName = companyName;
        this.experienceLevel = experienceLevel;
        this.dateApplied = dateApplied;
        this.sentiment = sentiment;
        this.coverLetter = coverLetter;
        this.location = location;
        this.remote = remote;
    }
}
