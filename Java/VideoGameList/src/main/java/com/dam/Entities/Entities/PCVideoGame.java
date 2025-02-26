package com.dam.Entities.Entities;

/**
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
 *
 * Also override toString method in VideoGame class so that we can print
 * a video game in the screen with its information
 * by symply calling System.out.println
 */
public class PCVideoGame extends VideoGame {
    private int minimumRAM;
    private int minimumHD;

    public PCVideoGame(String title, String genre, double price, Company company, int minimumRAM, int minimumHD) {
        super(title, genre, price, company);
        this.minimumRAM = minimumRAM;
        this.minimumHD = minimumHD;
    }

    @Override
    public String toString() {
        return super.toString() + ", Minimum RAM: " + minimumRAM + "GB, Minimum HD: " + minimumHD + "GB";
    }
}
