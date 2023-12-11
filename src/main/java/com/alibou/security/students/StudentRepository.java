package com.alibou.security.students;
import  com.alibou.security.students.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository   extends JpaRepository < Student,Long>{
    
}
