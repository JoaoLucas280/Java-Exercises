package introducao.EstruturasCondicionais;
import java.util.Scanner;

public class game_duration {
    static void main() {
        Scanner input = new Scanner(System.in);
    float start_time, end_time, duration;

        System.out.println("Em que horário o jogo começou? ");
            start_time = input.nextFloat();
        System.out.println("Em que horário o jogo acabou? ");
            end_time = input.nextFloat();

        if (start_time <= end_time) {
            duration = end_time - start_time;
            System.out.println("O jogo teve " + duration + " horas de duração");
        } else if (start_time > end_time) {
            duration = 24 + end_time - start_time;
            System.out.println("O jogo teve " + duration + " horas de duração");

        }
    }
}
