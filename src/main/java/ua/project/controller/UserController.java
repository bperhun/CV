package ua.project.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.project.domain.ImageRequest;
import ua.project.entity.UserDetails;
import ua.project.entity.UserEntity;
import ua.project.mapper.UserMapper;
import ua.project.service.UserService;
import ua.project.service.utils.CustomFileUtils;


@Controller
@RequestMapping({"/user" ,"/admin"})
@SessionAttributes("editUserModel")
public class UserController {
	
	@Autowired private UserService userService;
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	public String showProfile(Model model, Principal principal) throws IOException {
		UserEntity user = userService.findAllInf(principal.getName());
		user.setImagePath(CustomFileUtils.getImage("user_"+user.getId(), user.getImagePath()));
		model.addAttribute("userProfile", UserMapper.entityToUserProfile(user));
		return "user/profile";
		
	}
	

	
	@GetMapping("/profile/image")
	public String uploadImage(Model model) {
		model.addAttribute("uploadModel", new ImageRequest());
		return "user/upload";
	}
	@PostMapping("/profile/image")
	public String saveImage(@ModelAttribute("uploadModel") ImageRequest request,Principal principal) throws IOException {
		UserEntity entity = userService.findUserByEmail(principal.getName());
		entity.setImagePath(request.getFile().getOriginalFilename());
		CustomFileUtils.createImage("user_"+entity.getId(), request.getFile());
		userService.updateUser(entity);
		return "redirect:/user";
	}
	
	@GetMapping("/profile/edit")
	public String editUser(Model model,Principal principal) {
		UserEntity entity = userService.findAllInf(principal.getName());
		
		model.addAttribute("editUserModel", entity);
		
		
		return "user/edit";

	}



	@PostMapping("profile/edit")
	public String saveUser(@ModelAttribute("editUserModel") UserEntity entity) {
		
		
		userService.updateUser(entity);
	
		
		return "redirect:/user";
	}
	
	@GetMapping("/{userId}/users")
	public String showEditUserPage(
			@PathVariable("userId") int userId,
			Model model) {
		model.addAttribute("user",userService.findUserById(userId));
		return "admin/edit";
	}
	
	@GetMapping("/user/users")
	public String deleteUser(Model model,Principal principal) {
		UserEntity entity = userService.findAllInf(principal.getName());
		
		model.addAttribute("user1", entity);
		
		
		return "/users";

	}
	@PostMapping("/users/delete")
	public String deleteUser(@ModelAttribute("user1") UserEntity entity) {
		
		
		userService.deleteUser(entity);
	
	
		
		return "redirect:/users";
	}
	

}