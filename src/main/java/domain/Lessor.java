
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Lessor extends Actor {

	private CreditCard creditCard;


	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relationships

	private Collection<Properties> propertieses;


	@OneToMany(mappedBy = "lessor")
	public Collection<Properties> getPropertieses() {
		return this.propertieses;
	}

	public void setPropertieses(final Collection<Properties> propertieses) {
		this.propertieses = propertieses;

	}

	public void addProperties(final Properties propertieses) {
		this.propertieses.add(propertieses);
		propertieses.setAddress(null);
		propertieses.setAddss(null);
		propertieses.setAudits(null);
		propertieses.setCapacity(null);
		propertieses.setCountry(null);
		propertieses.setDescription(null);
		propertieses.setId(0);
		propertieses.setLessor(null);
		propertieses.setName(null);
		propertieses.setProvince(null);
		propertieses.setRate(0);

	}

	public void removeProperties(final Properties propertieses) {
		this.propertieses.remove(propertieses);
		propertieses.setAddress(null);
		propertieses.setAddss(null);
		propertieses.setAudits(null);
		propertieses.setCapacity(null);
		propertieses.setCountry(null);
		propertieses.setDescription(null);
		propertieses.setId(0);
		propertieses.setLessor(null);
		propertieses.setName(null);
		propertieses.setProvince(null);
		propertieses.setRate(0);
	}
}
