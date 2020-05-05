/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

/**
 *
 * @author Kemiaa
 */
public class Application {
    private int id;
    private int jobSeekerID;
    private int jobID;
    String date;
    String status;

    public Application(int id, int jobSeekerID, int jobID, String date, String status) {
        this.id = id;
        this.jobSeekerID = jobSeekerID;
        this.jobID = jobID;
        this.date = date;
        this.status = status;
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
    
    
    
}
