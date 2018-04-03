package ua.project.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import ua.project.domain.RegisterRequest;
import ua.project.domain.SimpleFilter;
import ua.project.entity.UserDetails;
import ua.project.entity.UserEntity;
import ua.project.mapper.UserMapper;
import ua.project.service.UserService;
import ua.project.service.utils.CustomFileUtils;



@Controller
public class BaseController {

	@Autowired private UserService userService;
	
	@GetMapping({"/", "/home"})
	public String shoHome(Model model) {
		model.addAttribute("userModel", new RegisterRequest());
		return "home";
	}
	@GetMapping("/login")
	public String showLogin() {
		return "home";
	}
	@GetMapping("/register")
	public String showRegister() {
//		model.addAttribute("userModel", new RegisterRequest());
		return "home";
	}
	
	@PostMapping("/register")  
	public ModelAndView saveUser(@Valid @ModelAttribute("userModel") RegisterRequest request,BindingResult result) {
		System.out.println(request.getEmail());
		if(result.hasErrors()){
			
			return new ModelAndView("home", "anchor", "#register");
		}
	
		try {
		userService.saveUser(UserMapper.registerToEntity(request));
		}catch (Exception e) {
			return new ModelAndView("home","error","Opps..Can`t save user."); 
		}
		return new ModelAndView("redirect:/");
		
		
	}
	@GetMapping("/users")
	public String showAllUsers(Model model) throws IOException {
		List<UserEntity>  userEntities = userService.findAllUsers();
		
		for (int i = 0; i < userEntities.size(); i++) {
			UserEntity userEntity = userEntities.get(i);
			String image = CustomFileUtils.getImage("user_"+userEntity.getId(), userEntity.getImagePath());
			userEntities.get(i).setImagePath(image);
		}
		
		
		model.addAttribute("users", userEntities);
		return "user/users";
	}
	
//	public String showAllUsers(
//			@PathVariable("pageNumber") int pageNumber,
//			Model model) throws IOException{
//		List<UserEntity>  userEntities = userService.findAllUsers();
//		for (int i = 0; i < userEntities.size(); i++) {
//			UserEntity userEntity = userEntities.get(i);
//			String image = CustomFileUtils.getImage("user_"+userEntity.getId(), userEntity.getImagePath());
//			userEntities.get(i).setImagePath(image);
//		}
//		Page<UserEntity> page = userService.getPagebleUsers(pageNumber, 20, "ASC", "id");
//		
//		int currentPage = page.getNumber()+1;
//		int begin = Math.max(1, currentPage - 10);
//		int end = Math.min(begin + 10, page.getNumber());
//		
//		model.addAttribute("coursesList",page);
//		model.addAttribute("beginIndex",begin);
//		model.addAttribute("endIndex",end);
//		model.addAttribute("currentIndex",currentPage);
//		model.addAttribute("coursesListByPageSize",page.getContent());
//		model.addAttribute("users", userEntities);
//		return "user/users";
//	}
	

	
	@GetMapping("verify")
	public String verifyUser(@RequestParam("token") String token,
			@RequestParam("userid") String useridStr,
			Model model) {
		
		try {
			int userId = Integer.valueOf(useridStr);
			UserEntity entity  = userService.findUserById(userId);			
			if(entity != null) {
				if(entity.getToken().equals(token)) {
					entity.setToken("");
					entity.setActivated(true);
					
					userService.updateUser(entity);
				}
			}
		}
		catch (Exception e) {
			model.addAttribute("error", "Opps..Verify error");
			return "verify/verify-error";
		}
		
		return "verify/verify-success";
	}
	



}
