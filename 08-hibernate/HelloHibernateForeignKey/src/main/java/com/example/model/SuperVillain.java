package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SuperVillain")
public class SuperVillain {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="svill_id")
	private int svillId;
	
	@Column(name="name", nullable=false, unique=true)
	private String name;
	
	@Column(name="superpower")
	private String superpower;
	
	@Column(name="bounty")
	private int bounty;
	
	/*
	 * IF FetchType.Lazy then Hibernate will give you a PROXY object initially.
	 * 
	 * Proxy objects are PRETENDING to be the actual data you need, but they are
	 * ACTUALLY empty. BUT if you attempt to access the information that the proxy
	 * is in charge of then the proxy will SECRETLY go back to the DB and get
	 * the information that you need as if it ALWAYS had the information.
	 * 
	 * In short, a proxy object is a placeholder for a future set of information
	 * (similar to a promise)
	 * 
	 * FetchType.Eager then Hibernate will IMMEDIATELY go to teh database
	 * and get this information. No proxy is involved.
	 */
	@ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Crime> crimes;
	
	@ManyToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="Prison_FK")
	private SuperPrison myPrison;
	
	/*
	 * no args constructor, all args constructor
	 * getters/setters
	 * toString()
	 */
	
	public SuperVillain() {
		/*
		 * Hibernate NEEDS this constructor. When hibernate creates versions of YOUR
		 * object it first creates an empty object then uses the setters to load
		 * the information into the object.
		 */
	}
	
	public SuperVillain(String name, String superpower, int bounty, List<Crime> crimes,
			SuperPrison myPrison) {
		super();
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.myPrison = myPrison;
	}

	public SuperVillain(int svillId, String name, String superpower, int bounty, List<Crime> crimes,
			SuperPrison myPrison) {
		super();
		this.svillId = svillId;
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.myPrison = myPrison;
	}

	public int getSvillId() {
		return svillId;
	}

	public void setSvillId(int svillId) {
		this.svillId = svillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperpower() {
		return superpower;
	}

	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	public List<Crime> getCrimes() {
		return crimes;
	}

	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}

	public SuperPrison getMyPrison() {
		return myPrison;
	}

	public void setMyPrison(SuperPrison myPrison) {
		this.myPrison = myPrison;
	}

	@Override
	public String toString() {
		return "\n\tSuperVillain [svillId=" + svillId + ", name=" + name + ", superpower=" + superpower + ", bounty="
				+ bounty + ", crimes=" + crimes + ", myPrison=" + myPrison + "]";
	}
	
	
}
