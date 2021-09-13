package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignments 1 Solutions
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "How many people? " );
        int peoplecount = sc.nextInt();
        System.out.print( "How many pizzas do you have? ");
        int pizzacount = sc.nextInt();
        System.out.print( "How many slices per pizza? ");
        int slicecount = sc.nextInt();
        int totalslices = pizzacount * slicecount;
        int sliceperperson = totalslices/peoplecount;
        int leftover = totalslices%peoplecount;
        System.out.println(peoplecount + " people with " + pizzacount + " pizzas (" + totalslices +" slices)");
        System.out.println("Each person gets " + sliceperperson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces. ");
    }
}

