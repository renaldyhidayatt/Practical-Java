package objeckorient.objeck1;

public class Cat {
    String name;
    char gender;
    String color;
    int age;
    float weight;

    public void mew() {
        System.out.println(name + " is mewing");
    }

    public void walk(int numberOfSteps) {
        for (int i = 1; i <= numberOfSteps; i++) {
            System.out.println(name + " is walking. Step is " + i);
        }
    }
}
