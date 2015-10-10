package ypportugal.internships.dataaccess;

import java.util.List;

import ypportugal.internships.entities.Offer;

public interface OfferSqlProvider {
	public List<Offer> ListAllOffers();
	
	public Offer GetOffer(int offerId);
	
	public void CreateOffer(Offer offerToCreate);
}
