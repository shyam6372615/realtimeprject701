package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	   //Entity Queries
       public   List<Customer>  findByCnameEquals(String  name);
       public   List<Customer>  findByCnameIs(String  name);
       public   List<Customer>  getByCname(String  name);
       public  List<Customer>  findByBillamtBetween(float startAmount , float endAmount);
       public  List<Customer>  findByCnameStartsWith(String initialChars);
       public  List<Customer>  findByCnameEndsWith(String lastChars);
       public  List<Customer>  findByCnameContaining(String chars);
       public  List<Customer>  findByCnameContainingIgnoreCase(String chars);
       public  List<Customer>  findByCnameLikeIgnoreCase(String chars);
       
       public  List<Customer>  findByBillamtGreaterThanEqualAndBillamtLessThanEqual(float startAmt , float endAmount);
       public  List<Customer>  findByCaddInIgnoreCaseOrCnameContainingIgnoreCase(List<String> addresses,String nameChars);
       
       
       
       
       
       
       
}
