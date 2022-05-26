
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Attribute;
import repositories.AttributeRepository;
import security.UserAccountService;

@Service
@Transactional
public class AttributeService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private AttributeRepository	attributeRepository;

	// Supporting services ----------------------------------------------------

	@Autowired
	private UserAccountService	userAccountService;


	//Constructors -----------------------------------------------------------

	public AttributeService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------

	public Collection<Attribute> findAll() {
		Collection<Attribute> result;

		result = this.attributeRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Attribute findOne(final int attributeId) {
		Assert.isTrue(attributeId != 0);

		Attribute result;

		result = this.attributeRepository.findOne(attributeId);
		Assert.notNull(result);

		return result;
	}

	public Attribute save(final Attribute attribute) {
		Assert.notNull(attribute);

		Attribute result;

		result = this.attributeRepository.save(attribute);

		return result;
	}

	public void delete(final Attribute attribute) {
		Assert.notNull(attribute);
		Assert.isTrue(attribute.getId() != 0);
		Assert.isTrue(this.attributeRepository.exists(attribute.getId()));

		this.attributeRepository.delete(attribute);
	}

	// Other business methods -------------------------------------------------

}
