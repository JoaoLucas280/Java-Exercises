package introducao.EstruturasCondicionais;
import java.util.Scanner;

public class numbers_are_multiple {
    static void main() {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero: ");
            num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
            num2 = input.nextInt();

        if (num1 > num2){
            if (num1 % num2 == 0){
                System.out.println("Os números são múltiplos! ");
            }else {
                System.out.println("Os números não são múltiplos");
            }
        }else if (num1 < num2){
            if (num2 % num1 == 0){
                System.out.println("Os números são múltiplos! ");
            }else {
                System.out.println("Os números não são múltiplos");
            }

        }
    }
}
