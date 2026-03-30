package files_class;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
    static void main() {

        String[] lines = new String[] {"Olá", "Todos", "Humanos"};
        File path  = new File("c://file//out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
