package Introdução.EstruturasSequenciais;
import java.util.Scanner;

public class Exercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14159F;
        float area;
        float raio;
         System.out.println("Digite o valor do raio: ");
        raio = sc.nextFloat();
            area = (pi * (raio * raio));
        System.out.printf("A área do círculo é %.4f centimetros%n", area);


    }
}
