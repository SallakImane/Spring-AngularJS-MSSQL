package lu.findl.webapi.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lu.findl.dao.entity.Person;
import lu.findl.dao.service.IMetier;
import lu.findl.webapi.helper.Static;

@Component
public class ApplicationModel implements IMetier {

	@Autowired
	private IMetier metier;

	// messages d'erreur
	private List<String> messages;

	@PostConstruct
	public void init() {
		try {
			// Dés le lancement de l'application on test si la connexion est
			// bien etablie avec la base de données, sinon on stock le message
			// d'erreur et on le retourne dans la reponse
			metier.getAllPersons();
		} catch (Exception ex) {
			messages = Static.getErreursForException(ex);
		}
	}

	// getter
	public List<String> getMessages() {
		return messages;
	}

	// ------------------------- interface couche [métier]

	@Override
	public List<Person> getAllPersons() {
		return metier.getAllPersons();
	}

	@Override
	public Person getPersonByName(String name) {
		return metier.getPersonByName(name);
	}

	@Override
	public Person savePerson(Person p) {
		return metier.savePerson(p);
	}

}
