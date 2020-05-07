/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner; 

/**
 *
 * @author Kemiaa
 */
public class RecruitmentSystem {

    /**
     * @param args the command line arguments
     */
    public static Connection con;

    public static void main(String[] args) {
        // TODO code application logic here

        
        // Create account 
        try {
            //Loading the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //Get a connection to database
            
//            Connection of database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "recruitment_system", "root", "");    
            
            System.out.println("Please Choose Your Account Type: (1) Job Seeker     (2) Company     (3) System Admin");
            Scanner input = new Scanner(System.in);
            int accountType = input.nextInt();
            
            switch(accountType){
                case 1:
                    System.out.println("Please Enter Username that will be used for login");
                    Scanner input1 = new Scanner(System.in);
                    String username = input1.nextLine();
                    
                    System.out.println("Please Enter Password that will be used for login");
                    Scanner input2 = new Scanner(System.in);
                    String password = input1.nextLine();
                    
                    System.out.println("Please enter your first name");
                    Scanner input6 = new Scanner(System.in);
                    String name = input1.nextLine();
                    
                    System.out.println("Please enter your email");
                    Scanner input3 = new Scanner(System.in);
                    String email = input1.nextLine();
                    
                    System.out.println("Please enter your age");
                    Scanner input4 = new Scanner(System.in);
                    int age = input1.nextInt();
                    
                    System.out.println("Please enter your university");
                    Scanner input5 = new Scanner(System.in);
                    String education = input1.nextLine();
                    
                    JobSeeker jobSeeker = new JobSeeker(1,username, password, name, age, education, new ArrayList<JobSeekerExp>() );
                    
                    System.out.println("Please Choose Action to be Performed: (1) Apply for Job     (2) Update Account");
                    Scanner input7 = new Scanner(System.in);
                    int x = input7.nextInt();
                    if(x == 1){
                        Job job = new Job();
                        System.out.println("Please enter job title to search for");
                        Scanner input8 = new Scanner(System.in);
                        String jobTitle = input8.nextLine();
                        if(job.SearchForJob(jobTitle) == null){
                            System.out.println("Sorry, There's no job in the database with this title");
                        }else{
                            jobSeeker.apply(jobSeeker.getJobSeekerID(), job.SearchForJob(jobTitle).get(0).getJobID(), "8/5/2020", "no");
                            System.out.println("You have succeeded applied for this job");
                        }
                    }else if(x == 2){
                        System.out.println("Please enter new username");
                        Scanner input10 = new Scanner(System.in);
                        String newUsername = input10.nextLine();
                        
                        System.out.println("Please enter new password");
                        Scanner input11 = new Scanner(System.in);
                        String newPassword = input11.nextLine();
                        jobSeeker.updateAccount(jobSeeker.getUserID(), newPassword, newUsername);
                        System.out.println("Your account data is updated successfully");
                    }
                case 2:
                      System.out.println("Please Enter Username that will be used for login");
                    Scanner input12 = new Scanner(System.in);
                    String companyUserName = input12.nextLine();
                    
                            System.out.println("Please Enter password that will be used for login");
                    Scanner input13 = new Scanner(System.in);
                    String companyPassword = input13.nextLine();
                    
                      System.out.println("Please Enter Name that will be used for login");
                    Scanner input14 = new Scanner(System.in);
                    String companyName = input14.nextLine();
                    
                     System.out.println("Please Enter Location the Company Location");
                    Scanner input15= new Scanner(System.in);
                    String companyLocation = input15.nextLine();
                    
                    System.out.println("Please Enter Location the Company Email");
                    Scanner input16= new Scanner(System.in);
                    String companyEmail = input16.nextLine();
                    
                    
                    Company company= new Company(2, companyUserName,companyPassword,companyName,companyLocation,companyEmail);
                    
                      System.out.println("Please Choose Action to be Performed: (1) PostVacanies     (2) DeleteVacanies (3)ManageStatus ");
                       Scanner input17 = new Scanner(System.in);
                    int x2 = input17.nextInt();
                    
                    if(x2==1){
                           System.out.println("Please Enter Name of Vacanies");
                    Scanner input18= new Scanner(System.in);
                    String jobName = input18.nextLine();
                    
                      System.out.println("Please Enter Description of Vacanies");
                    Scanner input19= new Scanner(System.in);
                    String jobDescription = input19.nextLine();
                    
                             System.out.println("Please Enter Qualification of Vacanies");
                    Scanner input20= new Scanner(System.in);
                    String jobQualification = input20.nextLine();
                    
                     System.out.println("Please Enter PublishDate of Vacanies");
                    Scanner input21= new Scanner(System.in);
                    String jobPublishDate = input21.nextLine();
                    
                    company.PostVacanies(jobName, jobDescription, jobQualification, jobPublishDate,company.getId());
                    }
                    else if(x2 == 2){
                            company.RemoveVac(2);       
                            }
                    else{
                    company.ManageStatus(4);
                    }      
            }
 
        } catch (Exception e) {
            System.err.println("DATABASE CONNECTION ERROR: " + e.toString());

        }

    }
}
