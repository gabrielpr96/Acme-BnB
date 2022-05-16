
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Audit {

	private Date	date;
	private String	description;
	private Integer	attachedFiles;
	private boolean	draft;


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

}
