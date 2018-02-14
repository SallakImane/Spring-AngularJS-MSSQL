package lu.findl.dao;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lu.findl.dao.entity.Person;
import lu.findl.dao.service.IMetier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private IMetier metier;
	
	@Test
	public void contextLoads() {
		
		metier.savePerson(new Person("Houssam", new Date(1993, 05, 18)));
		metier.savePerson(new Person("Imane", new Date(1993, 07, 17)));
		metier.savePerson(new Person("Said", new Date(1993, 01, 24)));
		metier.savePerson(new Person("Othmane", new Date(1993, 12, 12)));

		System.out.println(metier.getAllPersons());
		
	}

}
