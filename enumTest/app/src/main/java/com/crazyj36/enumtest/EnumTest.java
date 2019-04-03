package com.crazyj36.enumtest;

import com.crazyj36.enumtest.MyEnumeration;

enum MyEnumeration {
     CHOICE_ONE, CHOICE_TWO
   }

public class EnumTest {

  public static void main(String[] args) {
      MyEnumeration one = (MyEnumeration) MyEnumeration.CHOICE_ONE;
      String one_text = one.name();
      System.out.println(one_text);
  }
}
