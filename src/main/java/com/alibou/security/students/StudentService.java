
package com.alibou.security.students;

import javax.swing.text.html.Option;

import com.alibou.security.students.StudentRepository;

// additional
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class  StudentService {

    private StudentRepository studentRepository;

    public Student createStudent( Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(Long studentId){
        Optional<Student> OptionalStudent =studentRepository.findById(studentId);
        return OptionalStudent.get();
    }

    public List <Student> getAllStudents(){

        return studentRepository.findAll();
    }

   
    
}
