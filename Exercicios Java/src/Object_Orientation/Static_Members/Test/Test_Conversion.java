package Object_Orientation.Static_Members.Test;
import Object_Orientation.Static_Members.Entities.Conversion;

import java.util.Scanner;
public class Test_Conversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do dólar: ");
        double dolarValue = input.nextDouble();

        System.out.println("Quantos dólares foram comprados? ");
        double quantity = input.nextDouble();

        System.out.println("Você pagará " + Conversion.CurrencyConverter(dolarValue, quantity));

    }
}
