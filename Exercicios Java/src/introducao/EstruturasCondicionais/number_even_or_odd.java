package introducao.EstruturasCondicionais;
import java.util.Scanner;

public class number_even_or_odd {
    static void main() {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este número é par!");
        }else {
            System.out.println("Este número é ímpar!");
        }
    }

}
