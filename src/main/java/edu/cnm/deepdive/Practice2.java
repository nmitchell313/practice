package edu.cnm.deepdive;

import java.util.Arrays;

public class Practice2 {

  public static void main(String[] args) {
    int myVar1;
    int myVar2;
    int myVar3;
    int myVar4;

    myVar1 = 200;
    myVar2 = Math.multiplyExact(myVar1, 2);
    myVar3 = myVar1 + myVar2;
    myVar4 = (int) Math.sqrt(myVar1);

    System.out.println("Var1 is: " + myVar1);
    System.out.println("Var1 * 2 is: " + myVar2);
    System.out.println("Var1 + Var2 is: " + myVar3);
    System.out.println("The square root of Var1 is: " + myVar4);
  }

}
