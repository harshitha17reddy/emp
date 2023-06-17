package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Employee")
public class Employee 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String ename;
    String emailid;
    int phn;
    
    public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", ename=" + ename + ", emailid=" + emailid + ", phn=" + phn + "]";
	}

	public Employee(int id, String ename, String emailid, int phn) {
		super();
		this.id = id;
		this.ename = ename;
		this.emailid = emailid;
		this.phn = phn;
	}

	

	
    
	
   
}
