package stringjava.string2;

public class Main {

    public static void main(String[] args) {
        String myCountry = "USA";
        String yourCountry = "USA"; 
        System.out.println("myCountry == yourCountry: "+(myCountry == yourCountry));
       
        String myCity = "Denver"; 
        String yourCity = new String("Denver"); 

        System.out.println("myCity == yourCity: "+(myCity == yourCity));
       
        String myVillage="Golden Village";
        String yourVillage =new String("Golden Village").intern();
        System.out.println("myVillage==yourVillage: " +(myVillage==yourVillage));

        String myState =new String("Colorado").intern();
        String yourState =new String("Colorado").intern();
        System.out.println("myState==yourState: " +(myState==yourState));

    }
}
