package com.mtb.ese.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtb.ese.springdi.model.*;
import com.mtb.ese.springdi.repository.CustomerRepository;

@Component
public class SpringDiRunner implements CommandLineRunner
{
	@Autowired
    private CustomerRepository repository;
	
  @Override
    public void run(String... args) throws Exception 
	{
        repository.deleteAll();

        repository.save(new Customer("Ricky", "Henderson", "swipe@gmail.com"));
		repository.save(new Customer("Lou", "Brock", "cardsof@gmail.com"));
		repository.save(new Customer("Kenny", "Lofton", "hofcf@gmail.com"));

        repository.findAll().forEach((customer) -> 
		{
            System.out.println(customer);
        });
    }
	
}
