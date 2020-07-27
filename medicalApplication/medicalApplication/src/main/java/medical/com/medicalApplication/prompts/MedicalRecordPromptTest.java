package medical.com.medicalApplication.prompts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import medical.com.medicalApplication.model.Allergey;
import medical.com.medicalApplication.model.Doctor;
import medical.com.medicalApplication.model.Employee;

class MedicalRecordPromptTest {

	static Doctor doctorObj;

	static Employee employeeObj;

	@BeforeAll

	public static void testSetup() {

	doctorObj = new Doctor("Austen Chaney", "12345");

	employeeObj = new Employee("BIFF", "23456");

	}

	@Test

	public void testDoctorDetails() {

	String expectedString = doctorObj.toString();

	String actualString = "Doctor Name:Austen Chaney ID: 12345";

	assertEquals(expectedString, actualString);

	}

	@Test

	public void testEmployeeDetails() {

	String expectedString = employeeObj.getPassword();

	String actualString = "Open";

	assertEquals(expectedString, actualString);

	}

	@Test

	 public void testAllergy(){
        Allergey allergy =new Allergey("Dumbosis");
        allergy.setName("Dumbosis");
        assertEquals("Allergy Dumbosis", allergy.toString());

	}

}

