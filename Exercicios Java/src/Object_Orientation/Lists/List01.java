package Object_Orientation.Lists;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List01 {
    static void main() {
        List <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2, 7);


        list.removeIf(integer -> integer < 2);

        for (Integer x : list) {
            System.out.println(x);
        }
        System.out.println(list.size());
        System.out.println("-------------------------------");
        System.out.println(list.indexOf(4));
        Integer number = list.stream().filter(integer -> integer == 4).findFirst().orElse(null);
        System.out.println("number = " + number);
        List <Integer> result = list.stream().filter(y -> y < 5).collect(Collectors.toList());
        System.out.println(result);
    }
}
