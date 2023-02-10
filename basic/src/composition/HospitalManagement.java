package composition;


public class HospitalManagement {
    
    private final int MAX_NUMBER_OF_DOCTORS=10;
    private final int MAX_NUMBER_OF_PATIENTS=100;
    private Doctor[] doctors=new Doctor[MAX_NUMBER_OF_DOCTORS];
    private Patient[] patients = new Patient[MAX_NUMBER_OF_PATIENTS];
   
    private int nextDoctorIndex=0;
    private int nextPatientIndex=0;

    public boolean registerDoctor(Doctor doctor){
        if(nextDoctorIndex<MAX_NUMBER_OF_DOCTORS) {
            doctors[nextDoctorIndex++] = doctor;
            System.out.println(doctor.getName() +" registered successfully");
            return true;
        }else{
            System.out.println(doctor.getName()+ " could not be registered");
            return false;
        }
    }

    public boolean registerPatient(Patient patient){
        if(nextPatientIndex<MAX_NUMBER_OF_PATIENTS) {
            patients[nextPatientIndex++] = patient;
            System.out.println(patient.getName() +" registered successfully");
            return true;
        }else{
            System.out.println(patient.getName()+ " could not be registered");
            return false;
        }
    }

}
