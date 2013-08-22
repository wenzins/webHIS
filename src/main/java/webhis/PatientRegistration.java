package webhis;

public class PatientRegistration {
	
	PatientRepository patientRepository;
	PatientDetails patientDetails;

	public PatientRegistration(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	void addPatient() {
		patientRepository.addPatient(patientDetails);
	}
	
	void updatePatient() {
		patientRepository.updatePatient(patientDetails);
	}
	
    void deletePatient() {
    	patientRepository.deletePatient(patientDetails.getUHID(), patientDetails.getRegNumber());
    }
}
