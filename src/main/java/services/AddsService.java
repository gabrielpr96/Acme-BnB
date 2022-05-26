
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Adds;
import repositories.AddsRepository;
import security.UserAccountService;

@Service
@Transactional
public class AddsService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private AddsRepository		addsRepository;

	// Supporting services ----------------------------------------------------

	@Autowired
	private UserAccountService	userAccountService;


	//Constructors -----------------------------------------------------------

	public AddsService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------

	public Collection<Adds> findAll() {
		Collection<Adds> result;

		result = this.addsRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Adds findOne(final int addsId) {
		Assert.isTrue(addsId != 0);

		Adds result;

		result = this.addsRepository.findOne(addsId);
		Assert.notNull(result);

		return result;
	}

	public Adds save(final Adds adds) {
		Assert.notNull(adds);

		Adds result;

		result = this.addsRepository.save(adds);

		return result;
	}

	public void delete(final Adds adds) {
		Assert.notNull(adds);
		Assert.isTrue(adds.getId() != 0);
		Assert.isTrue(this.addsRepository.exists(adds.getId()));

		this.addsRepository.delete(adds);
	}

	// Other business methods -------------------------------------------------

}
