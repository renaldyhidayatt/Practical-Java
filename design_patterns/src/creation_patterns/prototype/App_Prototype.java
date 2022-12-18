package creation_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class App_Prototype {
    public static void kentang() {
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform Task");
        features.add("Shut down");

        Components components = new Components();
        components.setName("Infared Googles");
        components.setFunctionality("Read temperature of objects");

        Robot robot = new Robot(1, features, components);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getID());
        System.out.println(robot.getComponents());
        System.out.println(robot.getFeatures());

        System.out.println(anotherRobot.getID());
        System.out.println(anotherRobot.getComponents());
        System.out.println(anotherRobot.getFeatures());

    }
}
