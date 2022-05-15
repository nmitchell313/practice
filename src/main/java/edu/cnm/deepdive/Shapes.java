package edu.cnm.deepdive;

import edu.cnm.deepdive.Chapter7.Triangle;
import edu.cnm.deepdive.Chapter7.TwoDShape;

public class Shapes {

    public static void main(String[] args) {
      Triangle t1 = new Triangle();
      Triangle t2 = new Triangle();

      t1.width = 4.0;
      t1.height = 4.0;
      t1.style = "filled";

      t2.width = 8.0;
      t2.height = 12.0;
      t2.style = "outlined";

      System.out.println("Info for Triangle t1: ");
      t1.showStyle();
      t1.showDim();
      System.out.println("Area is " + t1.area());

      System.out.println();

      System.out.println("Info for Triangle t2: ");
      t2.showStyle();
      t2.showDim();
      System.out.println("Area for t2 is " + t2.area());

    TwoDShape shape = new TwoDShape();
    shape.height = 10;
    shape.width = 20;

    shape.showDim();

    }




}
