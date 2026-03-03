package Object_Orientation.Static_Members.Test;
import Object_Orientation.Static_Members.Entities.Circle;

import java.util.Scanner;

public class Test_Circle {

    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double radius = input.nextDouble();

        double c = Circle.circumference(radius);
        double v = Circle.volume (radius);

        System.out.println(c);
        System.out.println(v);
        System.out.println(Circle.PI);
    }



}


