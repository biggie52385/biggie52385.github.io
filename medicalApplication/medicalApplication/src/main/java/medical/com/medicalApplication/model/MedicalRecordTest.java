package medical.com.medicalApplication.model;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MedicalRecordTest {
	private static MedicalRecord medicalrecord;

	@BeforeAll
	public static void BeforeClass(){
		
		medicalrecord = new MedicalRecord(new Patient("PFname PLname", "123"));
		
		medicalrecord.getHistory().addAllergy(new Allergey("Allergey Name"));
		medicalrecord.getHistory().addMedication(new Medication("Med Name","05/26/2020","05/28/2020","Dose Name"));
		medicalrecord.getHistory().addTreatment(new Treatment("05/28/2020", "Diagnose name","Description"));
		
	}
	

	@Test
	public final void testGetPatient() {
		
		assertTrue(medicalrecord.getPatient().getName().equals("Yu Dair"));
		
	}
	
	
	
	@Test
	public void testNullPointerException() {
		
		
       MedicalRecord medicalrecord_2 = new MedicalRecord(new Patient("Dr Austen", "12345"));
		
		medicalrecord_2.getHistory().addAllergy(new Allergey("Intelligence"));
		medicalrecord_2.getHistory().addAllergy(new Allergey(""));
		
	   
	}
	
	@Test
	public void testAddMedication() {
		
      MedicalRecord medicalrecord_3 = new MedicalRecord(new Patient("Dr Austen", "12345"));
		
	
      medicalrecord_3.getHistory().addMedication(new Medication("Brains","05/28/2020", "05/230/2020", "AMAP"));

		
		
	}
	
	@Test
	public void testFindAllergey() {
		
		
		MedicalRecord medicalrecord_4 = new MedicalRecord(new Patient("Dr Austen", "12345"));	
		
		medicalrecord_4.getHistory().addAllergy(new Allergey("Allergey One"));
		medicalrecord_4.getHistory().addAllergy(new Allergey("Allergey Two"));
		medicalrecord_4.getHistory().addAllergy(new Allergey("Allergey Three"));
		medicalrecord_4.getHistory().addAllergy(new Allergey("Allergey Four"));
		
		if(medicalrecord_4.getPatient().getName().equals("Dr Austen")) {
			
			assertTrue(medicalrecord_4.getHistory().getAlergies().size() == 4 &&
					medicalrecord_4.getHistory().getAlergies().stream().anyMatch(Allergey -> Allergey.getName().equals("Allaergey Four")));
			
		}
		
	}
	
	

	@Test
	public final void testGetHistory() {
		
		assertTrue(medicalrecord.getHistory().getAlergies().stream().anyMatch(Allergey -> Allergey.getName().equals("Intelligence"))
				&& medicalrecord.getHistory().getAllMedications().stream().anyMatch(Medications -> Medications.getName().equals("Brains"))
				&& medicalrecord.getHistory().getAllTreatments().stream().anyMatch(Treatments -> Treatments.getDiagnose().equals("AMAP"))
				&& medicalrecord.getPatient().getId().equals("23456"));
	
		
	}

}
