package com.company;

public class Officer {
    private String name;
    private String surname;
 private int officerID;
    private String workingDistrict;
    private int crimesSolved;

    public static void main(String[] args) {

    }

    public Officer() {
    }

    public Officer(String name, String surname, int officerID, String workingDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict = workingDistrict;
        this.crimesSolved = crimesSolved;
    }
    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }
    public String toString() {
        return getOfficerID() +"@"+Integer.toHexString(hashCode());
    }
}
