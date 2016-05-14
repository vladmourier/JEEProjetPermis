package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class MissionController extends MultiActionController {

	
	@RequestMapping(value="addMission.htm")
	public ModelAndView addMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Mission/add");
	}
	
	@RequestMapping(value="detailsMission.htm")
	public ModelAndView detailsMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Mission/details");
	}
	
	@RequestMapping(value="listMission.htm")
	public ModelAndView listMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Mission/list");
	}
	
	@RequestMapping(value="removeMission.htm")
	public ModelAndView removeMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Mission/remove");
	}
	
}
