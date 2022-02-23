package edu.cnm.deepdive;

import java.util.HashMap;

public class HashMaps {

  public static void main(String[] args) {

    HashMap<String, Integer> empId = new HashMap<>();

    empId.put("Yer", 313);
    empId.put("YerYer", 1313);

    System.out.println(empId);

    System.out.println(empId.get("Yer"));

    System.out.println(empId.containsKey("Yer"));

    System.out.println(empId.containsKey("Lis"));

    System.out.println(empId.containsValue(123));

    empId.putIfAbsent("K", 333);
    System.out.println(empId);
    empId.putIfAbsent("Yer", 444);
    System.out.println(empId);
    empId.remove("K");
    System.out.println(empId);
  }

}
