package nestedclass.nestedclass3;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;
    private String telephoneNumber;


    public Person(String name, Date birthDate, String telephoneNumber) {
        setName(name);
        setBirthDate(birthDate);
        setTelephoneNumber(telephoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
