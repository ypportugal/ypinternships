package ypportugal.internships.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ypportugal.internships.dataaccess.entities.Offer;

@Controller
public class OfferController {

	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		List<Offer> offers = new ArrayList<Offer>();
		offers.add(new Offer());
		ModelAndView view = new ModelAndView("home");
		view.addObject("offers",offers);
		return view;
	}
	
	@RequestMapping(value="/detail")
	public ModelAndView detail() {
		return new ModelAndView("detail");
	}
}
