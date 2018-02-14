package lu.findl.dao.service;

import java.util.List;

import lu.findl.dao.entity.Person;

public interface IMetier {
	public List<Person> getAllPersons();
	public Person getPersonByName(String name);
	public Person savePerson(Person p);
}
