package ypportugal.internships.services;

import java.util.List;

import ypportugal.internships.entities.Internship;
import ypportugal.internships.entities.User;

public interface InternshipService {

	public List<Internship> listAllAvailableInternships();
	
	public Internship getInternshipDetails(int internshipId);
	
	public void createNewInternship(Internship internshipToAdd);
	
	public void editInternship(Internship internshipToUpdate);
	
	public void deleteInternship(int internshipId);
	
	public Boolean isUser(User user);
}
