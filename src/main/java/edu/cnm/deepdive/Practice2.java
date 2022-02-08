package edu.cnm.deepdive;

import java.util.Arrays;

public class Practice2 {

  public static void main(String[] args) {
    int aa, bb, cc;
    double dd, ee;

    aa = 200;
    bb = Math.multiplyExact(aa, 2);
    cc = aa + bb;
    dd = Math.sqrt(aa);

    System.out.println("Var1 is: " + aa);
    System.out.println("*************");
    System.out.println("Var1 * 2 is: " + bb);
    System.out.println("*************");
    System.out.println("Var1 + Var2 is: " + cc);
    System.out.println("*************");
    System.out.println("The square root of Var1 is: " + dd);
    System.out.println("**************");

    if (10 != 9) {
      System.out.println("Yer");
    }

    if (10 == 9) {
      System.out.println("Yer");
    }

    if (aa < cc) {
      System.out.println(Math.atan2(dd, dd));
      ee = aa * aa;
      System.out.println(ee);
    }
  }

}
