package edu.cnm.deepdive;

public class Practice3 {

  static public class Tom {
    private final int age;
    private final double height;
    private final String name;
    private final String gender;
    private final String race;
    boolean married;

    public Tom(int age, double height, String name, String gender, String race) {
      this.age = 25;
      this.height = 6.3;
      this.name = "Tom Drew";
      this.gender = "Male";
      this.race = "Black";
      married = true;
    }

    public int getAge() {
      return age;
    }

    public double getHeight() {
      return height;
    }

    public String getName() {
      return name;
    }

    public String getGender() {
      return gender;
    }

    public String getRace() {
      return race;
    }

    public boolean isMarried() {
      return married;
    }

    public void setMarried(boolean married) {
      this.married = married;
    }
  }

  static public class Lisa {
    private final int age;
    private final double height;
    private final String name;
    private final String gender;
    private final String race;
    boolean married;


    public Lisa(int age, double height, String name, String gender, String race) {
      this.age = 29;
      this.height = 5.4;
      this.name = "Lisa Washington";
      this.gender = "Female";
      this.race = "Black/ Hispanic";
      married = true;
    }

    public int getAge() {
      return age;
    }

    public double getHeight() {
      return height;
    }

    public String getName() {
      return name;
    }

    public String getGender() {
      return gender;
    }

    public String getRace() {
      return race;
    }

    public boolean isMarried() {
      return married;
    }

    public void setMarried(boolean married) {
      this.married = married;
    }
  }

  public static void main(String[] args) {
    System.out.print("Tom's age is ");
    System.out.println(Tom.class.getConstructors());
  }
}
