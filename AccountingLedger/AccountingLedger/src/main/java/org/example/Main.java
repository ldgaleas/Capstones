package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //we are about to create a global variable
    //scanner is used to get input from the 'user' through console
    public Scanner myScanner;

    //access mod: public
    //non access: static
    public static void main(String[] args) {

        //Datatypes

        // variable syntax: access modifier/ non-access modifier , reference type, variable name
        // = means something is being assigned
        String text = "I am probably the most used datatype"; //String is a special datatype / It;
        // not a primitive dt b/c it's a class but, it's also not a wrapper class because
        //it's not wrapping anything
        //String literal ("") is read as a String Object
        //Note: an object is and instance of a class.
        //And the class is the blueprint for an object

        //primitive dt: they are predefined by the Java language
        // and they store simple values directly in memory

        int num = 1234567890; // a number without a decimal
        float floaty = 1234567890.12345F; //a float is a flating point #; you must add 'F' at
        //the end of the number or the compiler with think it's a double.
        double dub = 1234567890.123456789; // also used for decimals and is the most popular
        //dt for using decimals
        short shortNum = 12345;
        long longNum = 1234567;
        byte byteNum = 127;

        char charVar = 'c'; // a char must be written between single quotes and it can
        //only hold one char at a time
        boolean youLyingOrNah = false; // only holds true or false

        //Wrapper Classes: ALL primitive dt have Wrapper classes
        //They add functionality to our
    }
        static void forLoopConditional(){

            //we are creating a local variables
        // in java local variables exist within a method

        int counter = 5;

        //syntax of a for loop
        //for ( declare a pointer; set the condition; increment or decrement the pointer){
        // implementation logic}

        for(int index = counter; index > 0; index--){
            System.out.println("Count down 'index': " + index);
            System.out.println("Counter value: " + counter);


        }

        }


    }