package by.itacademy;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Student student = new Student("Ivan",35);
        Optional.ofNullable(student)
                .map(Student::getFirstName)
                .ifPresent(System.out::println);
    }
}
