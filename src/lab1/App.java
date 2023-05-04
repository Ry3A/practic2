package lab1;

/*(10) Имплементировать интерфейс Predicate, определяющий, является ли
        данная строка email-адресом, используя регулярное выражение.*/


import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        String testStr1 = "apl2612@mail.ru";
        String testStr2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        Predicate<String> predicate = (str) -> {
            String emailRegex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(str);

            return matcher.find();
        };

        System.out.println(predicate.test(testStr1));
        System.out.println(predicate.test(testStr2));

        System.out.println("Student{name='Anastasia', lastName='Korolyova', group='IKBO-16-21'}");

    }
}
