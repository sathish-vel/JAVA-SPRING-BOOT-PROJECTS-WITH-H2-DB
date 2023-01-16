package com.SpringProject.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringProject.StudentModel.Student;
import com.SpringProject.StudentService.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		List<Student> liststudents = studentservice.listAll();
		mav.addObject("liststudents", liststudents);
		return mav;
	}

	/*
	 * @RequestMapping("/") public String index(Model model) {
	 * List<Student>liststudent = studentservice.listAll();
	 * model.addAttribute("liststudent",liststudent); return "index"; }
	 */
	@GetMapping("/new")
	public String viewpage(Model model) {
		model.addAttribute("student", new Student());
		return "new";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("student") Student student) {
		studentservice.save(student);
		return "redirect:/";

	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") int id) {
		studentservice.delete(id);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable(name = "id") int id) {
		Student student = studentservice.get(id);
		ModelAndView mav = new ModelAndView("new");
		mav.addObject("student",student);
		return mav;
	}

}
