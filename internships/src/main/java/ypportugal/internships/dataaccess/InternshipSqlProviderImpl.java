package ypportugal.internships.dataaccess;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ypportugal.internships.entities.Internship;
import ypportugal.internships.entities.User;

@Repository
public class InternshipSqlProviderImpl implements InternshipSqlProvider {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Internship> ListAllInternships() {
		return sessionFactory.getCurrentSession().createQuery("from Internship").list();
	}

	@Override
	public Internship getInternship(int id) {
		return (Internship) sessionFactory.getCurrentSession().get(Internship.class, id);
	}

	@Override
	public void CreateInternship(Internship internshipToCreate) {
		sessionFactory.getCurrentSession().save(internshipToCreate);
		
	}

	@Override
	public Boolean isUser(User user) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User where login = :login and password = :password");
		query.setParameter("login", user.getLogin());
		query.setParameter("password", user.getPassword());
		if(query.list().isEmpty()){
			return false;
		}
		return true;
	}
	
}
