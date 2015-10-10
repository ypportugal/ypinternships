package ypportugal.internships.services;

import java.util.List;

import ypportugal.internships.entities.Offer;

public interface OfferService {

	public List<Offer> ListAllAvailableOffers();
	
	public Offer GetOfferDetails(int offerId);
	
	public void CreateNewOffer(Offer offerToAdd);
	
	public void EditOffer(Offer offerToUpdate);
	
	public void DeleteOffer(int offerId);
}
