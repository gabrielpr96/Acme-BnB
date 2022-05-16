
package domain;

import org.hibernate.validator.constraints.NotBlank;

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
