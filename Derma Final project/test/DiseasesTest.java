/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ohood
 */
public class DiseasesTest {
    
    public DiseasesTest() {
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
     * Test of askQuestions method, of class Diseases.
     */
    @Ignore
    @Test
    public void testAskQuestions() {
	System.out.println("askQuestions");
	Diseases instance = new Diseases();
	instance.askQuestions();
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of askYesNoQuestion method, of class Diseases.
     */
    @Ignore
    @Test
    public void testAskYesNoQuestion() {
	System.out.println("askYesNoQuestion");
	String question = "";
	Diseases instance = new Diseases();
	boolean expResult = false;
	boolean result = instance.askYesNoQuestion(question);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of displayResult method, of class Diseases.
     */
    @Test
    public void testDisplayResult() {
	System.out.println("displayResult");
	Diseases instance = new Diseases();
	instance.displayResult();
	String expResult = "You don't have any cases. \nPlease make a new case first.";
	String result = instance.displayResult();
	assertEquals(expResult, result);
    }
    
}
