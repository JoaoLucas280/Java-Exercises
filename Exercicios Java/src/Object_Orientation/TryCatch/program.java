package Object_Orientation.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
    static void main() {
        Scanner sc = new Scanner(System.in);
      try {
          String[] vect = sc.nextLine().split(" ");
          int position = sc.nextInt();
          System.out.println(vect[position]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Posição inválida");
      }
      catch (InputMismatchException a) {
          System.out.println("Digito Inválido");

      }

        System.out.println("Fim do programa");
    }
}
