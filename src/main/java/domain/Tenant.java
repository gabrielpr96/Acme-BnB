
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Tenant extends Actor {

	@JoinColumn(name = "accounts_entity_id")

	private CreditCard creditCard;


	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relationships

	private Collection<Request> requests;


	@OneToMany
	public Collection<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(final Collection<Request> requests) {
		this.requests = requests;

	}

	/*
	 * public void addRequest(final Request request) {
	 * this.Requests.add(request);
	 * request.setCreditCard(null);
	 * request.setEntryDate(null);
	 * request.setExitDate(null);
	 * request.setFee(0);
	 * request.setId(0);
	 * request.setSmoker(true);
	 * request.setStatus(null);
	 * request.setVersion(0);
	 * }
	 *
	 * public void removeRequest(final Request request) {
	 * this.Requests.remove(request);
	 * request.setCreditCard(null);
	 * request.setEntryDate(null);
	 * request.setExitDate(null);
	 * request.setFee(0);
	 * request.setId(0);
	 * request.setSmoker(true);
	 * request.setStatus(null);
	 * request.setVersion(0);
	 * }
	 */
}
