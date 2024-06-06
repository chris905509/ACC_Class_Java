
// Complete the program below.  Use Lambdas and Streams
// to remove all the empty Strings from list and print
// the new stream.

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
//        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
//
//        // Remove all empty Strings from List
//        System.out.printf("%nStrings with more with 1 or more characters:");
//
//                // Your code goes here
//
//                Stream<String> s= strList.stream().filter((x)->x.length()>0);
//
//                s.forEach(System.out::println);
//
//
//        // Find strings that contain the word "done"
//
//        List<String> list = Arrays.asList("Done abc", "", "bcdone", "", "dOne here", "I am not donE, wait", "okay", "Go");
//
//        System.out.println("\nStrings that contain the word \"done\":");
//
//        // Your code goes here
//
//
//        Stream<String> contains=list.stream().filter((str)->str.contains("done"));
//        contains.forEach(System.out::println);


        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("John", "Doe", 51),
                new Person("Jane", "Doe", 45),
                new Person("Michael", "Cain", 68),
                new Person("Dominic", "Cummings", 49),
                new Person("Mary", "Groves", 35),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name

        Stream<Person> stream=people.stream().sorted((a,b)->a.getLastName().compareTo(b.getLastName()));
        stream.forEach(System.out::println);

        // Step 2: Create a method that prints all elements in the list
        Stream<Person> stream2=people.stream();
        stream2.forEach(System.out::println);

        // Step 3: Create a method that prints all people that have last name beginning with C
        Stream<Person> stream3=people.stream().filter((person)->person.getLastName().startsWith("C"));
        stream3.forEach(System.out::println);










    }



    public static class Person
    {
        private String firstName;
        private String lastName;
        private int age;

        public Person(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        public void setLastName(String lastName)
        {
            this.lastName = lastName;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        @Override
        public String toString()
        {
            return "Person [firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + "]";
        }
    }
}


