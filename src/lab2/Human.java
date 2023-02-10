package lab2;

import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    void setHuman(int age, String firstName, String lastName,
                  LocalDate birthDate, int weight){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public char getSecondLetter(){
        char letter = firstName.charAt(1);
        return letter;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}

