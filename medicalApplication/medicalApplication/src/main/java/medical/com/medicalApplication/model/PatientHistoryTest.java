package medical.com.medicalApplication.model;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PatientHistoryTest {

private static PatientHistory patienthistory;
	
	private static Treatment treatment;
	private static Medication medication;
	private static Allergey allergey;
	
	private static List<Treatment> treatments;
	private static List<Medication> medications;
	private static List<Allergey> allergy;
	

	@BeforeAll
	public static void setUpBeforeClass() {
		
		patienthistory = new PatientHistory();
		
		treatment = new Treatment("05/23/2020", "Diagnose", "Description");
		medication = new Medication("Med Name","05/23/2020","5/28/2020","Dose 1 Dose 2");
		allergey = new Allergey("Allergey Name");
		
		
		treatments = new ArrayList<>();
		treatments.add(treatment);
		
		medications = new ArrayList<>();
		medications.add(medication);
		
		
		allergy = new ArrayList<>();
		allergy.add(allergey);

		
		patienthistory.addAllergy(allergey);
		patienthistory.addMedication(medication);
		patienthistory.addTreatment(treatment);
		
	}
	
	
	@Test
	public final void testGetAlergies() {
		
		assertTrue(patienthistory.getAlergies().equals(allergy));
	}

	@Test
	public final void testGetAllTreatments() {
		
		assertTrue(patienthistory.getAllTreatments().equals(treatments));
		
	}

	@Test
	public final void testGetAllMedications() {
		
		assertTrue(patienthistory.getAllMedications().equals(medications));
	}

}
