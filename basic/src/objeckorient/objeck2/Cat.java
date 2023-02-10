package objeckorient.objeck2;


public class Cat {

    String name;
    char gender;
    String color;
    int age;
    float weight;

    
    float height;
    float length;


    
    public Cat(String catName){
       name=catName;
    
    }



    public Cat(String catName,int catAge, char catGender){
        name=catName;
        age=catAge;
        gender=catGender;
        
    }

    public Cat(){}


    
    public Cat(String name, char gender, String color, int age, float weight) {
        
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;

    }

    //now we will have a new constructor to initialize new fields with specified values
    public Cat(String name, char gender, String color, int age, float weight, float height, float length) {
       
        this(name, gender, color, age, weight);
        this.height = height;
        this.length = length;


    }

    public void mewMultiple(int numberOfMews) {
        
        for (int i = 0; i < numberOfMews; i++)
            this.mew();
    }

    public void mew() {
        System.out.println(name + " is mewing");
    }

    public void walk(int numberOfSteps) {
        for (int i = 1; i <= numberOfSteps; i++) {
            System.out.println(name + " is walking. Step is " + i);
        }
    }
}

