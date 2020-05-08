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
public class CompanyTest {
    
    public CompanyTest() {
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
     * Test of createCompanyAccount method, of class Company.
     */
    @Test
   public void testCreateCompanyAccount() throws SQLException {
       
        System.out.println("createCompanyAccount");
        int role =0;
        String username="EzzatMahmoud";
        String password="012345";
        String name = "Ezzat";
        String location = "Madianty";
        String Email = "EzzatELlshazly7@gmail.com";
        int userID = 7;
       Company comTest= new Company(role,username,password, name,location, Email);
       comTest.createCompanyAccount(name, location, Email, userID);
      
       try{
            Statement StaTest = RecruitmentSystem.con.createStatement();
            ResultSet rs =StaTest.executeQuery("select name from Company where UserID='"+userID+"'");
           assertEquals(name,rs.getString("name"));
       } catch (Exception z){
       fail("the test case is wrong");
    }
    }

    /**
     * Test of setCompanyID method, of class Company.
     */
    @Test
    public void testSetCompanyID() {
        System.out.println("setCompanyID");
        int companyID = 0;
        Company instance = null;
        instance.setCompanyID(companyID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyID method, of class Company.
     */
    @Test
    public void testGetCompanyID() {
        System.out.println("getCompanyID");
        Company instance = null;
        int expResult = 0;
        int result = instance.getCompanyID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Company.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Company instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Company.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String Location = "";
        Company instance = null;
        instance.setLocation(Location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Company.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Company instance = null;
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVaccancies method, of class Company.
     */
    @Test
    public void testSetVaccancies() {
        System.out.println("setVaccancies");
        ArrayList<Job> Vaccancies = null;
        Company instance = null;
        instance.setVaccancies(Vaccancies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperince method, of class Company.
     */
    @Test
    public void testSetExperince() {
        System.out.println("setExperince");
        ArrayList<JobSeeker> Visitors = null;
        Company instance = null;
        instance.setExperince(Visitors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Company.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Company instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Company.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Company instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Company.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Company instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVaccancies method, of class Company.
     */
    @Test
    public void testGetVaccancies() {
        System.out.println("getVaccancies");
        Company instance = null;
        ArrayList<Job> expResult = null;
        ArrayList<Job> result = instance.getVaccancies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisitors method, of class Company.
     */
    @Test
    public void testGetVisitors() {
        System.out.println("getVisitors");
        Company instance = null;
        ArrayList<JobSeeker> expResult = null;
        ArrayList<JobSeeker> result = instance.getVisitors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveVac method, of class Company.
     */
    @Test
    public void testRemoveVac() throws SQLException {
        int JobID = 0;
         int role =0;
        String username="EzzatMahmoud";
        String password="012345";
        String name = "Ezzat";
        String location = "Madianty";
        String Email = "EzzatELlshazly7@gmail.com";
        int userID = 7;
        Company co= new Company(role,username,password, name,location, Email);;
        String result = co.RemoveVac(JobID);
        Statement stmt=RecruitmentSystem.con.createStatement();
        ResultSet rs =stmt.executeQuery("select * from Job where JobID='"+JobID+"'");
        assertNull(rs.getInt(JobID));
        //assertEquals(JobID,rs.getInt(JobID));
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PostVacanies method, of class Company.
     */
    @Test
    public void testPostVacanies() {
        System.out.println("PostVacanies");
        String name = "";
        String desc = "";
        String qual = "";
        String publish = "";
        int CID = 0;
        Company instance = null;
        Job expResult = null;
        Job result = instance.PostVacanies(name, desc, qual, publish, CID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ManageStatus method, of class Company.
     */
    @Test
    public void testManageStatus() {
        System.out.println("ManageStatus");
        int ApplicationID = 0;
        Company instance = null;
        instance.ManageStatus(ApplicationID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConfirmationString method, of class Company.
     */
    @Test
    public void testConfirmationString() {
        System.out.println("ConfirmationString");
        boolean confirmation = false;
        Company instance = null;
        String expResult = "";
        String result = instance.ConfirmationString(confirmation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
