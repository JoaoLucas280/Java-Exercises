package files_class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    static void main() {
        File file = new File("c://file//in.txt");
        Scanner sc = null;

        try {
            sc =  new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if (sc != null){
                sc.close();
            }
        }
    }
}
