package com.codeclan.example.pirateservices;

import com.codeclan.example.pirateservices.models.Pirate;
import com.codeclan.example.pirateservices.repositories.PirateRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateservicesApplicationTests {

	@Autowired //dependency injection. Spring annotation
	PirateRepository pirateRepository; //In Spring we can use the annotation @Autowired on a class property to ask the framework for an instance of a class to be provided as the dependency.

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 30);
		pirateRepository.save(jack);
//		pirateRepository.de;





		// Dependency Injection is where an object is instantiated somewhere else and then given to you; the instance is 'injected' as a dependency.
	}



}
