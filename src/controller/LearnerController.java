package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class LearnerController extends MultiActionController {

	
	@RequestMapping(value="addLearner.htm")
	public ModelAndView addLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		return new ModelAndView("Learner/add");
	}
	
	@RequestMapping(value="addValidateLearner.htm")
	public ModelAndView createLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of an Learner
		//Service aService = new Service();
		//aService.createLearner(Learner_CREATED);
		return new ModelAndView("Learner/list");
	}
	
	@RequestMapping(value="detailsLearner.htm")
	public ModelAndView detailsLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myLearner", aService.detailsLearner(id));
		return new ModelAndView("Learner/details");
	}
	
	@RequestMapping(value="listLearner.htm")
	public ModelAndView listLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//request.setAttribute("myLearners", aService.listLearners());
		return new ModelAndView("Learner/list");
	}
	
	@RequestMapping(value="deleteeLearner.htm")
	public ModelAndView removeLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myLearner", aService.detailsLearner(id));
		return new ModelAndView("Learner/remove");
	}
	
	@RequestMapping(value="deleteValidateLearner.htm")
	public ModelAndView deleteLearner(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteLearner(id);
		return new ModelAndView("Learner/list");
	}
}
