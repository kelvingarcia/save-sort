package com.kelvin.savesort.model;

public class PersonDTO {
    private String name;
    private String sortedPersonName;

    public PersonDTO() {
    }

    public PersonDTO(String name, String sortedPersonName) {
        this.name = name;
        this.sortedPersonName = sortedPersonName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortedPersonName() {
        return sortedPersonName;
    }

    public void setSortedPersonName(String sortedPersonName) {
        this.sortedPersonName = sortedPersonName;
    }
}
