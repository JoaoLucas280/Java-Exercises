package Object_Orientation.Introduction.Entities;

public class Rectangle {
     public double height;
     public double width;

     public double area(){
         return height * width;
    }
    public double perimetro(){
         return 2 * (height + width);
    }

    public double diagonal(){
         return (Math.sqrt(Math.pow(height,2) + Math.pow(width,2)) );
    }

    public String toString(){
         return "O valor da área é: "
                 + String.format("%.2f",  area())
                 + "O valor do perímetro é: "
                 + String.format("%.2f",  perimetro())
                 + "O valor da diagonal é: "
                 + String.format("%.2f",  diagonal());

    }





}
