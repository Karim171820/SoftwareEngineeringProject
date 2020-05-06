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

    private int JobID; // Job ID
    private String JobName; // Job Title
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

    public ArrayList<Job> SearchForJob(String Name) {

        ArrayList<Job> searchResult = new ArrayList<>();

        // fetch all the data that matches the input from database and store it in the
        // search result array list
        // SQL Query .... {"SELECT * FROM ORPHANE Where JOBNAME ='" + Name + "'"
        return searchResult;
    }

    public String ViewJobDetails(String Name) {

        // fetch the JOB DESC data that matches the input from database and store it in
        // the
        // a String and Display it
        // SQL Query .... {"SELECT JOBDESC FROM ORPHANE Where JOBNAME ='" + Name + "'"

        return null; // JOB DESC
    }

    // ArrayList<JobSubject> observerList;

    public void UpdateJob(int ID, String Name, String Desc, String Qual, String Publish) {

        // Access the database connection and exec this query
        // "UPDATE JOB SET JOBID='" + ID + "', JOBNAME='" + Name + "', JOBDESC='" +
        // Desc+ "', JOBQUAL='" + Qual + "',JOBPD='" + Publish + "' WHERE ACCOUNT_ID=" +
        // id + "";

    }

}
