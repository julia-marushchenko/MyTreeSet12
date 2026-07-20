/**
 *  Java program to do operations on TreeSet.
 */

package com.mycollections;

import java.util.*;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating d TreeSet instance.
        Set<Double> mySet = new TreeSet<>();

        // Adding elements to mySet.
        mySet.add(2.1);
        mySet.add(3.5);
        mySet.add(1.0);
        mySet.add(6.4);
        mySet.add(9.7);
        mySet.add(8.2);
        mySet.add(6.5);
        mySet.add(2.3);

        // Printing elements of mySet to console.
        System.out.println("Set: " + mySet); // Output: Set: [1.0, 2.1, 2.3, 3.5, 6.4, 6.5, 8.2, 9.7]

        // Size of mySet.
        System.out.println("Size: " + mySet.size()); // Output: Size: 8

        // Remove.
        mySet.remove(2.3);
        mySet.remove(1.0);
        mySet.remove(6.5);
        mySet.remove(9.7);

        // Printing elements of mySet to console.
        System.out.println("Set: " + mySet); // Output: Set: [2.1, 3.5, 6.4, 8.2]

        // Size of mySet.
        System.out.println("Size: " + mySet.size()); // Output: Size: 4

        // Add.
        mySet.add(5.9);
        mySet.add(3.2);

        // Printing elements of mySet to console.
        System.out.println("Set: " + mySet); // Output: Set: [2.1, 3.2, 3.5, 5.9, 6.4, 8.2]

        // Size of mySet.
        System.out.println("Size: " + mySet.size()); // Output: 6

        // Check for an element.
        System.out.println("Set has 6.4 " + mySet.contains(6.4));

        // Check for an element.
        System.out.println("Set has 5.9 " + mySet.contains(5.9));

        // Check for an element.
        System.out.println("Set has 7.9 " + mySet.contains(7.9));

    }
}