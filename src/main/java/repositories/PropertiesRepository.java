
package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Properties;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, Integer> {

}
