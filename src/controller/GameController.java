package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class GameController extends MultiActionController {

	
	@RequestMapping(value="addGame.htm")
	public ModelAndView addGame(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Game/add");
	}
	
	@RequestMapping(value="detailsGame.htm")
	public ModelAndView detailsGame(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Game/details");
	}
	
	@RequestMapping(value="listGame.htm")
	public ModelAndView listGame(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Game/list");
	}
	
	@RequestMapping(value="removeGame.htm")
	public ModelAndView removeGame(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Game/remove");
	}
	
}
