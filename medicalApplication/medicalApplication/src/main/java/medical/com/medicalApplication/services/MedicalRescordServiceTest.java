package medical.com.medicalApplication.services;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import medical.com.medicalApplication.model.Allergey;

class MedicalRescordServiceTest {

	MedicalRescordService mdrecordservice = new MedicalRescordService(); 
	   

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		
		MedicalRescordService.getReference().addPatient("PName Lname","3456");
		
		MedicalRescordService.getReference().addPatient("PName2 Lname","34567");
		
		MedicalRescordService.getReference().getMedicalRecord("3456").getHistory().addAllergy(new Allergey("Allergey Name"));
		MedicalRescordService.getReference().getMedicalRecord("3456").getHistory().addAllergy(new Allergey("Allergey Name2"));
		
		
		
	}
	
	
	@Test
	public void testAddPatient() {
		
		MedicalRescordService.getReference().addPatient("","");
		
		int numofpatients = MedicalRescordService.getReference().getAllPatients().size();
		
		assertEquals("Allow Empty Strin s to pass",2,numofpatients);
		
		
	}
	
	@Test
	public void testAddAllergies() {
		
		for(int n = 0; n < 10; n++) {
			
		MedicalRescordService.getReference().getMedicalRecord("3456").getHistory().addAllergy(new Allergey("Dumbosis"));
		
		}
		
		int allergies = MedicalRescordService.getReference().getMedicalRecord("3456").getHistory().getAlergies().size();
	
		assertEquals("Duplicate Allergies For The same Patient ",1,allergies);
	
	}


}
