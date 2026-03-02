package Object_Orientation.Introduction.Test;

import Object_Orientation.Introduction.Entities.Student;

import java.util.Scanner;

public class Test_Student {

    static void main() {

        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Nome: ");
        student.name = input.nextLine();

        System.out.println("Nota 1: ");
        student.grade1 = input.nextDouble();
        System.out.println("Nota 2: ");
        student.grade2 = input.nextDouble();
        System.out.println("Nota 3: ");
        student.grade3 = input.nextDouble();

        if (student.finalGrade() < 60.0) {
            System.out.println("REPROVADO");
            System.out.println(student.missingPoints() + " pontos para aprovação.");
        } else {
            System.out.println("APROVADO");
            System.out.println("Nota final: " + student.finalGrade());
        }
    }
}
