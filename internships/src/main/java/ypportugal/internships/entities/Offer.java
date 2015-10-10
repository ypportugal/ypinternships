package ypportugal.internships.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offer")
public class Offer {
	
	@Id
	@GeneratedValue
	private int offerId;
	
	private String offerTitle;
	
	private String offerSynopsis;
	
	private Date offerPublishDate;
	
	private Date offerExpireDate;
	
	private int offerCompanyId;
	
	private String offerDetailText;
	
	private String offerApplyEmail;
	
	private String offerResponsiblePersonName;

	/**
	 * @return the offerId
	 */
	public Integer getOfferId() {
		return offerId;
	}

	/**
	 * @param offerId the offerId to set
	 */
	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	/**
	 * @return the offerTitle
	 */
	public String getOfferTitle() {
		return offerTitle;
	}

	/**
	 * @param offerTitle the offerTitle to set
	 */
	public void setOfferTitle(String offerTitle) {
		this.offerTitle = offerTitle;
	}

	/**
	 * @return the offerSynopsis
	 */
	public String getOfferSynopsis() {
		return offerSynopsis;
	}

	/**
	 * @param offerSynopsis the offerSynopsis to set
	 */
	public void setOfferSynopsis(String offerSynopsis) {
		this.offerSynopsis = offerSynopsis;
	}

	/**
	 * @return the offerPublishDate
	 */
	public Date getOfferPublishDate() {
		return offerPublishDate;
	}

	/**
	 * @param offerPublishDate the offerPublishDate to set
	 */
	public void setOfferPublishDate(Date offerPublishDate) {
		this.offerPublishDate = offerPublishDate;
	}

	/**
	 * @return the offerExpireDate
	 */
	public Date getOfferExpireDate() {
		return offerExpireDate;
	}

	/**
	 * @param offerExpireDate the offerExpireDate to set
	 */
	public void setOfferExpireDate(Date offerExpireDate) {
		this.offerExpireDate = offerExpireDate;
	}

	/**
	 * @return the offerCompanyId
	 */
	public int getOfferCompanyId() {
		return offerCompanyId;
	}

	/**
	 * @param offerCompanyId the offerCompanyId to set
	 */
	public void setOfferCompanyId(int offerCompanyId) {
		this.offerCompanyId = offerCompanyId;
	}

	/**
	 * @return the offerDetailText
	 */
	public String getOfferDetailText() {
		return offerDetailText;
	}

	/**
	 * @param offerDetailText the offerDetailText to set
	 */
	public void setOfferDetailText(String offerDetailText) {
		this.offerDetailText = offerDetailText;
	}

	/**
	 * @return the offerApplyEmail
	 */
	public String getOfferApplyEmail() {
		return offerApplyEmail;
	}

	/**
	 * @param offerApplyEmail the offerApplyEmail to set
	 */
	public void setOfferApplyEmail(String offerApplyEmail) {
		this.offerApplyEmail = offerApplyEmail;
	}

	/**
	 * @return the offerResponsiblePersonName
	 */
	public String getOfferResponsiblePersonName() {
		return offerResponsiblePersonName;
	}

	/**
	 * @param offerResponsiblePersonName the offerResponsiblePersonName to set
	 */
	public void setOfferResponsiblePersonName(String offerResponsiblePersonName) {
		this.offerResponsiblePersonName = offerResponsiblePersonName;
	}
	
	


}
