package introducao.EstruturasSequenciais;
import java.util.Scanner;

public class Worker_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     String number;
     int hours_worked;
     float salary_per_hour;
     float salary;
     float salary_per_day;

        System.out.println("Digite o número do funcionário: ");
         number = sc.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
                hours_worked = sc.nextInt();
        System.out.println("Digite seu recebimento por hora: ");
            salary_per_hour = sc.nextFloat();

        salary_per_day = salary_per_hour * hours_worked;
        salary = salary_per_day * 30;

        System.out.println("=====================");
        System.out.println("NÚMERO: " +  number);
        System.out.printf("SALÁRIO: R$ %.2f%n", salary);
        System.out.println("=====================");

    }

}
