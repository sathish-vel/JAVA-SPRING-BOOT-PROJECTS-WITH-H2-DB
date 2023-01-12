package com.SpringProject.FirstProject1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SpringProject.FirstProject1.DAO.UserDao;
import com.SpringProject.FirstProject1.Model.User1;

@Controller
public class HomeController {
	@Autowired
	UserDao userdao;

	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("adduser")
	public String adduser(User1 user) {
		userdao.save(user);
		return "index.jsp";
	}

	@RequestMapping("getUser")
	public ModelAndView adduser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("display.jsp");
		User1 user = userdao.findById(id).orElse(null);
		mav.addObject("userdetails", user);
		return mav;
	}

	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("delete.jsp");
		User1 user = userdao.findById(id).orElse(null);
		userdao.deleteById(id);
		mav.addObject("userdetails", user);
		return mav;
	}

	@RequestMapping("updateUser")
	public ModelAndView updateUser(User1 user) {
		ModelAndView mav = new ModelAndView("update.jsp");
		user = userdao.findById(user.getId()).orElse(null);
		userdao.deleteById(user.getId());
		mav.addObject("userdetails", user);
		return mav;
	}

}
