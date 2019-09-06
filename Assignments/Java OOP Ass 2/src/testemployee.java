import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EmployeeTest {

	Company startUp;

    @BeforeAll
	public static void setUpBeforeAllTests() {
		System.out.println("Starting tests...!");
	}
    
    @AfterAll
	public static void tearDownAfterAllTests(){
		System.out.println("Ending tests...!");
	}
    

    @BeforeEach
    public void setUpBeforeEachTest() {
    	startUp = new Company();
    	startUp.getEmployees().add(new Manager("tester", 9, new OurDate(), 8000, "CEO"));
    	startUp.getEmployees().add(new Staff("tester2", 9, new OurDate(), 2000, "Janitor"));
    	
    }

    @AfterEach
    public void tearDownAfterEachTest() {
    	System.out.println("After tests...!");
        startUp = null;
        
    }

    @Test
    public void testDeleteEmployeeReturnsNull() {
      assertNull(startUp.deleteEmployee(8888));
    }
    
    @Test
    public void testDeletesFirstEmployeeOnly() {
    	startUp.deleteEmployee(9);
    	assertEquals("tester2", startUp.findEmployee(9).getName());
    }

  
    @Test
    public void testNoAccidentalDeleteEmployee() {
    	startUp.deleteEmployee(8888);
    	assertEquals(2, startUp.currentNumberEmployees());
    }
    
    @Test
    public void testTempEquals() {
    	Temp employeTemp = new Temp();
    	Temp employeTemp2 = new Temp();
    	assertEquals(employeTemp, employeTemp2);
    }


}

