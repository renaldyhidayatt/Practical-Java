package exception.exception8;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.text.ParseException;
import java.time.LocalDate;

public class Main {

    public static int calculateAge(int birthYear) {
        if (birthYear < 0 || birthYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Your birth year is not valid");
        }
        return LocalDate.now().getYear() - birthYear;
    }
    public Double parseSalary(String salary )  {
        if(salary.contains("$"))
            throw new ParseException("Salary can not include currency symbol"
                    ,salary.indexOf("$"));

        return Double.parseDouble(salary);
    }
    public static void main(String[] args) {

        System.out.println(calculateAge(1979));
        System.out.println(calculateAge(2500));
    }
}
