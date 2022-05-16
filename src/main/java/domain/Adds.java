
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Adds {

	private String value;


	@NotBlank
	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
