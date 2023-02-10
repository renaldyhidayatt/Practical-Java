package composition;

import java.util.Date;

public class TestComposition {
    public static void main(String[] args) {
       
        HospitalManagement hospitalManagement = new HospitalManagement();
        
        Doctor doctor = new Doctor("John", new Date(1979,5,5),
                "05115111111",
                "Brain",
                1001);
        
        hospitalManagement.registerDoctor(doctor);

        Patient patient= new Patient("Caroline",new Date(1956,10,10),
                "053325477788","ARh+",true);
       
        hospitalManagement.registerPatient(patient);
        

    }
}
