package edu.cnm.deepdive;

import java.io.IOException;

public class ForLoops2 {

  public static void main(String[] args) throws IOException {

    double nums, sroot, rerr;

    for (nums = 1.0; nums < 100.0; nums++) {
      sroot = Math.sqrt(nums);
      System.out.println("Square root of " + nums + " is " + sroot);

      // rounding error.
      rerr = nums - (sroot * sroot);
      System.out.println("Rounding error is " + rerr);

    }

    for (int i = (int) Math.sqrt(200); i <= 50; i += 10){
      System.out.println(i);
    }

    int x;
    for (x = 100; x > -100; x -= 5) {
      System.out.println(x);
    }

    int i, k;

    for (i = 0, k = 20; i < k; i++, k--){
      System.out.println("i and k: " + i + " " + k);
    }

//    int l;
//
//    System.out.println("Press S to stop.");
//
//    for (l = 0; (char) System.in.read() != 'S'; l++) {
//      System.out.println("Pass #" + l);
//    }

    int a;

    a = 0;
    for (; a < 10; ) {
      System.out.println("Pass #" + a);
      a++;
    }

    int b;
    int sum = 0;

    for (b = 1; b <= 7; sum += b++);

    System.out.println("Sum is " + sum);
  }
}
