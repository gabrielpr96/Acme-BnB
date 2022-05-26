
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Properties extends DomainEntity {

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


	//Relationships

	private Lessor				lessor;
	private Collection<Adds>	addss;
	private Collection<Request>	requests;
	private Collection<Audit>	audits;


	@ManyToOne(optional = false)
	public Lessor getLessor() {
		return this.lessor;
	}

	public void setLessor(final Lessor lessor) {
		this.lessor = lessor;
	}

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

	@OneToMany(mappedBy = "properties")
	public Collection<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(final Collection<Request> requests) {
		this.requests = requests;

	}

	public void addRequest(final Request request) {
		this.requests.add(request);
		request.setCreditCard(null);
		request.setEntryDate(null);
		request.setExitDate(null);
		request.setFee(0);
		request.setId(0);
		request.setSmoker(true);
		request.setStatus(null);
		request.setVersion(0);
	}

	public void removeRequest(final Request request) {
		this.requests.remove(request);
		request.setCreditCard(null);
		request.setEntryDate(null);
		request.setExitDate(null);
		request.setFee(0);
		request.setId(0);
		request.setSmoker(true);
		request.setStatus(null);
		request.setVersion(0);
	}

	@OneToMany(mappedBy = "properties")
	public Collection<Audit> getAudits() {
		return this.audits;
	}

	public void setAudits(final Collection<Audit> audits) {
		this.audits = audits;

	}

	public void addAudit(final Audit audit) {
		this.audits.add(audit);
		audit.setAttachedFiles(null);
		audit.setAuditor(null);
		audit.setDate(null);
		audit.setDescription(null);
		audit.setDraft(true);
		audit.setId(0);
		audit.setProperties(null);
		audit.setVersion(0);
	}

	public void removeAudit(final Audit audit) {
		this.audits.remove(audit);
		audit.setAttachedFiles(null);
		audit.setAuditor(null);
		audit.setDate(null);
		audit.setDescription(null);
		audit.setDraft(true);
		audit.setId(0);
		audit.setProperties(null);
		audit.setVersion(0);
	}
}
