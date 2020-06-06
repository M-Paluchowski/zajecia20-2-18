package examples.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream.of(1, 2, 3, 4, 4, 2, 5, 1)
//                .distinct()
//                .forEach(System.out::println);

        System.out.println("-------------------------");

//        List<Person> personList = List.of(new Person("Marcin", "P"), new Person("Jan", "Kowalski"), new Person("Jan", "Kowalski"));
//        personList.stream()
//                .distinct()
//                .map(Person::getLastName)
//                .forEach(System.out::println);

        System.out.println("-------------------------");

//        Stream.of(1, 2, 3, 4)
//                .peek(System.out::println)
//                .filter(number -> number % 2 == 0)
//                .peek(System.out::println)
//                .map(number -> number * 2)
//                .forEach(System.out::println);

        System.out.println("-------------------------");

//        Stream.of(1, 2, 3, 4, 5)
//                .max(Comparator.naturalOrder())
//                .ifPresent(System.out::println);
//
//        Stream.of(1, 2, 3, 4, 5)
//                .min(Comparator.naturalOrder())
//                .ifPresent(System.out::println);
//
//        Stream.of(new Person("M", "P", 26), new Person("P", "P", 18), new Person("P", "M", 40))
//                .max(Comparator.comparingInt(Person::getAge))
//                .ifPresent(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
//
//        Stream.of(new Person("M", "P", 26), new Person("P", "P", 18), new Person("P", "M", 40))
//                .max(Comparator.comparingInt(Person::getAge))
//                .ifPresent(person -> {
//                    Optional.ofNullable(person.getFirstName())
//                            .ifPresent(firstName -> System.out.println(firstName + " " + person.getLastName()));
//                });
        System.out.println("-------------------------");

//        Person personOne = new Person("M", "P", 26, List.of(new Address("Wroclaw"), new Address("Zgorzelec")));
//        Person personTwo = new Person("P", "P", 18, List.of(new Address("Warszawa")));
//        Person personThree = new Person("Z", "W", 40, List.of(new Address("Gdansk"), new Address("Gdynia")));

//        Stream.of(personOne, personTwo, personThree)
//                .flatMap(person -> person.getAddressList().stream())
//                .map(Address::getCityName)
//                .forEach(System.out::println);

        System.out.println("-------------------------");

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce((first, second) -> first + second)
//                .ifPresent(System.out::println);

//        Integer reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce(5, (first, second) -> first + second);
//        System.out.println(reduce);

//        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce(new BigDecimal(5),
//                        (bigDecimal, integer) -> bigDecimal.add(new BigDecimal(integer)),
//                        (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal));

        // Funkcje muszą być asocjacyjne przy równoległym przetwarzaniu
        // (1 op 2) op 3 op (4 op 5 op 6)
        // (10000 / 100 / 10) / (5 / 2 / 1)
//        Stream.of(10000, 100, 10, 5, 2, 1)
//                .parallel()
//                .reduce((first, second) -> first / second)
//                .ifPresent(System.out::println);

        System.out.println("-------------------------");

//        Stream.of(1, 2, 3, 4, 5, 6, 7)
//            .collect(Collectors.toList());
//        Stream.of(12,3,4)
//                .collect(Collectors.toSet());
//        Stream.of(1, 2, 3, 4)
//                .collect(Collectors.toCollection(ArrayList::new));
//        Stream.of(1, 2, 3, 4, 5)
//                .collect(() -> new HashSet<>(), (set, element) -> set.add(element), (setOne, setTwo) -> setOne.addAll(setTwo));

        System.out.println("-------------------------");

        //Function.identity()
//        IntSummaryStatistics statistics = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
//                .collect(Collectors.summarizingInt(integer -> integer));
//        System.out.println(statistics);

        System.out.println("-------------------------");

//        Person personOne = new Person("A", "P", 26);
//        Person personTwo = new Person("B", "P", 17);
//        Person personThree = new Person("C", "P", 22);
//        Person personFour = new Person("D", "P", 14);
//
//        Map<Boolean, List<Person>> collect = Stream.of(personOne, personTwo, personThree, personFour)
//                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));
//        System.out.println(collect);

        System.out.println("-------------------------");
//
//        Person personOne = new Person("A", "P", 26, new Address("Wroclaw"));
//        Person personTwo = new Person("B", "P", 17, new Address("Warszawa"));
//        Person personThree = new Person("C", "P", 22, new Address("Warszawa"));

//        Map<String, Set<Person>> collect = Stream.of(personOne, personTwo, personThree)
//                .collect(Collectors.groupingBy(person -> person.getHomeAddress().getCityName(), Collectors.toSet()));

//        System.out.println(collect);

        System.out.println("-------------------------");

//        String collect = Stream.of("a", "b", "c", "d")
//                .collect(Collectors.joining("-", "[", "]"));
//        System.out.println(collect);

//        Person personOne = new Person("A", "P", 26, new Address("Wroclaw"));
//        Person personTwo = new Person("B", "P", 17, new Address("Warszawa"));
//        Person personThree = new Person("C", "P", 22, new Address("Warszawa"));
//
//        String collect1 = Stream.of(personOne, personTwo, personThree)
//                .map(person -> person.getHomeAddress().getCityName())
//                .collect(Collectors.joining(";"));
//        System.out.println(collect1);

        System.out.println("-------------------------");

//        Person personOne = new Person("A", "P", 26, new Address("Wroclaw"));
//        Person personTwo = new Person("B", "P", 17, new Address("Warszawa"));
//        Person personThree = new Person("C", "P", 22, new Address("Warszawa"));

//        Map<String, Address> collect = Stream.of(personOne, personTwo, personThree)
//                .collect(Collectors.toMap(person -> person.getFirstName(), person -> person.getHomeAddress(), (first, second) -> first));
//        System.out.println(collect);
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int age;
        private List<Address> addressList;
        private Address homeAddress;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName, String lastName, int age, List<Address> addressList) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.addressList = addressList;
        }

        public Person(String firstName, String lastName, int age, Address homeAddress) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeAddress = homeAddress;
        }

        public Address getHomeAddress() {
            return homeAddress;
        }

        public List<Address> getAddressList() {
            return addressList;
        }

        public int getAge() {
            return age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", addressList=" + addressList +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(firstName, person.firstName) &&
                    Objects.equals(lastName, person.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }
    }

    public static class Address {
        private String cityName;

        public Address(String cityName) {
            this.cityName = cityName;
        }

        public String getCityName() {
            return cityName;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "cityName='" + cityName + '\'' +
                    '}';
        }
    }
}
