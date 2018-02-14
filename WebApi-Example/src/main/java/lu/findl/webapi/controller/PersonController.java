package lu.findl.webapi.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lu.findl.webapi.model.ApplicationModel;
import lu.findl.webapi.model.Reponse;

@RestController
public class PersonController {

	@Autowired
	private ApplicationModel application;
	private List<String> messages;

	@PostConstruct
	public void init() {
		// messages d'erreur de l'application
		messages = application.getMessages();
	}

	// liste des personnes
	@RequestMapping(value = "/getAllPersons", method = RequestMethod.GET)
	public ResponseEntity<?> getAllMedecins() {
		if (messages != null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Reponse(-1, messages));
		}
		try {
			return ResponseEntity.ok(new Reponse(0, application.getAllPersons()));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Reponse(-2, e.getMessage()));
		}
	}

}
