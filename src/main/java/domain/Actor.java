
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public class Actor extends DomainEntity {

	private String	name;
	private String	lastName;
	private String	email;
	private String	phone;
	private String	photo;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@NotBlank
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Pattern(regexp = "^([+-]\\d+\\s+)?(\\([0-9]+\\)\\s+)?([\\d\\w\\s-]+)$")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}


	//Relationships

	private Collection<Comment>	Comments;

	private UserAccount			userAccount;


	@NotNull
	@Valid
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@OneToMany
	public Collection<Comment> getComments() {
		return this.Comments;
	}

	public void setComments(final Collection<Comment> Comments) {
		this.Comments = Comments;

	}

	public void addComment(final Comment comment) {
		this.Comments.add(comment);
		comment.setDate(null);
		comment.setDescription(null);
		comment.setRate(0);
		comment.setId(0);
		comment.setTitle(null);
		comment.setVersion(0);
	}

	public void removeComment(final Comment comment) {
		this.Comments.remove(comment);
		comment.setDate(null);
		comment.setDescription(null);
		comment.setRate(0);
		comment.setId(0);
		comment.setTitle(null);
		comment.setVersion(0);
	}

}
