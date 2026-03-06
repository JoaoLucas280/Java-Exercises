package Object_Orientation.Enumeration.EmployeeProject.Application;

import Object_Orientation.Enumeration.EmployeeProject.Entities.HourContract;
import Object_Orientation.Enumeration.EmployeeProject.Entities.Worker;
import Object_Orientation.Enumeration.EmployeeProject.Entities.department;
import Object_Orientation.Enumeration.EmployeeProject.Entities_enum.WorkerLevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu departamento: ");
        String workerDepartment = sc.nextLine();
        System.out.println("Coloque os dados do funcionário: ");
        System.out.print("Nome: ");
        String workerName = sc.nextLine();
        System.out.print("Nível: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário Base: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new department(workerDepartment));

        System.out.print("Quantos contratos para o funcionário? ");
        int n =  sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o #" + i);
            System.out.print("Data: DD/MM/YYYY");
            Date date = dateFormat.parse(sc.next());
            System.out.print("Valor por hora:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duração (Horas)");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Digite o mês e o ano para calcular a quantidade: (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println();
        System.out.print("NAME: " + worker.getName());
        System.out.println("DEPARTMENTE: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear +  ": " + worker.income(year, month));

    }

}
