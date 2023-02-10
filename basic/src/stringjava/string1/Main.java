package stringjava.string1;

public class Main {

    public static void main(String[] args) {
        String name = "Mehmet Vahit";
        String eMail = "mehmetvahit@gmail.com";

        String title = new String("Software Architect");
        char[] academicTitleChars = {'M', 'S', 'c', '.'};
        String academicTitle = new String(academicTitleChars);
        System.out.println(title);
        System.out.println(academicTitle);

        String myCountry = "USA";
        String yourCountry = "USA"; 
        System.out.println("myCountry == yourCountry: "+(myCountry == yourCountry));
        
        String myCity = "Denver"; 
        String yourCity = new String("Denver"); 

        System.out.println("myCity == yourCity: "+(myCity == yourCity));
        


    }
}
