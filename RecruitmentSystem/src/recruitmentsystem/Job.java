/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

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

    
    
    public Job( String JobName, String JobDesc, String JobQual, String JobPD,int companyID) {
        
        this.createJob(JobName, JobDesc, JobQual, JobPD, companyID);
        
        this.JobID = JobID;
        this.JobName = JobName;
        this.JobDesc = JobDesc;
        this.JobQual = JobQual;
        this.JobPD = JobPD;
        
        
    }
    
    
public void createJob(String name,String jobDesc,String jobQual,String jobPD,int companyID){

     String [] returnID = {"JobID"};
         try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("insert into Job (name, description, qualification, publishDate, C_ID ) values('" + name + "', '" + jobDesc +  "', '" + jobQual +  "','" + jobPD +"','" + companyID + "')", returnID);
            System.out.println("Job is Added");
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    this.setJobID(rs.getInt(1));
                }
                rs.close();
            }
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        } 
    
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

//    public ArrayList<Job> SearchForJob(String Name) {
//        
//     ArrayList<Job> searchResult = new ArrayList<>();
//        try {
//            
//            Statement stmt = RecruitmentSystem.con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM job Where name = 'Junior Software Engi'");
//            while (rs.next()) {
//                searchResult.add(new Job(rs.getInt("ID"), rs.getString("name"), rs.getString("description"), rs.getString("qualification"), rs.getString("publishDate")), String.valueOf(rs.getInt("C_ID"))) ;
//            }
//        } catch (Exception e) {
//            System.err.println("DATABASE QUERY ERROR: " + e.toString());
//        }
//         Iterator iterator = searchResult.iterator(); 
//  
//        System.out.println("Search Results "); 
//  
//        while (iterator.hasNext()) 
//            System.out.print(iterator.next() + " "); 
//  
//        System.out.println(); 
//        return null;
//    }

    public String ViewJobDetails(String Name) {

        // fetch the JOB DESC data that matches the input from database and store it in
        // the
        // a String and Display it
        // SQL Query .... {"SELECT JOBDESC FROM ORPHANE Where JOBNAME ='" + Name + "'"

        return null; // JOB DESC
    }

    public void UpdateJob(int ID, String Name, String Desc, String Qual, String Publish) {

        // Access the database connection and exec this query
        // "UPDATE JOB SET JOBID='" + ID + "', JOBNAME='" + Name + "', JOBDESC='" +
        // Desc+ "', JOBQUAL='" + Qual + "',JOBPD='" + Publish + "' WHERE ACCOUNT_ID=" +
        // id + "";

    }

}
