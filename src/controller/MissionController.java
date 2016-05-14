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

	//TODO Adapt these functions to the Service class
	//TODO Manage errors (error page? Flashbag?)
	
	@RequestMapping(value="addMission.htm")
	public ModelAndView addMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		return new ModelAndView("Mission/add");
	}
	
	@RequestMapping(value="detailsMission.htm")
	public ModelAndView detailsMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myMission", aService.detailsMission(id));
		return new ModelAndView("Mission/details");
	}
	
	@RequestMapping(value="listMission.htm")
	public ModelAndView listMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//request.setAttribute("myMissions", aService.listMissions());
		return new ModelAndView("Mission/list");
	}
	
	@RequestMapping(value="removeMission.htm")
	public ModelAndView removeMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myMission", aService.detailsMission(id));
		return new ModelAndView("Mission/remove");
	}

	
	
	@RequestMapping(value="createMission.htm")
	public ModelAndView createMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of a Mission
		//Service aService = new Service();
		//aService.createMission(MISSION_CREATED);
		return new ModelAndView("Mission/list");
	}
	
	@RequestMapping(value="deleteMission.htm")
	public ModelAndView deleteMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteMission(id);
		return new ModelAndView("Mission/list");
	}
}
