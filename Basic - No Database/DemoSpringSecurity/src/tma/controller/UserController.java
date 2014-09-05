package tma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user**")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap modelMap) {
		modelMap.addAttribute("message", "This is protected page - User Page!");
		return "user";
	}

}