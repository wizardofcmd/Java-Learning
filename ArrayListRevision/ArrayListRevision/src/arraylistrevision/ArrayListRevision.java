/*
x18393913
29/09/2020
ArrayListRevision.java - Main class
*/
package arraylistrevision;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRevision {
    public static void main(String[] args) {
        // initialize ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        
        // creating variable for user input
        String input = "";
        
        // declaring and instantiating Scanner class
        Scanner sc;
        sc = new Scanner(System.in);
        
        // accepting user input and inserting into ArrayList
        System.out.println("Please enter five String objects into the Array.");
        for(int i=0; i<5; i++){
            input = sc.nextLine();
            arr.add(input);
        }
        
        // printing all elements using toString()
        arr.toString();
        System.out.println(arr + "\n");
        
        // add a String type object in second position
        arr.add(1, "Oedon");
        arr.toString();
        System.out.println(arr + "\n");
        
        // personalised print of ArrayList
        for(int i=0; i<arr.size(); i++){
            System.out.println("Element: " + arr.get(i));
        }
        System.out.println();
        
        // removing element at specified index
        arr.remove(0);
        System.out.println(arr + "\n");
        
        // checking and printing size of the ArrayList
        System.out.println(arr.size() + "\n");
        
        // removing specific String object by referencing value
        arr.remove("Oedon");
        System.out.println(arr + "\n");
        
        // searching specific String object and printing its index position
        System.out.println(arr.indexOf("Ludwig"));
    }
}
