package com.dam.Entities.Entities;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VideoGame {
    Scanner entrada = new Scanner(System.in);

    String title;
    String genere;
    public int price;

    public VideoGame() {

    }

    public void PedirDatos(){
        try{
            System.out.println("Introduce the title of the game");
            setTitle(entrada.nextLine());
            System.out.println("Introduce the genere of the game");
            setGenere(entrada.nextLine());
            System.out.println("Introduce the price of the game");
            setPrice(entrada.nextInt());
        }catch (ArithmeticException e){
            System.err.println("ERROR");
        }catch (EmptyStackException e){
            System.err.println("ERROR");
        }catch (InputMismatchException e){
            System.err.println("Has introducido texto en vez de un numero");
        }
    }

    public String ToString(){
        return getTitle() + "; " + getGenere() + "; " + getPrice();
    }

    public void ShowGame(){
        System.out.println(ToString());
    }

    public String getTitle() {
        return "Title: " + title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenere() {
        return "Genere: " + genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getPrice() {
        return "Price: " + price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
