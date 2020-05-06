/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.util.ArrayList;

/**
 *
 * @author Kemiaa
 */
public class JobSeeker extends UserAccount implements JobSeekerJobObserver  {
    private int jobSeekerID;
   private String name;
   private int age;
    private String email;
    private String education;
    private ArrayList<JobSeeker>experince;

    public JobSeeker(int role,String username, String password, String name) {
        super(role, username, password);
        this.name = name;
    }
    
    
 
    
    public JobSeeker(int role,String username,String password,String name, int age, String education, ArrayList<JobSeeker> experince) {
   super(role, username, password);
        this.name = name;
        this.age = age;
        this.education = education;
        this.experince = experince;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setExperince(ArrayList<JobSeeker> experince) {
        this.experince = experince;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public ArrayList<JobSeeker> getExperince() {
        return experince;
    }

    
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void logIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public void apply(int id, int jobSeekerID,int jobID,String status){
   Application application= new Application( id, jobSeekerID,  jobID, status);
   
   // add application record in application table
   
   /*public void addStudent(Student s) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into students values('" + s.getName() + "', " + s.getGPA() + ")");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }*/
   
   }
   
public void publishExperience(int numOfyears,String companyName,String title,  ArrayList<String> skills)
{

//       Add Exp in table JobSeekerExp
    
    /*
    
        public void addStudent(Student s) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into students values('" + s.getName() + "', " + s.getGPA() + ")");
            System.out.println("Student added");
        } catch (Exception e) {
            System.err.println("DATABASE INSERTION ERROR: " + e.toString());
        }
    }
    
    */
    
}  
}
