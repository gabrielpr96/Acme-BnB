
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Audit extends DomainEntity {

	private Date	date;
	private String	description;
	private Integer	attachedFiles;
	private boolean	draft;


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Integer getAttachedFiles() {
		return this.attachedFiles;
	}

	public void setAttachedFiles(final Integer attachedFiles) {
		this.attachedFiles = attachedFiles;
	}

	public boolean isDraft() {
		return this.draft;
	}

	public void setDraft(final boolean draft) {
		this.draft = draft;
	}


	//Relationships

	private Properties	properties;
	private Auditor		auditor;


	@ManyToOne(optional = false)
	public Properties getProperties() {
		return this.properties;
	}

	public void setProperties(final Properties properties) {
		this.properties = properties;
	}

	@ManyToOne(optional = false)
	public Auditor getAuditor() {
		return this.auditor;
	}

	public void setAuditor(final Auditor auditor) {
		this.auditor = auditor;
	}

}
