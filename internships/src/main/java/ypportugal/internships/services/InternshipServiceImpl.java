package ypportugal.internships.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ypportugal.internships.dataaccess.InternshipSqlProvider;
import ypportugal.internships.entities.Internship;
import ypportugal.internships.entities.User;

@Service
@Transactional
public class InternshipServiceImpl implements InternshipService {
	
	@Autowired
	private InternshipSqlProvider internshipSqlProvider;
	
	@Override
	public List<Internship> listAllAvailableInternships() {
		return internshipSqlProvider.ListAllInternships();
	}

	@Override
	public Internship getInternshipDetails(int offerId) {
		return internshipSqlProvider.getInternship(offerId);
	}

	@Override
	public void createNewInternship(Internship offerToAdd) {
		offerToAdd.setPublishDate(new Date());
		offerToAdd.setOfferCompanyId(1); //TEST ONLY
		
		internshipSqlProvider.CreateInternship(offerToAdd);

	}


	@Override
	public void deleteInternship(int internshipId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editInternship(Internship internshipToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean isUser(User user) {
		return internshipSqlProvider.isUser(user);
	}

}
