package medical.com.medicalApplication.model;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MedicationTest {

	private static Medication medication;

	@BeforeAll
	public static void BeforeClass() {
		
		medication = new Medication("MedName", "05/23/2020","5/228/2020","Dose");
		
	}
	
	@Test
	public final void testGetName() {
		
		assertTrue(medication.getName().equals("MedName"));
	}

	@Test
	public final void testSetName() {
		
		assertTrue(medication.getName().equals("MedName"));
	}

	@Test
	public final void testGetStartDate() {
		
		assertTrue(medication.getStartDate().equals("05/23/2020"));
	}

	@Test
	public final void testSetStartDate() {
		
		assertTrue(medication.getStartDate().equals("05/23/2020"));
	}

}
