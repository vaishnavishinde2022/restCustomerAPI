package com.first;

import java.util.ArrayList;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class CustomerService 
{
   static ArrayList list=new ArrayList();
  
  static
  {
	  list.add(new Customer(1,"sahane","pune","sahane234@gmail.com","985803456"));
	  list.add(new Customer(2,"shinde","mumbai","shinde345@gmail.com","976642345"));
  }
  
  //This method is used to show all customers.
  public ArrayList<Customer> showCustomers()
  {
	  return list;
  }//showCustomers
  
  
  //This method is used to show one customer base on your id
  public Customer showCustomer(int id)
  {
	  Customer cust=null;
	  
	  cust=(Customer) list.stream().filter(e->((Customer) e).getCustId()==id).findFirst().get();
	  
	  return cust;
	  
  }//showCustomer
  
  //This method is used to create customer and add customer in List.
  public Customer addCustomer(Customer cust2)
	{
		list.add(cust2);
		return cust2;
	}//addCustomer
  
  public String deleteCustomer(int id)
  {
	  list=(ArrayList) list.stream().filter(cust->((Customer) cust).getCustId()!=id).collect(Collectors.toList());
	  return "deleted";
  }
  
  //update the customer
  public String updateCustomer(Customer cust,int id)
  {
	  list=(ArrayList) list.stream().map(customer1->{
		  if(((Customer) customer1).getCustId()==id)
		  {
			  ((Customer) customer1).setCustName(cust.getCustName());
			  ((Customer) customer1).setCustAddres(cust.getCustAddres()); 
			  ((Customer) customer1).setCustEmail(cust.getCustEmail());
		  }
		  return customer1;
	  }).collect(Collectors.toList());
	  
	  return "customer updated";
  }
}
