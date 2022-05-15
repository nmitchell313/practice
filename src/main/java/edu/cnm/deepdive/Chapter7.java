package edu.cnm.deepdive;

public class Chapter7 {

  // A class for 2-dimensional objects.
  static class TwoDShape {
    double width;
    double height;

    void showDim() {
      System.out.println("Width and height are " + width + " and " + height);
    }
  }

  // A subclass of TwoDShape for triangles.
  static class Triangle extends TwoDShape {

    String style;

    double area() {
      return width * height / 2;
    }

    void showStyle() {
      System.out.println("Triangle is " + style);
    }

    TwoDShape shape = new TwoDShape();

  }
}
