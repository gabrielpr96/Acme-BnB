
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Adds extends DomainEntity {

	private String value;


	@NotBlank
	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}


	//Relationships

	private Collection<Properties>	propertieses;
	private Collection<Attribute>	attributes;


	@ManyToMany
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

	@ManyToMany
	public Collection<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(final Collection<Attribute> attributes) {
		this.attributes = attributes;

	}

	public void addAttribute(final Attribute attribute) {
		this.attributes.add(attribute);
		attribute.setId(0);
		attribute.setName(null);
		attribute.setAddss(null);
		attribute.setVersion(0);

	}

	public void removeAttribute(final Attribute attribute) {
		this.attributes.remove(attribute);
		attribute.setId(0);
		attribute.setName(null);
		attribute.setAddss(null);
		attribute.setVersion(0);
	}

}
