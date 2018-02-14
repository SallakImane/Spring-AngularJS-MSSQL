package lu.findl.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import lu.findl.dao.entity.Person;
import lu.findl.dao.repository.PersonRepository;

@Service
public class Metier implements IMetier {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getAllPersons() {
		return Lists.newArrayList(personRepository.findAll());
	}

	@Override
	public Person getPersonByName(String name) {
		return personRepository.findByName(name);
	}

	@Override
	public Person savePerson(Person p) {
		return personRepository.save(p);
	}

}
