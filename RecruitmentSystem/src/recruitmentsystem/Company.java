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
public class Company extends User {
  private String Name;
  private String Location;
  private String Email;
  private ArrayList<Job> Vaccancies;
  private ArrayList<Jobseeker> Visitors;

    
    public Company(String Name, String Location, String Email,ArrayList<job> Vaccancies,ArrayList<Jobseeker> Visitors ) {
        this.Name = Name;
        this.Location = Location;
        this.Email = Email;
        this.Vaccancies = Vaccancies;
        this.Visitors = Visitors;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLocation(int Location) {
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

    public int getLocation() {
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

 
   
   
   
   
}
