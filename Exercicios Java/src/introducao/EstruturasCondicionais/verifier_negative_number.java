package introducao.EstruturasCondicionais;
import java.util.Scanner;

public class verifier_negative_number {
    static void main() {
        Scanner input = new Scanner(System.in);
         int num;

        System.out.println("Digite um numero: ");
        num = input.nextInt();

        if (num < 0){
            System.out.println("Este número é negativo! ");
        }else {
            System.out.println("Este número é positivo");
        }

    }
}
