package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import dao.MissionService;

@Controller
public class MissionController extends MultiActionController {

	//TODO Adapt these functions to the Service class
	//TODO Manage errors (error page? Flashbag?)
	
	@RequestMapping(value="addMission.htm")
	public ModelAndView addMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String id = request.getParameter("id");
		MissionService aService = new MissionService();
		if(id != null){
			request.setAttribute("MyMission", aService.find(Integer.parseInt(id)));
		}
		return new ModelAndView("Mission/add");
	}
	
	@RequestMapping(value="addValidateMission.htm")
	public ModelAndView createMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//TODO creation of a Mission
		//Service aService = new Service();
		//aService.createMission(MISSION_CREATED);
		return new ModelAndView("Mission/list");
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
	
	@RequestMapping(value="deleteMission.htm")
	public ModelAndView removeMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//request.setAttribute("myMission", aService.detailsMission(id));
		return new ModelAndView("Mission/remove");
	}

	@RequestMapping(value="deleteValidateMission.htm")
	public ModelAndView deleteMission(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//Service aService = new Service();
		//int id = Integer.parseInt(request.getParameter("id"));
		//aService.deleteMission(id);
		return new ModelAndView("Mission/list");
	}
}
