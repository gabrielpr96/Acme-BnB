
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

@Entity
@Access(AccessType.PROPERTY)
public class Request extends DomainEntity {

	private Date		entryDate;
	private Date		exitDate;
	private boolean		smoker;
	private CreditCard	creditCard;
	private ValueStatus	status;
	private double		fee;


	@Temporal(TemporalType.TIMESTAMP)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(final Date entryDate) {
		this.entryDate = entryDate;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getExitDate() {
		return this.exitDate;
	}

	public void setExitDate(final Date exitDate) {
		this.exitDate = exitDate;
	}

	public boolean isSmoker() {
		return this.smoker;
	}

	public void setSmoker(final boolean smoker) {
		this.smoker = smoker;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	@Enumerated
	public ValueStatus getStatus() {
		return this.status;
	}

	public void setStatus(final ValueStatus status) {
		this.status = status;
	}

	@Min(value = 0)
	public double getFee() {
		return this.fee;
	}

	public void setFee(final double fee) {
		this.fee = fee;
	}


	//Relationships

	private Properties properties;


	@ManyToOne(optional = false)
	public Properties getProperties() {
		return this.properties;
	}

	public void setProperties(final Properties properties) {
		this.properties = properties;
	}

}
