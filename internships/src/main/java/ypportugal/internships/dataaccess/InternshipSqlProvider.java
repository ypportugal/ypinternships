package ypportugal.internships.dataaccess;

import java.util.List;

import ypportugal.internships.entities.Internship;
import ypportugal.internships.entities.User;

public interface InternshipSqlProvider {
	public List<Internship> ListAllInternships();
	
	public Internship getInternship(int internshipId);
	
	public void CreateInternship(Internship internshipToCreate);
	
	public Boolean isUser(User user);
}
