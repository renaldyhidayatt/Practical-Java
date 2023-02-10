package nestedclass.nestedclass1;

import java.util.Date;

public class TestInnerClass {
    public static void main(String[] args) {


        HospitalManagement hospitalNewYorkManagement = new HospitalManagement();
        Patient patientCaroline = new Patient("Caroline", new Date(1956, 10,
                10),
                "053325477788", "ARh+", true);
        hospitalNewYorkManagement.registerPatient(patientCaroline);

        Patient patientJohn = new Patient("John", new Date(1976, 10, 10),
                "053325477788", "ARh+", true);
        hospitalNewYorkManagement.registerPatient(patientJohn);
        HospitalManagement.HospitalStatistics hospitalStatistics =
                hospitalNewYorkManagement.new HospitalStatistics();
        int numberOfProsthesisUser =
                hospitalStatistics.getNumberOfProsthesisUserPatients();
        System.out.println("numberOfProsthesisUser: " + numberOfProsthesisUser);


    }
}
