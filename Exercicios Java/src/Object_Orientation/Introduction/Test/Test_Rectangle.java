package Object_Orientation.Introduction.Test;

import Object_Orientation.Introduction.Entities.Rectangle;

import java.util.Scanner;

public class Test_Rectangle {
    static void main() {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Digite o valor da altura e da largura, respectivamente: ");
        rectangle.height  = input.nextDouble();
        rectangle.width  = input.nextDouble();

        System.out.println(rectangle.toString());
    }
}
