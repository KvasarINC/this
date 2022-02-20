package com.learning;

import java.util.Scanner;

public class Robots {

    private String name;
    private int hight;
    private boolean warm;

    public Robots(String Name) {
        name = Name;
        System.out.printf("My name is %s \n", this);
    }

    public String toString() {
        return String.format("%s", name);
    }

    public Robots() {
        name = "Yah";
    }

    public Robots(String Name, String n) {
        name = Name;
    }

   public void setName(String name) {
        this.name = name;
    }

  //  public void setHight(int Hight) {
      //  hight = Hight;
    //}

    //public void setWarm(boolean x) {
      //  warm = x;
    //}

    //public String getName() {
      // return name;
    //}

    public void PrintParament() {
        System.out.println("My name is: " + name);
        //System.out.println("My old is: " + hight);
       // System.out.println("Warm: " + warm);
    }
}

