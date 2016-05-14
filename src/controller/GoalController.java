package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class GoalController extends MultiActionController {

	
	@RequestMapping(value="addGoal.htm")
	public ModelAndView addGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Goal/add");
	}
	
	@RequestMapping(value="detailsGoal.htm")
	public ModelAndView detailsGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Goal/details");
	}
	
	@RequestMapping(value="listGoal.htm")
	public ModelAndView listGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Goal/list");
	}
	
	@RequestMapping(value="removeGoal.htm")
	public ModelAndView removeGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Goal/remove");
	}
	
}
