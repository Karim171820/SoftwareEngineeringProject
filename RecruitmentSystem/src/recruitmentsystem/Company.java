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
public class Company extends UserAccount {
    private int companyID;
    private String Name;
    private String Location;
    private String Email;
    private ArrayList<Job> Vaccancies;
    private ArrayList<JobSeeker> Visitors;

  
    public Company(int role, String username, String password,String Name, String Location, String Email ) {
        super(role, username, password);
        
             this.createCompanyAccount(Name, Location, Email, super.getId());
        
        this.Name = Name;
        this.Location = Location;
        this.Email = Email;
        this.Vaccancies = Vaccancies;
        this.Visitors = Visitors;
    }
   
    
      public void createCompanyAccount(String name,String location,String Email, int userID) {
 String [] returnID = {"CompanyID"};
         try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("insert into Company (name, location, email, U_ID) values('" + name + "', '" + location +  "', '" + Email +  "','" + userID + "')", returnID);
            System.out.println("Company is Added");
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    this.setCompanyID(rs.getInt(1));
                }
                rs.close();
            }
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }       
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getCompanyID() {
        return companyID;
    }
    

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setVaccancies(ArrayList<Job> Vaccancies) {
        this.Vaccancies = Vaccancies;
    }

    public void setExperince(ArrayList<JobSeeker> Visitors) {
        this.Visitors = Visitors;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getEmail() {
        return Email;
    }

    public ArrayList<Job> getVaccancies() {
        return Vaccancies;
    }

    public ArrayList<JobSeeker> getVisitors() {
        return Visitors;
    }

    public String RemoveVac(int JobID) {
         try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("DELETE FROM job WHERE ID = 2");  // ID='" + JobID + "'"
            System.out.println("Vaccancy Removed");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }

        return null;
    }

    public Job PostVacanies(String name, String desc, String qual, String publish) {      
  
        try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            stmt.executeUpdate("insert into job (ID,name,description,qualification,publishDate,C_ID) values('" + name + "', '" + desc +  "', '" + qual + "','" + publish + "','" + getId() + "')");
            System.out.println("Vaccancy posted Successfully ");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
        return null;
    }
    
    public String ViewVisitors(ArrayList<JobSeeker> Visitors) {


         
        return null; // JOB DESC
    }

  



  
}
