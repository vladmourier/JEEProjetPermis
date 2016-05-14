package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class IndicatorController extends MultiActionController {

	//TODO Adapt these functions to the Service class
	//TODO Manage errors (error page? Flashbag?)
	
	@RequestMapping(value="addIndicator.htm")
	public ModelAndView addIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Indicator/add");
	}
	
	@RequestMapping(value="detailsIndicator.htm")
	public ModelAndView detailsIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myIndicator", aService.detailsIndicator(id));
		return new ModelAndView("Indicator/details");
	}
	
	@RequestMapping(value="listIndicator.htm")
	public ModelAndView listIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//request.setAttribute("myIndicators", aService.listIndicators());
		return new ModelAndView("Indicator/list");
	}
	
	@RequestMapping(value="removeIndicator.htm")
	public ModelAndView removeIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myIndicator", aService.detailsIndicator(id));
		return new ModelAndView("Indicator/remove");
	}
	
	
	@RequestMapping(value="createIndicator.htm")
	public ModelAndView createIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of a Indicator
		//Service aService = new Service();
		//aService.createIndicator(INDICATOR_CREATED);
		return new ModelAndView("Indicator/list");
	}
	
	@RequestMapping(value="deleteIndicator.htm")
	public ModelAndView deleteIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteIndicator(id);
		return new ModelAndView("Indicator/list");
	}
	
}
