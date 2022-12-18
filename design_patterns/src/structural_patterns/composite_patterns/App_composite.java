package structural_patterns.composite_patterns;

public class App_composite {
    public static void kentang() {
        Human human = new Human();
        human.setName("John");
        human.setDepartment("HR");

        Robot robot = new Robot();
        robot.setName("R2D2");
        robot.setDepartment("Manufacturing");

        WorkManager workManager = new WorkManager();
        workManager.add(human);
        workManager.add(robot);
        System.out.println(workManager);
    }
}
