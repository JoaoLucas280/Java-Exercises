package introducao.Vetores;
import java.util.Scanner;
public class Test_01 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        double[] lista = new double[num];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite um valor: ");
            lista[i] = input.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < lista.length; i++) {
            sum += lista[i];
        }
        System.out.println(sum);
        double avg = sum / lista.length;

        System.out.println(avg);



    }
}
