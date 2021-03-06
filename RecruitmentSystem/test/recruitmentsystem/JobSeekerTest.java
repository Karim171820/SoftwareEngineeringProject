/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmed Kamal
 */
public class JobSeekerTest {
    
    public JobSeekerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setUserID method, of class JobSeeker.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        int userID = 0;
        JobSeeker instance = new JobSeeker();
        instance.setUserID(userID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserID method, of class JobSeeker.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        JobSeeker instance = new JobSeeker();
        int expResult = 0;
        int result = instance.getUserID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createJobSeekerAccount method, of class JobSeeker.
     */
    @Test
      public void testCreateJobSeekerAccount() throws SQLException {
        String name = "abdelrahman";
        String Username = "tester1";
        int age = 0;
        String email = "Tester@tester";
        String education = "BUE";
        int userID = 0;
        String password = "1234";
        int role = 1;

        JobSeeker test = new JobSeeker(role, Username, password, name, age, email, education);
        test.createJobSeekerAccount(name, age, email, education, userID);

        //retriving the UserID from jobseeker
        try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            ResultSet rs = stmt.executeQuery("select name from jobseeker where UserID=' " + userID + " '");
            assertEquals(name, rs.getString(1));

            System.out.println("Test Success");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of setJobSeekerID method, of class JobSeeker.
     */
    @Test
    public void testSetJobSeekerID() {
        System.out.println("setJobSeekerID");
        int id = 0;
        JobSeeker instance = new JobSeeker();
        instance.setJobSeekerID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobSeekerID method, of class JobSeeker.
     */
    @Test
    public void testGetJobSeekerID() {
        System.out.println("getJobSeekerID");
        JobSeeker instance = new JobSeeker();
        int expResult = 0;
        int result = instance.getJobSeekerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class JobSeeker.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        JobSeeker instance = new JobSeeker();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class JobSeeker.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        JobSeeker instance = new JobSeeker();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class JobSeeker.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        JobSeeker instance = new JobSeeker();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducation method, of class JobSeeker.
     */
    @Test
    public void testSetEducation() {
        System.out.println("setEducation");
        String education = "";
        JobSeeker instance = new JobSeeker();
        instance.setEducation(education);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class JobSeeker.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        JobSeeker instance = new JobSeeker();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class JobSeeker.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        JobSeeker instance = new JobSeeker();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class JobSeeker.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        JobSeeker instance = new JobSeeker();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducation method, of class JobSeeker.
     */
    @Test
    public void testGetEducation() {
        System.out.println("getEducation");
        JobSeeker instance = new JobSeeker();
        String expResult = "";
        String result = instance.getEducation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperince method, of class JobSeeker.
     */
    @Test
    public void testGetExperince() {
        System.out.println("getExperince");
        JobSeeker instance = new JobSeeker();
        ArrayList<JobSeekerExp> expResult = null;
        ArrayList<JobSeekerExp> result = instance.getExperince();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apply method, of class JobSeeker.
     */
    @Test
    public void testApply() {
        String name = "abdelrahman";
        String Username = "tester1";
        int age = 0;
        String email = "Tester@tester";
        String education = "BUE";
        int JSID = 2;
        String password = "1234";
        int role = 1;
        String status = "active";
        int jobID=2;
        JobSeeker test = new JobSeeker(role, Username, password, name, age, email, education);
        test.apply(JSID, jobID, "5/7/2020", status);

        //retriving the UserID from jobseeker
        try {
            Statement stmt = RecruitmentSystem.con.createStatement();
            ResultSet rs = stmt.executeQuery("select jobSeekerID from application where jobID=' " + jobID + " '");
            assertEquals(JSID, rs.getInt(1));

            System.out.println("Test Success");
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }

    }


    /**
     * Test of getJobSeekerByID method, of class JobSeeker.
     */
    @Test
    public void testGetJobSeekerByID() {
        System.out.println("getJobSeekerByID");
        int jobSeekerID = 0;
        JobSeeker instance = new JobSeeker();
        JobSeeker expResult = null;
        JobSeeker result = instance.getJobSeekerByID(jobSeekerID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class JobSeeker.
     */
    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        String status = "";
        JobSeeker instance = new JobSeeker();
        instance.updateStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperince method, of class JobSeeker.
     */
    @Test
    public void testSetExperince() {
        System.out.println("setExperince");
        ArrayList<JobSeeker> experince = null;
        JobSeeker instance = new JobSeeker();
        instance.setExperince(experince);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
