package ypportugal.internships.dataaccess.entities;

import java.util.List;

public interface OfferSqlProvider {
	public List<Offer> ListAllOffers();
	
	public Offer GetOffer(int offerId);
}
