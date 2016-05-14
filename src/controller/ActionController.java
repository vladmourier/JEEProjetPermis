package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class ActionController extends MultiActionController {

	
	@RequestMapping(value="addAction.htm")
	public ModelAndView addAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Action/add");
	}
	
	@RequestMapping(value="detailsAction.htm")
	public ModelAndView detailsAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Action/details");
	}
	
	@RequestMapping(value="listAction.htm")
	public ModelAndView listAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Action/list");
	}
	
	@RequestMapping(value="removeAction.htm")
	public ModelAndView removeAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Action/remove");
	}
	
}
