/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentsystem;

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
public class UserAccountTest {
    
    public UserAccountTest() {
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
     * Test of setId method, of class UserAccount.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        UserAccount instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class UserAccount.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        int role = 0;
        UserAccount instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class UserAccount.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String UserName = "";
        UserAccount instance = null;
        instance.setUserName(UserName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UserAccount.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserAccount instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class UserAccount.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UserAccount instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class UserAccount.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        UserAccount instance = null;
        int expResult = 0;
        int result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class UserAccount.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        UserAccount instance = null;
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class UserAccount.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserAccount instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class UserAccount.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        int role = 0;
        String username = "";
        String password = "";
        UserAccount instance = null;
        instance.createAccount(role, username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class UserAccount.
     */
    @Test
    public void testUpdateAccount() {
        System.out.println("updateAccount");
        int id = 0;
        String password = "";
        String username = "";
        UserAccount instance = null;
        instance.updateAccount(id, password, username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logIn method, of class UserAccount.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        String username = "";
        String password1 = "";
        UserAccount instance = null;
        int expResult = 0;
        int result = instance.logIn(username, password1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserAccountImpl extends UserAccount {

        public UserAccountImpl() {
            super(0, "", "");
        }
    }
    
}
