
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Auditor extends Actor {

	private String company;


	@NotBlank
	public String getCompany() {
		return this.company;
	}

	public void setCompany(final String company) {
		this.company = company;
	}
}
