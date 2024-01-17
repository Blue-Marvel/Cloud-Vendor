package com.springboot.app.model;

/**
 * Student
 */
public class Student {
  private int id;
  private String firstName;
  private String lastName;
  private String matNumber;

  public Student() {
  }

  public Student(int id, String firstName, String lastName, String matNumber) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.matNumber = matNumber;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMatNumber() {
    return matNumber;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setMatNumber(String matNumber) {
    this.matNumber = matNumber;
  }

}