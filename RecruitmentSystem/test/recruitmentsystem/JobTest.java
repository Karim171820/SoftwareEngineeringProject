/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmed Kamal
 */
public class JobTest {
    
    public JobTest() {
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
     * Test of getJobID method, of class Job.
     */
    @Test
    public void testGetJobID() {
        System.out.println("getJobID");
        Job instance = new Job();
        int expResult = 0;
        int result = instance.getJobID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobID method, of class Job.
     */
    @Test
    public void testSetJobID() {
        System.out.println("setJobID");
        int jobID = 0;
        Job instance = new Job();
        instance.setJobID(jobID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobName method, of class Job.
     */
    @Test
    public void testGetJobName() {
        System.out.println("getJobName");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getJobName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobName method, of class Job.
     */
    @Test
    public void testSetJobName() {
        System.out.println("setJobName");
        String jobName = "";
        Job instance = new Job();
        instance.setJobName(jobName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobDesc method, of class Job.
     */
    @Test
    public void testGetJobDesc() {
        System.out.println("getJobDesc");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getJobDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobDesc method, of class Job.
     */
    @Test
    public void testSetJobDesc() {
        System.out.println("setJobDesc");
        String jobDesc = "";
        Job instance = new Job();
        instance.setJobDesc(jobDesc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobQual method, of class Job.
     */
    @Test
    public void testGetJobQual() {
        System.out.println("getJobQual");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getJobQual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobQual method, of class Job.
     */
    @Test
    public void testSetJobQual() {
        System.out.println("setJobQual");
        String jobQual = "";
        Job instance = new Job();
        instance.setJobQual(jobQual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobPD method, of class Job.
     */
    @Test
    public void testGetJobPD() {
        System.out.println("getJobPD");
        Job instance = new Job();
        String expResult = "";
        String result = instance.getJobPD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobPD method, of class Job.
     */
    @Test
    public void testSetJobPD() {
        System.out.println("setJobPD");
        String jobPD = "";
        Job instance = new Job();
        instance.setJobPD(jobPD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObserverList method, of class Job.
     */
    @Test
    public void testGetObserverList() {
        System.out.println("getObserverList");
        Job instance = new Job();
        ArrayList<JobSubject> expResult = null;
        ArrayList<JobSubject> result = instance.getObserverList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObserverList method, of class Job.
     */
    @Test
    public void testSetObserverList() {
        System.out.println("setObserverList");
        ArrayList<JobSubject> observerList = null;
        Job instance = new Job();
        instance.setObserverList(observerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createJob method, of class Job.
     */
    @Test
     public void testCreateJob() throws SQLException {
      try{  Job J = new Job();
        Assert.assertNotNull(J);
          System.out.println("success");
       
      }
      catch(Exception e){
          System.out.println("fail");
      }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of SearchForJob method, of class Job.
     */
    @Test
    public void testSearchForJob() {
        System.out.println("SearchForJob");
        String Name = "";
        Job instance = new Job();
        ArrayList<Job> expResult = null;
        ArrayList<Job> result = instance.SearchForJob(Name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateJob method, of class Job.
     */
    @Test
    public void testUpdateJob() {
        System.out.println("UpdateJob");
        String Name = "";
        String Desc = "";
        String Qual = "";
        String Publish = "";
        Job instance = new Job();
        instance.UpdateJob(Name, Desc, Qual, Publish);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
