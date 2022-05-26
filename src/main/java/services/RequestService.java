
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import domain.Request;
import repositories.RequestRepository;
import security.UserAccountService;

public class RequestService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private RequestRepository	requestRepository;

	// Supporting services ----------------------------------------------------

	@Autowired
	private UserAccountService	userAccountService;


	//Constructors -----------------------------------------------------------

	public RequestService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------

	public Collection<Request> findAll() {
		Collection<Request> result;

		result = this.requestRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Request findOne(final int actorId) {
		Assert.isTrue(actorId != 0);

		Request result;

		result = this.requestRepository.findOne(actorId);
		Assert.notNull(result);

		return result;
	}

	public Request save(final Request actor) {
		Assert.notNull(actor);

		Request result;

		result = this.requestRepository.save(actor);

		return result;
	}

	public void delete(final Request request) {
		Assert.notNull(request);
		Assert.isTrue(request.getId() != 0);
		Assert.isTrue(this.requestRepository.exists(request.getId()));

		this.requestRepository.delete(request);
	}

	// Other business methods -------------------------------------------------

}
