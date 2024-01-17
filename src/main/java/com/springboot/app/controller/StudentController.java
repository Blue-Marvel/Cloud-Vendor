package com.springboot.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.model.Student;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/students")
public class StudentController {

  private ArrayList<Student> studentList = new ArrayList<Student>();

  @GetMapping
  public ArrayList<Student> getAllStudents(String param) {

    return studentList;
  }

  @GetMapping("{id}")
  public Student getStudent(@PathVariable int id) {
    return studentList.get(id);
  }

  @PostMapping
  public String postStudent(@RequestBody Student studentDetails) {
    studentList.add(studentDetails);
    return "Successfully Posted";
  }

  @PutMapping("{id}")
  public String putStudetDetails(@PathVariable int id, @RequestBody Student studentDetails) {
    studentList.get(id).setId(studentDetails.getId());
    studentList.get(id).setFirstName(studentDetails.getFirstName());
    studentList.get(id).setLastName(studentDetails.getLastName());
    studentList.get(id).setMatNumber(studentDetails.getMatNumber());
    return "Successfully Updated";
  }

  @DeleteMapping("{id}")
  public String deleteStudentDetails(@PathVariable int id) {
    studentList.remove(id);
    return "Successfully Deleted";

  }

}
