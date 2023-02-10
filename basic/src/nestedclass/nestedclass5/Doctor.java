package nestedclass.nestedclass5;

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
        class Validator{
            boolean validate(){
                if(diplomaNumber>=1000 &&diplomaNumber<=9999){
                    System.out.println("Valid diploma number");
                    return true;
                }else{
                    System.out.println("Invalid diploma number");
                    return false;
                }
            }
        }
        Validator validator = new Validator();
        if(validator.validate()) {
            this.diplomaNumber = diplomaNumber;
        }else{
            this.diplomaNumber=0;
        }
    }



}
