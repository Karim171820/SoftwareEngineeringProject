/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Kamal
 */
public class Job {

    private int JobID;
    private String JobName;
    private String JobDesc; // Description
    private String JobQual; // Qualifications
    private String JobPD; // Publish date
    private ArrayList<JobSubject> observerList;

    public Job() {
    }

    public Job(int jobID, String jobName, String jobDesc, String jobQual, String jobPD,
            ArrayList<JobSubject> observerList) {
        this.JobID = jobID;
        this.JobName = jobName;
        this.JobDesc = jobDesc;
        this.JobQual = jobQual;
        this.JobPD = jobPD;
        this.observerList = observerList;
    }

    public int getJobID() {
        return JobID;
    }

    public void setJobID(int jobID) {
        JobID = jobID;
    }

    public String getJobName() {
        return JobName;
    }

    public void setJobName(String jobName) {
        JobName = jobName;
    }

    public String getJobDesc() {
        return JobDesc;
    }

    public void setJobDesc(String jobDesc) {
        JobDesc = jobDesc;
    }

    public String getJobQual() {
        return JobQual;
    }

    public void setJobQual(String jobQual) {
        JobQual = jobQual;
    }

    public String getJobPD() {
        return JobPD;
    }

    public void setJobPD(String jobPD) {
        JobPD = jobPD;
    }

    public ArrayList<JobSubject> getObserverList() {
        return observerList;
    }

    public void setObserverList(ArrayList<JobSubject> observerList) {
        this.observerList = observerList;
    }

}