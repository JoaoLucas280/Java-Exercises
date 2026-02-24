package introducao.EstruturasSequenciais;
import java.util.Scanner;

public class Diferença_produto_entre_quatro_valores {
    static void main() {

        int A, B, C, D;
        int diferenca;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
            A = input.nextInt();
        System.out.println("Digite o valor de B: ");
            B = input.nextInt();
        System.out.println("Digite o valor de C: ");
            C = input.nextInt();
        System.out.println("Digite o valor de D: ");
            D = input.nextInt();

        if ((A*B) > (C*D) ) {

            diferenca = (A*B)-(C*D);
        }else{
            diferenca = (C*D)-(A*B);
        }
        System.out.println("A diferença do produto dos valores é: " + diferenca);
    }
}
