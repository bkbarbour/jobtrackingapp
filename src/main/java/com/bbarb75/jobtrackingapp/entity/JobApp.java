package com.bbarb75.jobtrackingapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Jobs")
public class JobApp implements Serializable {

    //fields
    @Id
    private int appNum;
    private String companyName;
    private String experienceLevel;
    private Date dateApplied;
    private String sentiment;
    private String coverLetter;

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


    //full constructor
    public JobApp(int appNum, String companyName, String experienceLevel, Date dateApplied, String sentiment, String coverLetter) {
        this.appNum = appNum;
        this.companyName = companyName;
        this.experienceLevel = experienceLevel;
        this.dateApplied = dateApplied;
        this.sentiment = sentiment;
        this.coverLetter = coverLetter;
    }
}
