package ypportugal.internships.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ypportugal.internships.entities.Offer;
import ypportugal.internships.services.OfferService;

@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		List<Offer> offers = offerService.ListAllAvailableOffers();
		ModelAndView view = new ModelAndView("home");
		view.addObject("offers",offers);
		return view;
	}
	
	@RequestMapping(value="offer/detail/{offerId}")
	public ModelAndView detail(@PathVariable int offerId) {
		ModelAndView view = new ModelAndView("offer/detail");
		view.addObject("offer",offerService.GetOfferDetails(offerId));
		return view;
	}
	
	@RequestMapping(value="offer/create", method=RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("offer/create");
		view.addObject("offer", new Offer());
		return view;
	}
	
	@RequestMapping(value="offer/create", method=RequestMethod.POST)
	public ModelAndView create(Offer offerToAdd) {
		offerService.CreateNewOffer(offerToAdd);
		ModelAndView view = new ModelAndView("home");
		view.addObject("offers", offerService.ListAllAvailableOffers());
		return view;
	}
}
