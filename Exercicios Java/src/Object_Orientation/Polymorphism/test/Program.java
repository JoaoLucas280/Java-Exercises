package Object_Orientation.Polymorphism.test;


import Object_Orientation.Polymorphism.entities.Employee;
import Object_Orientation.Polymorphism.entities.OutsourcedEmployee;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de funcionários: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Seu funcionário é terceirizado? s/n");
            char choice = sc.next().charAt(0);
            System.out.println("Digite os dados do "+ i + "# funcionário:");
            System.out.print("nome: ");
            String name =  sc.next();
            System.out.print("Salário por hora: ");
            double salaryPerHour = sc.nextDouble();
            System.out.print("Horas trabalhadas: ");
            int hours = sc.nextInt();
            if(choice == 's'){
                System.out.print("Digite a despesa adicional: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, salaryPerHour, hours, additionalCharge);
                list.add(emp);
            }else if(choice == 'n'){
                Employee emp = new Employee(name, salaryPerHour, hours);
                list.add(emp);
            }else {
                System.out.println("comando inválido");
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp);
        }


    }
}
