package introducao.EstruturasSequenciais;

import java.util.Scanner;

public class working_with_geometry {
    static void main() {
        Scanner input = new Scanner(System.in);

        double A, B, C;
        double areaTriangle, areaCircle, areaTrapezoid, areaSquare, areaRectangle;
        int escolha;

        System.out.println("==============================");
        System.out.println("          ESCOLHA         ");
        System.out.println("==============================");
        System.out.println("0- SAIR DO PROGRAMA ");
        System.out.println("1- ÁREA DO TRIâNGULO RETÂNGULO ");
        System.out.println("2- ÁREA DO CIRCULO");
        System.out.println("3- ÁREA DO TRAPÉZIO");
        System.out.println("4- ÁREA DO QUADRADO");
        System.out.println("5- ÁREA DO RETÂNGULO");
        escolha = input.nextInt();
        System.out.println("-------------------------------");

        switch (escolha) {

            case 1:
                System.out.println("Digite o valor da base: ");
                A = input.nextDouble();
                System.out.println("Digite o valor da altura: ");
                C = input.nextDouble();
                areaTriangle = A * C;
                System.out.println("O valor da área do triângulo retângulo é: " + areaTriangle);
                break;

            case 2:
                System.out.println("Digite o valor do raio: ");
                C = input.nextDouble();
                areaCircle = 3.14159 * (C * C);
                System.out.println("O valor da área do círculo é: " + areaCircle);
                break;

            case 3:
                System.out.println("Digite o valor da base 1: ");
                A = input.nextDouble();
                System.out.println("Digite o valor da base 2: ");
                B = input.nextDouble();
                System.out.println("Digite o valor da altura: ");
                C = input.nextDouble();
                areaTrapezoid = ((A + B) * C) / 2;
                System.out.println("O valor da área do trapézio é: " + areaTrapezoid);
                break;

            case 4:
                System.out.println("Digite o valor do lado do quadrado: ");
                B = input.nextDouble();
                areaSquare = B * B;
                System.out.println("O valor da área do quadrado é: " + areaSquare);
                break;

            case 5:
                System.out.println("Digite o valor da base: ");
                A = input.nextDouble();
                System.out.println("Digite o valor da altura: ");
                B = input.nextDouble();
                areaRectangle = A * B;
                System.out.println("O valor da área do retângulo é: " + areaRectangle);
                break;

            case 0:
                System.out.println("Saindo do prgrama...");
                break;

            default:
                System.out.println("Comando inválido");

        }

        }

    }

