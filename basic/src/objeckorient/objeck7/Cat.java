package objeckorient.objeck7;

public class Cat {
    static String[] catSpecies;
    static int numberOfCats = 0;

    static {
        catSpecies = new String[3];
        catSpecies[0] = "Snowshoe";
        catSpecies[1] = "Polydactyl";
        catSpecies[2] = "Calico";
        System.out.println("catSpecies array were initialized");
    }

    String name;
    char gender;
    String color;
    int age;
    float weight;
    int id;
    float height;
    float length;


   
    public Cat(String catName) {
        name = catName;
    }


    public Cat(String catName, int catAge, char catGender) {
        name = catName;
        age = catAge;
        gender = catGender;
        
    }

    public Cat() {
    }



    public Cat(String name, char gender, String color, int age, float weight) {
       
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;


    }

    
    public Cat(String name, char gender, String color, int age, float weight, float height, float length) {
        
        this(name, gender, color, age, weight);
        
        this.height = height;
        this.length = length;

        
        this.id = ++numberOfCats;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

   
    public void mewMultiple(int numberOfMews) {
        
        for (int i = 0; i < numberOfMews; i++)
            this.mew();
    }

    public void mew() {
        System.out.println(" is mewing");
    }

    public void walk(int numberOfSteps) {
        for (int i = 1; i <= numberOfSteps; i++) {
            System.out.println(name + " is walking. Step is " + i);
        }
    }
}
