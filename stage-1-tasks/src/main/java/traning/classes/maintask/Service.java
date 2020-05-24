package traning.classes.maintask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public  class Service {

    public void displayTheListOfCustomersByAssignedRange(Customer [] customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter min cardId range:");
        int min = scanner.nextInt();
        System.out.println("\nEnter max cardId range:");
        int max = scanner.nextInt();
        System.out.println("\nSorted by card diapason:");
        for (Customer m : customers) {
            if (m.getCardId() <= max && m.getCardId() >= min) {
                System.out.println(m);
            }
        }
    }

    public  void sortTheListOfCustomersByName(Customer [] customers){
        Arrays.sort(customers, new Comparator<Customer>() {
            public int compare(Customer a, Customer b) {
                return a.getFullName().compareTo(b.getFullName());
            }
        });
        System.out.println("\nSorted by name:");
        for ( Customer p : customers )
            System.out.println(p);
    }
    }

