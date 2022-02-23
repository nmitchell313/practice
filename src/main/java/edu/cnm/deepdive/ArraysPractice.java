package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {

  public static void main(String[] args) {
    // Create
    String[] friendsArray = {"A", "B", "C", "D", "E", "F"};
    ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("A","B","C","D"));
    // Get element
    System.out.println(friendsArray[1]);
    System.out.println(friendsArrayList2.get(1));
    // Get Length
    System.out.println(friendsArray.length);
    System.out.println(friendsArrayList2.size());
    // Add Element
    // Can't do this with Arrays
    friendsArrayList2.add("E");
    System.out.println(friendsArrayList2);
    // Set element
    friendsArray[0] = "Ant";
    System.out.println(friendsArray[0]);
    friendsArrayList2.set(0, "Ants");
    System.out.println(friendsArrayList2.get(0));
    // Remove
    // Can't do this with array
    friendsArrayList2.remove(1);
    friendsArrayList2.remove("D");
    // Print
    System.out.println(friendsArrayList2);
    System.out.println(friendsArray);


  }

}
