package Object_Orientation.Introduction.Test;

import Object_Orientation.Introduction.Entities.Triangle_Methods;

import java.util.Scanner;

public class Test_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    Triangle_Methods x, y;

    x = new Triangle_Methods();
    y = new Triangle_Methods();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area(); //Applying the method to both x and y Triangles

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();


    }
}
