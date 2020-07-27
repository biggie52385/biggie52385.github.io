package medical.com.medicalApplication.services;

import static org.junit.Assert.assertEquals;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import medical.com.medicalApplication.model.Doctor;

class DoctorServiceTest {

private static List<Doctor> doctors;
    
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		
		DoctorService.getReference().addDoctor("Doctor Name 1", "1234");
		DoctorService.getReference().addDoctor("Doctor Name 2", "1244");
		
		doctors = DoctorService.getReference().getAllDoctors();
		
		
	}
	
	@Test
	public void testAddDoctor() {
		
		String drId = "34";
		String drname = "Austen";
		boolean cheker = true;
		int numdoctors = 0;
		int count = 0;
		while(cheker) {
			
			
			DoctorService.getReference().addDoctor(drname,drId);
			
			if(count == 4) {
				
				cheker = false;
			}
			
			numdoctors = doctors.size();
			
			count++;
		}
		
		assertEquals("Doctors have the same id and should not be added",1,numdoctors);
		
		
	}
	
	@Test
    public void testAddDoctorSpace() {
		
		String drId = "";
		String drname = "";
		boolean cheker = true;
		int numdoctors = 0;
		int count = 0;
		while(cheker) {
			
			
			DoctorService.getReference().addDoctor(drname,drId);
			
			if(count == 4) {
				
				cheker = false;
			}
			
			numdoctors = doctors.size();
			
			count++;
		}
		
		assertEquals("Allow Empty Strings To Be added",1,numdoctors);
		
		
	}

	
}
