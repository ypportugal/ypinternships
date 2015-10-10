package ypportugal.internships.dataaccess;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ypportugal.internships.entities.Offer;

@Repository
public class OfferSqlProviderImpl implements OfferSqlProvider {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Offer> ListAllOffers() {
		return sessionFactory.getCurrentSession().createQuery("from Offer").list();
	}

	@Override
	public Offer GetOffer(int offerId) {
		return (Offer) sessionFactory.getCurrentSession().get(Offer.class, offerId);
	}

	@Override
	public void CreateOffer(Offer offerToCreate) {
		sessionFactory.getCurrentSession().save(offerToCreate);
		
	}
	
}
