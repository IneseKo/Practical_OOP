package com.company;

import java.util.Objects;
import java.util.Scanner;

public class DeffineOfficers {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Smith", 55790, "district99",18);
        Officer officer2 = new Officer("Teresa","Shooter", 6497, "district99",37);
        Officer officer3 = new Officer("Benjamin", "Bond", 76544, "district99", 67);
        System.out.println(officer1);
        System.out.println(officer2);
        System.out.println(officer3);
        Officer[] district99 = {officer1, officer2, officer3};
        howManyLevel1(district99);
        howManyLevel23(district99);
        isAnyOfficerJohn(district99);
newOfficerinTown();
    }

    public static void howManyLevel1(Officer[] district99) {
        int count = 0;
        for (Officer offic : district99) {
            if (offic.calculateLevel() == 1) {
                count++;
            }
        }
        System.out.println("There are " + count + " officers with the level 1.");
    }

    public static void howManyLevel23(Officer[] district99) {
        int count = 0;
        for (Officer offic : district99) {
            if (offic.calculateLevel() > 1) {
                count++;
            }
        }
        System.out.println("There are " + count + " officers with the level larger than 1.");
    }

    public static void isAnyOfficerJohn(Officer[] district99) {
        int count = 0;
        for (Officer offic : district99) {
            if (Objects.equals(offic.getName(), "John")) {
                count++;
            }
        }
        System.out.println("There are " + count + " officers called John.");
    }

    public static void newOfficerinTown() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Officer's name");
        String name = sc.next();
        System.out.println("Surname");
        String surname = sc.next();
        System.out.println("Id");
        int officerID = sc.nextInt();
        System.out.println("district");
        String workingDistrict = sc.next();
        System.out.println("crimes solved");
        int crimesSolved = sc.nextInt();

        Officer officerNew = new Officer(name, surname, officerID,workingDistrict,crimesSolved);
        System.out.println(officerNew);
            }
}
