package com.dam.Entities.Entities;

public class Company {
    private String name;
    private int foundationYear;

    public Company(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }
}
