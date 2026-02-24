package introducao.EstruturasSequenciais;
import java.util.Scanner;

public class Encontrar_a_área_de_um_círculo {
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
