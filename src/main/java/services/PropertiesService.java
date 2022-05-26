
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import domain.Properties;
import repositories.PropertiesRepository;
import security.UserAccountService;

public class PropertiesService {
	// Managed repository -----------------------------------------------------

	@Autowired
	private PropertiesRepository	propertiesRepository;

	// Supporting services ----------------------------------------------------

	@Autowired
	private UserAccountService		userAccountService;


	//Constructors -----------------------------------------------------------

	public PropertiesService() {
		super();
	}

	// Simple CRUD methods ----------------------------------------------------

	public Collection<Properties> findAll() {
		Collection<Properties> result;

		result = this.propertiesRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Properties findOne(final int propertiesId) {
		Assert.isTrue(propertiesId != 0);

		Properties result;

		result = this.propertiesRepository.findOne(propertiesId);
		Assert.notNull(result);

		return result;
	}

	public Properties save(final Properties properties) {
		Assert.notNull(properties);

		Properties result;

		result = this.propertiesRepository.save(properties);

		return result;
	}

	public void delete(final Properties properties) {
		Assert.notNull(properties);
		Assert.isTrue(properties.getId() != 0);
		Assert.isTrue(this.propertiesRepository.exists(properties.getId()));

		this.propertiesRepository.delete(properties);
	}

	// Other business methods -------------------------------------------------

}
