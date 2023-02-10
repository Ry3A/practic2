package lab2;

/*(10) Сортировка по второй букве имени в обратном порядке, фильтрация
        по весу больше, чем 60, сортировка по возрасту, произведение всех возрастов*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class App {

    public static void main(String[] args) {
        List<Human> list = new ArrayList<Human>();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();
        Human human6 = new Human();
        human1.setHuman(19, "Anastasia", "Korolyova", LocalDate.of(2003, 12, 26), 57);
        human2.setHuman(23, "Horson", "VanDeCamp", LocalDate.of(1999, 9, 9), 78);
        human3.setHuman(22, "Tom", "Scavo", LocalDate.of(2000, 6, 9), 74);
        human4.setHuman(21, "Gaby", "Solis", LocalDate.of(2001, 7, 23), 49);
        human5.setHuman(20, "Bri", "VanDeCamp", LocalDate.of(2002, 11, 12), 60);
        human6.setHuman(24, "Linett", "Scavo", LocalDate.of(1998, 4, 11), 62);

        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        list.add(human5);
        list.add(human6);
        //human1.toString();
        System.out.println(list);

        System.out.println("WeightFilter:");
        list.stream()
                .filter(human -> human.weight > 60)
                .forEach(human -> System.out.println(human));

        System.out.println("AgeSorted:");
        list.stream()
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach(human -> System.out.println(human));
        System.out.println("AgeMultiplication:");
        AtomicInteger mul = new AtomicInteger(1);
        list.stream()
                .forEach(human -> mul.set(mul.get() * human.age));
        System.out.println(mul);
        System.out.println("NameSorted:");
        list.stream()
                .sorted(Comparator.comparing(Human::getSecondLetter).reversed())
                .forEach(human -> System.out.println(human));

    }
}
