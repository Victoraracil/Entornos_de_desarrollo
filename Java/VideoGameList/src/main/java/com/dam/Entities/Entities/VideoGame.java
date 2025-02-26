package com.dam.Entities.Entities;

public class VideoGame {
    private String title;
    private String genre;
    private double price;
    private Company company;

    public VideoGame(String title, String genre, double price, Company company) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Price: " + price +
                ", Company: " + company.getName() + " (Founded: " + company.getFoundationYear() + ")";
    }
}

