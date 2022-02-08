package edu.cnm.deepdive;

public class GalToLiters {

  public static void main(String[] args) {
    double gallons, liters;
    int counter;

    counter = 0;
    for (gallons = 0; gallons <= 50; gallons++) {
      liters = gallons * 3.7854; // convert to liters.
      System.out.println(gallons + " gallons is " + liters + "liters.");

      counter++;
      // line breaks ever 5 lines.
      if (counter == 5) {
        System.out.println();
        // restart every 5 lines.
        counter = 0;
      }
    }
    char ch;

    ch = 'a';
    for (ch = 0; ch <= 26; ch++) {
      System.out.println(ch);

      if (counter == 5) {
        System.out.println();
        // restart every 5 lines.
        counter = 0;
      }
    }
  }

}
