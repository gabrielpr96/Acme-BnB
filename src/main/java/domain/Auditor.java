
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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


	//Relationships

	private Collection<Audit> audits;


	@OneToMany(mappedBy = "auditor")
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
