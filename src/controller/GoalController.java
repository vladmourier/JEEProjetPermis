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

	//TODO Adapt these functions to the Service class
	//TODO Manage errors (error page? Flashbag?)
	
	@RequestMapping(value="addGoal.htm")
	public ModelAndView addGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Goal/add");
	}
	
	@RequestMapping(value="detailsGoal.htm")
	public ModelAndView detailsGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myGoal", aService.detailsGoal(id));
		return new ModelAndView("Goal/details");
	}
	
	@RequestMapping(value="listGoal.htm")
	public ModelAndView listGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//request.setAttribute("myGoals", aService.listGoals());
		return new ModelAndView("Goal/list");
	}
	
	@RequestMapping(value="removeGoal.htm")
	public ModelAndView removeGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myGoal", aService.detailsGoal(id));
		return new ModelAndView("Goal/remove");
	}
	
	
	@RequestMapping(value="createGoal.htm")
	public ModelAndView createGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of a Goal
		//Service aService = new Service();
		//aService.createGoal(GOAL_CREATED);
		return new ModelAndView("Goal/list");
	}
	
	@RequestMapping(value="deleteGoal.htm")
	public ModelAndView deleteGoal(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteGoal(id);
		return new ModelAndView("Goal/list");
	}
	
}
