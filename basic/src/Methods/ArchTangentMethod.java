package Methods;

public class ArchTangentMethod {
    public static void kentang(){
        double degrees = 55.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.cos(radians),Math.toDegrees(Math.atan(Math.sin(radians))));
    }
}
