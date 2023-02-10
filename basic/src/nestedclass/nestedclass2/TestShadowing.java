package nestedclass.nestedclass2;


public class TestShadowing {
    public static void main(String[] args) {
        HospitalManagement.HospitalStatistics hospitalStatistics =
                new HospitalManagement().new HospitalStatistics();
        hospitalStatistics.printMaxNumberOfDoctors();
    }
}
