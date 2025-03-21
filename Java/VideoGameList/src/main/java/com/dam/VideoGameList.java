package com.dam;

import com.dam.Entities.Entities.Company;
import com.dam.Entities.Entities.PCVideoGame;
import com.dam.Entities.Entities.VideoGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Create a program called VideoGameList.java to store objects of
 * a class called VideoGame that you must define. For each videogame,
 * we are going to store its title, genere and price.
 * Add also the corresponding getters, setters and constructor to set these values.
 * Define a main, public class called VideoGameList in the same source file.
 * Then, in the main method of this class, create an array of 5 video games,
 * ask the user to fill de information of each videogame,
 * and then show the title of the cheapest and the most expensive video game of the array
 *
 * Improve exercise VideoGameList.java from previous document in another source file
 * called VideoGameList2.java. Now, every video game has a Company that created it.
 * For every company, we need to store its name and the foundation year.
 * Associate a company to each video game, so that some video games
 * can share the same company object. Then, modify the main application
 * to specify the company information for every videogame (besides video game initial data).
 * Make sure that you share the same Company object among all the video games
 * belonging to the same company.
 *
 * Improve previous exercise VideoGameList2.java in another
 * source file called VideoGameList3.java.
 * Add a new class called PCVideoGame which inherits from VideoGame class.
 * It will have two new attributes called minimumRAM and minimumHD to
 * store the minimum amount of RAM memory and hard disk space required
 * to play the game (both integers). Define the corresponding constructor
 * to set these values (and use super to call parent’s constructor to set
 * the inherited values).
 * Then, add some PC video games to the array and repeat the same steps
 * as in previous exercise.
 * Also override toString method in VideoGame class so that we can print
 * a video game in the screen with its information
 * by symply calling System.out.println
 */
public class VideoGameList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoGame[] games = new VideoGame[5];
        Map<String, Company> companyMap = new HashMap<>();

        // Getting user input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for video game " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Get or create company
            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();
            System.out.print("Company Foundation Year: ");
            int foundationYear = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Company company = companyMap.computeIfAbsent(companyName, k -> new Company(companyName, foundationYear));

            // Check if it's a PC game
            System.out.print("Is this a PC game? (yes/no): ");
            String isPC = scanner.nextLine().trim().toLowerCase();
            if (isPC.equals("yes")) {
                System.out.print("Minimum RAM (GB): ");
                int minRAM = scanner.nextInt();
                System.out.print("Minimum HD (GB): ");
                int minHD = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                games[i] = new PCVideoGame(title, genre, price, company, minRAM, minHD);
            } else {
                games[i] = new VideoGame(title, genre, price, company);
            }
        }

        // Finding the cheapest and most expensive video game
        VideoGame cheapest = games[0];
        VideoGame mostExpensive = games[0];

        for (int i = 1; i < games.length; i++) {
            if (games[i].getPrice() < cheapest.getPrice()) {
                cheapest = games[i];
            }
            if (games[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = games[i];
            }
        }

        // Display results
        System.out.println("\nCheapest Video Game: " + cheapest);
        System.out.println("Most Expensive Video Game: " + mostExpensive);

        scanner.close();
    }
}
