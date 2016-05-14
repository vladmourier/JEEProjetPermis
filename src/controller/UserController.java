package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class UserController extends MultiActionController {

	
	@RequestMapping(value="addUser.htm")
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		return new ModelAndView("User/add");
	}
	
	@RequestMapping(value="detailsUser.htm")
	public ModelAndView detailsUser(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("User/details");
	}
	
	@RequestMapping(value="listUser.htm")
	public ModelAndView listUser(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("User/list");
	}
	
	@RequestMapping(value="removeUser.htm")
	public ModelAndView removeUser(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("User/remove");
	}
	
}
