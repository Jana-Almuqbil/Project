
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PatientTest {
    
    public PatientTest() {
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

    @Test
    public void testToString() {
        System.out.println("toString");
        Patient instance = new Patient ("Albandri", "Bander", 2105370, 2002, "Oily skin", false);
        String expResult = "------------------------------------------------\n"
                +"Patient profile number "+1
                +"\n Name: " + "Albandri" +" "+ "Bander" 
                +"\n ID: " + 2105370
               + "\n Age: " + 21
               + "\n Skin typ: " + "Oily skin" ;
               
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
     @Test
    public void testCalculateAge() {
        System.out.println("calculateAge");
         Patient instance = new Patient ("Albandri", "Bander", 2105370, 2002, "Oily skin", false);
        int expResult = 21;
        int result = instance.calculateAge();
        assertEquals(expResult, result);
       
    }
    
}
