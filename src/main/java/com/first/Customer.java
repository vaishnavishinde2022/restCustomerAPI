package com.first;

public class Customer 
{
  private int custId;
  private String custName;
  private String custAddres;
  private String custEmail;
  private String custMobile;
  
  public Customer(int custId, String custName, String custAddres, String custEmail, String custMobile)
  {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddres = custAddres;
		this.custEmail = custEmail;
		this.custMobile = custMobile;
	}//contructore
  
  public Customer()
  {
	super();
	// TODO Auto-generated constructor stub
 }

@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custAddres=" + custAddres + ", custEmail="
			+ custEmail + ", custMobile=" + custMobile + "]";
}

public int getCustId()
  {
	return custId;
 }
public void setCustId(int custId)
{
	this.custId = custId;
}


public String getCustName()
{
	return custName;
}
public void setCustName(String custName) 
{
	this.custName = custName;
}


public String getCustAddres()
{
	return custAddres;
}
public void setCustAddres(String custAddres) 
{
	this.custAddres = custAddres;
}


public String getCustEmail() 
{
	return custEmail;
}
public void setCustEmail(String custEmail) 
{
	this.custEmail = custEmail;
}


public String getCustMobile() 
{
	return custMobile;
}
public void setCustMobile(String custMobile) 
{
	this.custMobile = custMobile;
}


}//Customer
