package com.company;

import java.util.Objects;
import java.util.Scanner;

public class DeffineOfficers {
    public static void main(String[] args) {
        Officer officer1 = new Officer("John", "Smith", 55790, "district99", 18);
        Officer officer2 = new Officer("Teresa", "Shooter", 6497, "district99", 37);
        Officer officer3 = new Officer("Benjamin", "Bond", 76544, "district99", 67);
        Officer officer4 = new Officer();
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        String name4 = input.next();
        officer4.setName(name4);
        System.out.println("surname");
        String surname4 = input.next();
        officer4.setSurname(surname4);
        System.out.println("Officer ID");
        int officerID4 = input.nextInt();
        officer4.setOfficerID(officerID4);
        System.out.println("district");
        String district4 = input.next();
        officer4.setWorkingDistrict(district4);
        System.out.println("Crimes solved");
        int crimesSolved4 = input.nextInt();
        officer4.setCrimesSolved(crimesSolved4);
        System.out.println(officer1);
        System.out.println(officer2);
        System.out.println(officer3);
        System.out.println(officer4);
        Officer[] district99 = {officer1, officer2, officer3, officer4};
        howManyLevel1(district99);
        howManyLevel23(district99);
        isAnyOfficerJohn(district99);
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
        System.out.println("There are " + count + " officers with the level bigger than 1.");
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
}
