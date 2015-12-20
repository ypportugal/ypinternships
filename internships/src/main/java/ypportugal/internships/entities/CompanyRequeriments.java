package ypportugal.internships.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companyrequeriments")
public class CompanyRequeriments {
	
	
	@Id
	@GeneratedValue
	private int id;
	
	private int companyId;
	
	private String requeriment;

	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getRequeriment() {
		return requeriment;
	}

	public void setRequeriment(String field) {
		this.requeriment = field;
	}

}
