
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Attribute extends DomainEntity {

	private String nameA;


	@NotBlank
	public String getName() {
		return this.nameA;
	}

	public void setName(final String name) {
		this.nameA = name;
	}


	//Relationships

	private Collection<Adds> addss;


	@ManyToMany
	public Collection<Adds> getAddss() {
		return this.addss;
	}

	public void setAddss(final Collection<Adds> addss) {
		this.addss = addss;

	}

	public void addAdds(final Adds adds) {
		this.addss.add(adds);
		adds.setAttributes(null);
		adds.setId(0);
		adds.setPropertieses(null);
		adds.setValue(null);
		adds.setVersion(0);
	}

	public void removeAdds(final Adds adds) {
		this.addss.remove(adds);
		adds.setAttributes(null);
		adds.setId(0);
		adds.setPropertieses(null);
		adds.setValue(null);
		adds.setVersion(0);
	}

}
