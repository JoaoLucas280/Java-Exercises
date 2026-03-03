package Object_Orientation.Static_Members;
import java.util.Scanner;

public class Circle {

    public static final double PI = 3.14;

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double radius = input.nextDouble();

     double c = circumference(radius);
     double v = volume (radius);

        System.out.println(c);
        System.out.println(v);
        System.out.println(PI);
    }
    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }


}
