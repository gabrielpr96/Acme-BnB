
package domain;

public class Tenant extends Actor {

	private CreditCard creditCard;


	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}
}
