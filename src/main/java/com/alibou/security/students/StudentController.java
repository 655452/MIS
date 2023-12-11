package com.alibou.security.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

import com.alibou.security.students.Student;

import com.alibou.security.students.StudentService;

import org.springframework.http.HttpStatus;

@RestController
@AllArgsConstructor
@RequestMapping("/api/students")
public class StudentController {
    
    private StudentService studentService;
@PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student saveStudent =studentService.createStudent((student));
        return new ResponseEntity<>(saveStudent,HttpStatus.CREATED);
    }

    @GetMapping
     //http:localhost:8080/api/students/
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList=studentService.getAllStudents();
        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    //  getting specific user
     @GetMapping("{id}")
    //http:localhost:8080/api/students/1
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) {
        Student student=studentService.getStudentById(studentId);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }

}
