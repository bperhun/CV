package ua.project.controller;

import java.io.IOException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.project.domain.ImageRequest;
import ua.project.entity.UserEntity;
import ua.project.service.UserService;
import ua.project.service.utils.CustomFileUtils;

@Controller
@SessionAttributes("user")
@RequestMapping("/admin")
public class AdminController {
	@Autowired private UserService userService;
	

	
	@GetMapping("/{userId}/edit")
	public String showEditUserPage(
			@PathVariable("userId") int userId,
			Model model) {
		model.addAttribute("user",userService.findUserById(userId));
		return "admin/edit";
	}
	

	@PostMapping("/{userId}/edit")
	public String saveUser(@ModelAttribute("user") UserEntity entity) {
		
		
		userService.updateUser(entity);
	
		
		return "redirect:/users";
	}


}
