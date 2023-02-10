package nestedclass.nestedclass5;

import java.util.Date;

public class TestAnonymousClass {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("John", new Date(1979, 10, 10), "11111111",
                "Brain", 1500);
        Patient patient = new Patient("Oliver", new Date(1955, 5, 5),
                "11111111",
                "ARh+", true);
        HospitalPrinter hospitalPrinter = new HospitalPrinter();
       

        Printable printableDoctor = new Printable() {
            
            @Override
            public void print() {
                System.out.println("Doctor{" +
                        "Name=" + doctor.getName() +
                        ", DiplomaNumber=" + doctor.getDiplomaNumber() +
                        '}');
            }
        };

        hospitalPrinter.print(printableDoctor);

        hospitalPrinter.print(new Printable() {
            @Override
            public void print() {
                System.out.println("Patient{" +
                        "Name=" + patient.getName() +
                        ", BloodType=" + patient.getBloodType() +
                        ", HasProsthesis=" + patient.hasProsthesis() +
                        '}');
            }
        });
    }
}
