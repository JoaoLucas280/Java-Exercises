package Object_Orientation.Static_Members.Entities;

public class Circle {
    public static final double PI = 3.14;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
