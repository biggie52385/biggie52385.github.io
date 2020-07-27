package medical.com.medicalApplication.model;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TreatmentTest {

	private static Treatment treatment;

	@BeforeAll
	public static void BeforeClass(){
		
		treatment = new Treatment("05/23/2020","Diagnose","Description");
	}

	

	@Test
	public final void testGetTreatmentDate() {
		
		assertTrue(treatment.getTreatmentDate().equals("05/23/2020"));
	}

	@Test
	public final void testSetTreatmentDate() {
		
		assertTrue(treatment.getTreatmentDate().equals("05/23/2020"));
	}

}
