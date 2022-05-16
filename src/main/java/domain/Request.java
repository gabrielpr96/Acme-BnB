
package domain;

import java.util.Date;

import javax.validation.constraints.Min;

public class Request {

	private Date		entryDate;
	private Date		exitDate;
	private boolean		smoker;
	private CreditCard	creditCard;
	private ValueStatus	status;
	private double		fee;


	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(final Date entryDate) {
		this.entryDate = entryDate;
	}

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

}
