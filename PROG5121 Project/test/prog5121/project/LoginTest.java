/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maseo Junior
 */
public class LoginTest {

    public LoginTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        //Set up global variables for String method
        Account.username = "Dani_123";
        Account.password = "ST10387488@vc";
        Account.firstName = "Maseo";
        Account.lastName = "Mandix";
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
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserNameValid method, of class Login.
     */
    @Test
    public void testCheckUserNameValid() {
        System.out.println("checkUserNameValid");
        String username = "kyl_1";
        String user1 = "knoxman!!!";
        boolean expResult = true;
        boolean user1Result = false;
        boolean result = Login.checkUserNameValid(username);
        boolean userRes = Login.checkUserNameValid(user1);
        assertEquals(expResult, result);
        assertEquals(userRes, user1Result);
        System.out.println(result);
        System.out.println(user1Result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplex method, of class Login.
     */
    @Test

    public void testCheckPasswordComplex() {
        System.out.println("checkPasswordComplex");
        String password = "Ch&&sec@ke99!";
        String user1 = "knoxman!!!";
        boolean user1Result = false;
        boolean expResult = true;
        boolean result = Login.checkPasswordComplex(password);
        boolean userRes = Login.checkUserNameValid(user1);
        assertEquals(expResult, result);
        System.out.println(result);
        System.out.println(user1Result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "hjjhhj";
        String password = "ST10367488@vc";
        boolean expResult = false;
        boolean result = Login.loginUser(username, password);
        assertEquals(expResult, result);
        System.out.println(result);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = true;
        String firstName = "";
        String lastName = "";
        String result = Login.returnLoginStatus(loginStatus, firstName, lastName);
        String expResult = "welcome" + firstName + ", " + lastName + ", it is great to see you again.";
        assertEquals(expResult, result);
        assertTrue(result.contains(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kyle!!!!!";
        String password = "ST10367488@vc";
        String expResult = "Username is incorrectly formatted, Please ensure that your username contains an underscore and is no more than 5 characters in length.";
        String result = Login.registerUser(username, password);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
