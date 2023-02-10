package nestedclass.nestedclass4;

public class HospitalManagement {
    public final static String hospitalLocation="USA";


    private final int MAX_NUMBER_OF_DOCTORS = 10;
    private final int MAX_NUMBER_OF_PATIENTS = 100;
    private Doctor[] doctors = new Doctor[MAX_NUMBER_OF_DOCTORS];
    private Patient[] patients = new Patient[MAX_NUMBER_OF_PATIENTS];
    
    private int nextDoctorIndex = 0;
    private int nextPatientIndex = 0;

    public boolean registerDoctor(Doctor doctor) {
        if (nextDoctorIndex < MAX_NUMBER_OF_DOCTORS) {
            doctors[nextDoctorIndex++] = doctor;
            System.out.println(doctor.getName() + " registered successfully");
            return true;
        } else {
            System.out.println(doctor.getName() + " could not be registered");
            return false;
        }
    }

    public boolean registerPatient(Patient patient) {
        if (nextPatientIndex < MAX_NUMBER_OF_PATIENTS) {
            patients[nextPatientIndex++] = patient;
            System.out.println(patient.getName() + " registered successfully");
            return true;
        } else {
            System.out.println(patient.getName() + " could not be registered");
            return false;
        }
    }

    private int getStatistics() {
        HospitalStatistics hospitalStatistics = new HospitalStatistics();
        return hospitalStatistics.getNumberOfProsthesisUserPatients();
    }


   
    public class HospitalStatistics {

 
        private final int MAX_NUMBER_OF_DOCTORS = 25;
        
        public void printMaxNumberOfDoctors() {
            System.out.println(HospitalManagement.this.MAX_NUMBER_OF_DOCTORS);
           
            System.out.println(this.MAX_NUMBER_OF_DOCTORS);
            System.out.println(MAX_NUMBER_OF_DOCTORS);
        }

        public int getNumberOfProsthesisUserPatients() {
           
            int counter = 0;
            for (Patient patient : patients) {
                if (patient != null)
                    if (patient.hasProsthesis())
                        counter++;
            }
            return counter;
        }
    }

   
    public static class DoctorSalary{
        public  int x;
        public static double coFactor=100;
        public static double baseSalary=5000;

        public double getSalary(int yearsOfExperience){
            return baseSalary+coFactor*yearsOfExperience;
        }

        public void  printHosptalCountry(){
            System.out.println(hospitalLocation);

        }

        public void  printMaxNumberOfDoctors(){
            HospitalManagement hospitalManagement = new HospitalManagement();
            System.out.println(hospitalManagement.MAX_NUMBER_OF_DOCTORS);

        }

        public  void printNumberOfProsthesisUser(){
            HospitalStatistics hospitalStatistics=
                    new HospitalManagement(). new HospitalStatistics();
            System.out.println(hospitalStatistics.getNumberOfProsthesisUserPatients());
        }

    }


}
