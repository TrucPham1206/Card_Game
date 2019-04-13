/*
 *  Divjot Chawla
 * Student ID:991505770
 * SYST10199 - Web Programming
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author div
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class BlackJack.
     */
   /* @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BlackJack.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkNumber method, of class BlackJack.
     */
    @org.junit.Test
    public void testCheckNumberGood() {
        System.out.println("checkNumber Good");
        int s = 3;
        boolean expResult = true;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @org.junit.Test
    public void testCheckNumberBad() {
        System.out.println("checkNumber Bad");
        int s = 5;
        boolean expResult = false;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @org.junit.Test
    public void testCheckNumberBoundary() {
        System.out.println("checkNumber Boundary");
        int s = 4;
        boolean expResult = false;
        boolean result = BlackJack.checkNumber(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of checkWinner method, of class BlackJack.
     */
    @org.junit.Test
    public void testCheckWinnerGood() {
        System.out.println("checkWinner Good");
        int s = 22;
        boolean expResult = true;
        boolean result = BlackJack.checkWinner(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkWinner method, of class BlackJack.
     */
    @org.junit.Test
    public void testCheckWinnerBad() {
        System.out.println("checkWinner Bad");
        int s = 19;
        boolean expResult = false;
        boolean result = BlackJack.checkWinner(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkWinner method, of class BlackJack.
     */
    @org.junit.Test
    public void testCheckWinnerBoundary() {
        System.out.println("checkWinner Boundary");
        int s = 21;
        boolean expResult = false;
        boolean result = BlackJack.checkWinner(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkMoney method, of class BlackJack.
     */
    @org.junit.Test
    public void testCheckMoneyGood() {
        System.out.println("checkMoney Good");
        int n = 95;
        boolean expResult = true;
        boolean result = BlackJack.checkMoney(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   @org.junit.Test
    public void testCheckMoneyBad() {
        System.out.println("checkMoney Bad");
        int n = 110;
        boolean expResult = false;
        boolean result = BlackJack.checkMoney(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @org.junit.Test
    public void testCheckMoneyBoundary() {
        System.out.println("checkMoney Boundary");
        int n = 100;
        boolean expResult = false;
        boolean result = BlackJack.checkMoney(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
