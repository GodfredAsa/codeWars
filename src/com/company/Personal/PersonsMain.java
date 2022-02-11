package com.company.Personal;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

public class PersonsMain {
    public static void main(String[] args) {


        Scanner addressSearch = new Scanner(System.in);
        Scanner nameSearch = new Scanner(System.in);

        try {

            System.out.print("Enter Address: ");
            String getAddress = addressSearch.nextLine();

            System.out.print("Enter name: ");
            String getName = nameSearch.nextLine();


            List<Person> filterByNameAndAddress =
                    getPersons()
                            .stream()
                            .filter(
                                    f -> f.getAddress().contains(getAddress.toUpperCase()) &&
                                    f.getName().contains(getName.toUpperCase()) )
                            .sorted(Comparator.comparing(Person::getName))
                            .collect(Collectors.toList());

            filterByNameAndAddress
                    .stream()
                    .map(person ->  person.getId() + " => " +
                            person.getName() + " " +
                            person.getMobileNumber() + " " +
                            person.getAddress())
                    .forEach(System.out::println);
        }

        catch (InputMismatchException e) {
            System.out.println("Exception: "  + e);
        }


        finally {

            System.out.println("Done ...");
        }



    }


  private static List<Person> getPersons(){
        return List.of(
                new Person(1,"Eben", "BOX 17", "0548670632"),
                new Person(2,"Bernard", "BOX 18", "0544704424"),
                new Person(3,"Caesar", "BOX 20", "0274494472"),
                new Person(4,"Arnold", "BOX 17", "0272827829"),
                new Person(5,"Desmond", "BOX 45", "0204067441"),
                new Person(6,"Aaron", "BOX 17", "0202167201")
        );
    }
}
