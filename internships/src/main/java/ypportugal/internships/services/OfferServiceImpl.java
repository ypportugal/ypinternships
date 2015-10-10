package ypportugal.internships.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ypportugal.internships.dataaccess.OfferSqlProvider;
import ypportugal.internships.entities.Offer;

@Service
@Transactional
public class OfferServiceImpl implements OfferService {
	
	@Autowired
	private OfferSqlProvider offerSqlProvider;
	
	@Override
	public List<Offer> ListAllAvailableOffers() {
		return offerSqlProvider.ListAllOffers();
	}

	@Override
	public Offer GetOfferDetails(int offerId) {
		return offerSqlProvider.GetOffer(offerId);
	}

	@Override
	public void CreateNewOffer(Offer offerToAdd) {
		offerToAdd.setOfferPublishDate(new Date());
		offerToAdd.setOfferCompanyId(1); //TEST ONLY
		
		offerSqlProvider.CreateOffer(offerToAdd);

	}

	@Override
	public void EditOffer(Offer offerToUpdate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DeleteOffer(int offerId) {
		// TODO Auto-generated method stub

	}

}
