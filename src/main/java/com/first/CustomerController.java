package com.first;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

//bellow class is a controller class to handle user requests.

public class CustomerController
{
	@Autowired
	CustomerService custobj1;
	
	
	@RequestMapping(value="/cust",method=RequestMethod.GET)
   public String msg()
   {
	   return "Hello customer";
   }
	
	//@RequestMapping(value="/cust",method=RequestMethod.GET)
	/**@GetMapping("/customer")
	public Customer getCustomer()
	{
		Customer cust=new Customer();
		cust.setCustName("Mr.Shinde");
		cust.setCustMobile("9766417175");
		cust.setCustId(1);
		cust.setCustEmail("shinde123@gmail.com");
		cust.setCustAddres("pune");
		
		return cust;
	}**/
	
	//get all Customer
	@GetMapping("/customers")
	
	public ArrayList<Customer> getCustomers()
	{
		ArrayList<Customer> list=custobj1.showCustomers();
		System.out.println(list);
		return list;
		
	}//getCustomers
	
	//get single customer
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id")int id)
	{
		Customer cust1=custobj1.showCustomer(id);
		
		return cust1;
		
	}//getCustomer
	
	//To create new customer
	@PostMapping("/add")
	
	public Customer addCustomer(@RequestBody Customer cust1)
	{
		Customer cust2=custobj1.addCustomer(cust1);
		System.out.println(cust2);
		return cust2;
	}//addCustomer
	
	// To delete customer
	@DeleteMapping("/customer/{custId}")
	
	public String deleteCust(@PathVariable("custId")int custId)
	{
		String msg=custobj1.deleteCustomer(custId);
		return msg;
	}//deleteCust
	
	// To update customer
	@PutMapping("/customer/{id}")
	public String updateCust(@RequestBody Customer cust,@PathVariable("id")int id)
	{
		String msg=custobj1.updateCustomer(cust,id);
		
		return msg;
	}//updateCust
}

