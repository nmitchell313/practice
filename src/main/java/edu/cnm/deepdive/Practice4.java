package edu.cnm.deepdive;

import java.io.IOException;

public class Practice4 {

  public static void main(String[] args) throws IOException {

    char ch, answer = 'L';

    System.out.println("Guess a letter between A and Z.");

    ch = (char) System.in.read();

    if (ch == answer) {
      System.out.println("** RIGHT **");
    } else {
      System.out.print("... Sorry... you're ");
    }
    if (ch < answer) {
      System.out.println("too low.");
    } else {
      System.out.println("too high.");
    }
  }


}


