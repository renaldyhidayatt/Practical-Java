package composition;

import java.util.Date;

public class Doctor extends Person{
    
    private String expertiseArea;
    private int diplomaNumber;


    public Doctor(String name, Date birthDate, String telephoneNumber,
                  String expertiseArea, int diplomaNumber) {
        super(name, birthDate, telephoneNumber);
        setExpertiseArea(expertiseArea);
        setDiplomaNumber(diplomaNumber);
    }

    public String getExpertiseArea() {
        return expertiseArea;
    }

    public void setExpertiseArea(String expertiseArea) {
        this.expertiseArea = expertiseArea;
    }

    public int getDiplomaNumber() {
        return diplomaNumber;
    }

    public void setDiplomaNumber(int diplomaNumber) {
        this.diplomaNumber = diplomaNumber;
    }
}
