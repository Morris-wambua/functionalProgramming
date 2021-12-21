package DeclarativeProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        List<Person> people= List.of(
                new Person("Morris", Gender.MALE),
                new Person("Purity",Gender.FEMALE),
                new Person("John", Gender.MALE),
                new Person("Alice",Gender.FEMALE)
        );

        //imperative approach
        List<Person> females= new ArrayList<>();

        for (Person person : people){
            boolean femalePredicate = Gender.FEMALE.equals(person.gender);
            if (femalePredicate){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);
        }

        //declarative approach
        people.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .forEach(System.out::println);

    }

    public static class Person{
        private final String firstName;
        private final Gender gender;

        public Person(String firstName, Gender gender) {
            this.firstName = firstName;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
