package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Adds;

@Repository
public interface AddsRepository extends JpaRepository<Adds, Integer>{
	
}
