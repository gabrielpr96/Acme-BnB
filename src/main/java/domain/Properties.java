
package domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Properties {

	private String	name;
	private double	rate;
	private String	description;
	private String	address;
	private String	country;
	private String	province;
	private String	state;
	private String	town;
	private Integer	capacity;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Min(value = 0)
	@Digits(fraction = 9, integer = 2)
	public double getRate() {
		return this.rate;
	}

	public void setRate(final double rate) {
		this.rate = rate;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@NotBlank
	public String getCountry() {
		return this.country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	@NotBlank
	public String getProvince() {
		return this.province;
	}

	public void setProvince(final String province) {
		this.province = province;
	}

	@NotBlank
	public String getState() {
		return this.state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	@NotBlank
	public String getTown() {
		return this.town;
	}

	public void setTown(final String town) {
		this.town = town;
	}

	@Min(value = 1)
	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(final Integer capacity) {
		this.capacity = capacity;
	}

}
