package ypportugal.internships.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String login;
	
	private String password;
	
	private Integer idCompany;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdCompany() {
		return idCompany;
	}

	public void setIsCompany(Integer idCompany) {
		this.idCompany = idCompany;
	}

}
