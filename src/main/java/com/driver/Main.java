package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
       // obj.name = "vartika";
       // System.out.println(obj.name);
        obj.setName("vartika");
        System.out.println(obj.getName());
    }
  
}