package com.SpringProject.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.StudentModel.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
