package utils;

import java.util.ArrayList;
import java.util.List;

import utils.jeneratedata.LastNameGenerator;
import utils.jeneratedata.NameGenerator;
import domain.Patient;


public class PatientCreator {

	private static PatientCreator instance = null;
	private NameGenerator nameGenerator;
	private LastNameGenerator lastNameGenerator;
	
	public PatientCreator(){
		//nothing to do
	}
	
	public static PatientCreator getInstance(){
		if (instance == null){
			instance = new PatientCreator();
			instance.setNameGenerator(new NameGenerator());
			instance.setLastNameGenerator(new LastNameGenerator()); 
		}
		return instance;
	}
	
	public List<Patient> createPatients(int numberOfPatients){
		List<Patient> patients = new ArrayList<Patient>();
		for (int i = 0; i < numberOfPatients; i++) {
			patients.add(new Patient(this.nameGenerator.generate(),this.lastNameGenerator.generate()));
		}
		return patients;
	}

	public NameGenerator getNameGenerator() {
		return nameGenerator;
	}

	public void setNameGenerator(NameGenerator nameGenerator) {
		this.nameGenerator = nameGenerator;
	}

	public LastNameGenerator getLastNameGenerator() {
		return lastNameGenerator;
	}

	public void setLastNameGenerator(LastNameGenerator lastNameGenerator) {
		this.lastNameGenerator = lastNameGenerator;
	}
	
	
	
}
