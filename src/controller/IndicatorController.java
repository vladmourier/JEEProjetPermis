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

	
	@RequestMapping(value="addIndicator.htm")
	public ModelAndView addIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Indicator/add");
	}
	
	@RequestMapping(value="detailsIndicator.htm")
	public ModelAndView detailsIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Indicator/details");
	}
	
	@RequestMapping(value="listIndicator.htm")
	public ModelAndView listIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Indicator/list");
	}
	
	@RequestMapping(value="removeIndicator.htm")
	public ModelAndView removeIndicator(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Indicator/remove");
	}
	
}
