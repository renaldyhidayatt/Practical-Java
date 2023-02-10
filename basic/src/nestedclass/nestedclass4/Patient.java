package nestedclass.nestedclass4;

import java.util.Date;

public class Patient extends Person {
    private String bloodType;
    private boolean hasProsthesis;
    public Patient(String name, Date birthDate, String telephoneNumber,
                   String bloodType, boolean hasProsthesis) {
        super(name, birthDate, telephoneNumber);
        setBloodType(bloodType);
        setHasProsthesis(hasProsthesis);
        this.hasProsthesis = hasProsthesis;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean hasProsthesis() {
        return hasProsthesis;
    }

    public void setHasProsthesis(boolean hasProsthesis) {
        this.hasProsthesis = hasProsthesis;
    }
}
