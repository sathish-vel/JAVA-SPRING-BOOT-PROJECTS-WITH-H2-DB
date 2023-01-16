package com.SpringProject.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProject.StudentModel.Student;
import com.SpringProject.StudentRepository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepo;

	public List<Student> listAll() {
		return studentrepo.findAll();
	}

	public void save(Student student) {
		studentrepo.save(student);
	}

	public void delete(int id) {
		studentrepo.deleteById(id);
	}

	public Student get(int id) {
		return studentrepo.findById(id).get();
	}

}
