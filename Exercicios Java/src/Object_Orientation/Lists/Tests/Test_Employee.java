package Object_Orientation.Lists.Tests;

import Object_Orientation.Lists.Entitites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de funcionários: ");
        int n = sc.nextInt();

        Employee employee = new Employee();
        List<Employee> list = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + ": ");
            System.out.print("Digite o ID: ");
            int ID = sc.nextInt();
            System.out.print("Digite o nome do funcionário: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Digite o salario: ");
            double salary = sc.nextDouble();
            employee = new Employee(name, ID, salary);
            list.add(employee);
        }

        System.out.println("Aumento ou Redução salarial? a/r");
        char choice = sc.next().charAt(0);
        if (choice == 'a') {
            System.out.print("Digite o ID: ");
            int ID = sc.nextInt();
            Employee emp = list.stream().filter(x -> x.getID() == ID).findFirst().orElse(null);
            if (emp != null) {
                System.out.println("Digite a porcengtagem: ");
                double percentage = sc.nextDouble();
                emp.AddSalary(percentage);
            } else {
                System.out.println("ID inválido");
                System.out.println(employee.toString());
            }

        } else if (choice == 'r') {
            System.out.print("Digite o ID: ");
            int ID = sc.nextInt();
            Employee emp = list.stream().filter(x -> x.getID() == ID).findFirst().orElse(null);
            if (emp != null) {
                System.out.println("Digite a porcengtagem: ");
                double percentage = sc.nextDouble();
                emp.ReduceSalary(percentage);
            } else {
                System.out.println("ID inválido");
                System.out.println(employee.toString());
            }


        } else {
            System.out.println("Comando Inválido");
        }
        System.out.println("Lista de funcionários atualizada:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}