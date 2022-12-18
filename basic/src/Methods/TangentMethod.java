package Methods;

public class TangentMethod {
    public static void kentang(){
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The tangent of %.1f degrees is %.4f%n", degrees, Math.tan(radians));
    }
}
