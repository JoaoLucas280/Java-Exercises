package Object_Orientation.Introduction.Test;
import Object_Orientation.Introduction.Entities.Employee;

import java.util.Scanner;

public class Test_Employee {
    static void main() {
        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Nome: ");
        emp.name = input.nextLine();

        System.out.println("Salário Bruto ");
        emp.grossSalary =  input.nextDouble();

        System.out.println("Taxa :");
        emp.tax = input.nextDouble();

        emp.netSalary();

        System.out.println("NOME: " + emp.name + ", Salário Líquido: " + emp.netSalary());

        System.out.println("Porcentagem adicional: ");
        double percentagem = input.nextDouble();
        emp.addSalary(percentagem);
        System.out.println(emp);
    }
}
