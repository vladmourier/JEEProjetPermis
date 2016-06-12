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
	
	@RequestMapping(value="register.htm")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/register");
	}
	
	@RequestMapping(value="login.htm")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/login");
	}
	
	@RequestMapping(value="error.htm")
	public ModelAndView error(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/error");
	}
	
	@RequestMapping(value="contact.htm")
	public ModelAndView contact(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/contact");
	}
	
	@RequestMapping(value="infos.htm")
	public ModelAndView infos(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("General/infos");
	}
	
	@RequestMapping(value="search.htm")
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String search = request.getParameter("search").toLowerCase();
		String htmlResult = "";
		
		if(search.contains("apprenant"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listLearner.htm");
			}
			else
			{
				//learnerService.findAll();
			}
		}
		else if(search.contains("action"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listAction.htm");
			}
			else
			{
				
			}
		}
		else if(search.contains("jeu"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listGame.htm");
			}
			else
			{
				
			}
		}
		else if(search.contains("objectif"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listGoal.htm");
			}
			else
			{
				
			}
		}
		else if(search.contains("indicateur"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listIndicator.htm");
			}
			else
			{
				
			}
		}
		else if(search.contains("mission"))
		{
			if(search.contains("liste"))
			{
				return new ModelAndView("redirect:listMission.htm");
			}
			else
			{
				
			}
		}
		else
		{
			
		}
		
		return new ModelAndView("General/search");
	}
	
}
