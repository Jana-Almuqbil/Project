/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ohood
 */
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of bookAppointment method, of class Appointment.
     */
    
    @Test (expected = NoSuchElementException.class)
    public void testBookAppointment() {
	System.out.println("bookAppointment");
	int day = 15;
	Appointment.bookAppointment(day);
    }

    /**
     * Test of toString method, of class Appointment.
     */
    @Test
    public void testToString() {
	System.out.println("toString");
	Appointment instance = new Appointment("Jana", 0500000001, 25);
	String expResult = "----------------------- Appointment -------------------------\n"
		+ "Patient name:" + "Jana"
		+ "\nPhone number: " + 0500000001
		+ "\nDate: " + 25 + "Jun 2023";
	String result = instance.toString();
	assertEquals(expResult, result);
    }
    
}
