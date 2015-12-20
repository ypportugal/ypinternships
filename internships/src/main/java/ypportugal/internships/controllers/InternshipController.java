package ypportugal.internships.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ypportugal.internships.entities.Internship;
import ypportugal.internships.services.InternshipService;

@Controller
public class InternshipController {
	
	@Autowired
	private InternshipService internshipService;
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		ModelAndView view = new ModelAndView("home");
		return view;
	}
	
	@RequestMapping(value="login")
	public ModelAndView login(
		@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {
		
		ModelAndView model = new ModelAndView();
		if( error != null){
			model.addObject("error", "Invalid username and password");
		}
		
		if( logout != null){
			model.addObject("msg", "You've been logged out");
		}
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping(value="internship/detail/{internshipId}")
	public ModelAndView detail(@PathVariable int internshipId) {
		ModelAndView view = new ModelAndView("internship/detail");
		view.addObject("internship",internshipService.getInternshipDetails(internshipId));
		return view;
	}
	
	@RequestMapping(value="internship/create", method=RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("internship/create");
		view.addObject("internship", new Internship());
		return view;
	}
	
	@RequestMapping(value="internship/create", method=RequestMethod.POST)
	public ModelAndView create(Internship internshipToAdd) {
		internshipService.createNewInternship(internshipToAdd);
		ModelAndView view = new ModelAndView("home");
		view.addObject("internships", internshipService.listAllAvailableInternships());
		return view;
	}
	
	@RequestMapping(value="internship/list")
	public ModelAndView list() {
		List<Internship> internships = internshipService.listAllAvailableInternships();
		ModelAndView view = new ModelAndView("internship/list");
		view.addObject("internships",internships);
		return view;
	}
}
