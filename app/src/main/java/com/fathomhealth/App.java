package com.fathomhealth;

public class App {

  public String getGreeting() {
    return "Hello World! Brian";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
