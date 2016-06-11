package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class BaseController extends MultiActionController {

	@RequestMapping(value="index.htm")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return index(request, response);
	}
	
	@RequestMapping(value="login.htm")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/login");
	}
	
}
