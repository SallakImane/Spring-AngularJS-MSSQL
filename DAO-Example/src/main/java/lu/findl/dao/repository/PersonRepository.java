package lu.findl.dao.repository;

import org.springframework.data.repository.CrudRepository;

import lu.findl.dao.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

	Person findByName(String name);

}
