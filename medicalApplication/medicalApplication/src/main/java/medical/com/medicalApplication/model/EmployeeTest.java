package medical.com.medicalApplication.model;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private static Employee employee;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		
		employee = new Employee("EmployeeName", "23456");
		
	}

	@Test
	public final void testGetName() {
		
		assertTrue(employee.getName().equals("EmployeeName"));
		
	}

	@Test
	public final void testGetId() {
		
		assertTrue(employee.getId().equals("23456"));
		
	}

	@Test
	public final void testGetPassword() {
		
		assertTrue(employee.getPassword().equals("Open"));
	}

}
