/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kemiaa
 */
public class Application implements  StatusSubject {
    private int id;
    private int jobSeekerID;
    private int jobID;
    String date;
    String status;
  ArrayList< JobSeekerStatusObserver> observerList;
  
  

    public Application(int id, int jobSeekerID, int jobID, String status) {
        this.id = id;
        this.jobSeekerID = jobSeekerID;
        this.jobID = jobID;
        this.date = date;
        this.status = status;
         observerList = new ArrayList< JobSeekerStatusObserver>(); 
          RegisterObserver(   this.jobSeekerID, this.id);
        
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJobSeekerID(int jobSeekerID) {
        this.jobSeekerID = jobSeekerID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getJobSeekerID() {
        return jobSeekerID;
    }

    public int getJobID() {
        return jobID;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void updateAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RegisterObserver(int jobSeekerID, int applicationID) {
        
        
              try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("insert into observersubject (subjectID, observerID) values('" + jobSeekerID + "', '" + applicationID + "')");
       
            System.out.println("Observer added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
        
        
    }

    @Override
    public void UnRegisterObserber(int JobSeekerID) {

            try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("DELETE FROM observersubject WHERE  // ID='" + JobSeekerID + "'");  // ID='" + JobID + "'"
            System.out.println("Vaccancy Removed");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
        
    }
    
    
    
}
