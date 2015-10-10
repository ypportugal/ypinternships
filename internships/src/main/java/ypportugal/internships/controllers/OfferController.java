package ypportugal.internships.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ypportugal.internships.dataaccess.entities.Offer;
import ypportugal.internships.dataaccess.entities.OfferSqlProvider;

@Controller
public class OfferController {
	
	@Autowired
	private OfferSqlProvider offerSqlProvider;
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		List<Offer> offers = offerSqlProvider.ListAllOffers();
		ModelAndView view = new ModelAndView("home");
		view.addObject("offers",offers);
		return view;
	}
	
	@RequestMapping(value="/detail/{offerId}")
	public ModelAndView detail(@PathVariable int offerId) {
		ModelAndView view = new ModelAndView("detail");
		view.addObject("offer",offerSqlProvider.GetOffer(offerId));
		return view;
	}
}
