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

	//TODO Adapt these functions to the Service class
	//TODO Manage errors (error page? Flashbag?)
	
	@RequestMapping(value="addAction.htm")
	public ModelAndView addAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
			return new ModelAndView("Action/add");
	}
	
	@RequestMapping(value="detailsAction.htm")
	public ModelAndView detailsAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myAction", aService.detailsAction(id));
		return new ModelAndView("Action/details");
	}
	
	@RequestMapping(value="listAction.htm")
	public ModelAndView listAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//request.setAttribute("myActions", aService.consultListActions());
		return new ModelAndView("Action/list");
	}
	
	@RequestMapping(value="removeAction.htm")
	public ModelAndView removeAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myAction", aService.detailsAction(id));
		return new ModelAndView("Action/remove");
	}
	
	
	@RequestMapping(value="createAction.htm")
	public ModelAndView createAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of an Action 
		//Service aService = new Service();
		//aService.createAction(ACTION_CREATED);
		return new ModelAndView("Action/list");
	}
	
	@RequestMapping(value="deleteAction.htm")
	public ModelAndView deleteAction(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteAction(id);
		return new ModelAndView("Action/list");
	}
	
}