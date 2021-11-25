package com.kelvin.savesort.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
    @Id
    private String id;
    private String name;
    private String sortedPersonName;

    public Person() {
    }

    public Person(String name, String sortedPersonName) {
        this.name = name;
        this.sortedPersonName = sortedPersonName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
