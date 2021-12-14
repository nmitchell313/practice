package edu.cnm.deepdive;

import java.util.Arrays;

public class Practice {

  public static void main(String[] args) {
    int[] data = {1, 3, 4, 12, 5, 9, 10};
    System.out.println(Arrays.toString(data));
    partitionArray(data);
    System.out.println(Arrays.toString(data));
  }

  public static void partitionArray(int[] data) {
    if (data == null) {
      throw new IllegalArgumentException();
    }
    if (data.length > 1) {
      int dividerIndex = -1;
      for (int currentIndex = 0; currentIndex < data.length; currentIndex++) {
        int currentV = data[currentIndex];
        if (currentV % 2 == 0) {
          dividerIndex++;
          if (currentIndex > dividerIndex) {
            data[currentIndex] = data[dividerIndex];
            data[dividerIndex] = currentV;

          }
        }
      }

    }
  }

}
