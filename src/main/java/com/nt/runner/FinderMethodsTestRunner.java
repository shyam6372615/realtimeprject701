package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ICustomerRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private  ICustomerRepository  custRepo;

	@Override
	public void run(String... args) throws Exception {
	   //invoke the runner methods
		/*	custRepo.findByCnameEquals("raja1").forEach(System.out::println);
			System.out.println("_____________________");
			custRepo.findByCnameIs("raja").forEach(System.out::println);*/
		/*System.out.println("_________________________");
		custRepo.getByCname("raja").forEach(System.out::println);
		System.out.println("_________________________");
		
		custRepo.findByBillamtBetween(10000.0f, 1000000.0f).forEach(System.out::println);*/
		
		//custRepo.findByCnameStartsWith("r").forEach(System.out::println);
		//custRepo.findByCnameEndsWith("h").forEach(System.out::println);
		//custRepo.findByCnameContaining("esh").forEach(System.out::println);
		  //custRepo.findByCnameContainingIgnoreCase("a").forEach(System.out::println);
		  //custRepo.findByCnameLikeIgnoreCase("%a%").forEach(System.out::println);
		//custRepo.findByCnameLikeIgnoreCase("%a").forEach(System.out::println);
		//custRepo.findByCnameLikeIgnoreCase("a%").forEach(System.out::println);
		//custRepo.findByCnameLikeIgnoreCase("___").forEach(System.out::println);
		
		
		//custRepo.findByBillamtGreaterThanEqualAndBillamtLessThanEqual(10000.0f, 100000.0f).forEach(System.out::println);
		   custRepo.findByCaddInIgnoreCaseOrCnameContainingIgnoreCase(List.of("hyd", "vizag"), "r").forEach(System.out::println);
	}

}
