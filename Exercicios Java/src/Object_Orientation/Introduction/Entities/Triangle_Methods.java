package Object_Orientation.Introduction.Entities;

public class Triangle_Methods {

    public double a;
    public double b;
    public double c;

    public double area() {

        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // Creating the method of finding the area of the triangles.
        return result; // or return = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }



}
