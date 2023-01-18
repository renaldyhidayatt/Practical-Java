package lame.Methods;

public class ArcSineMethod {
    public static void kentang() {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The arcsine of %.4f is %.4f degrees %n", Math.sin(radians),
                Math.toDegrees(Math.asin(Math.sin(radians))));
    }
}
