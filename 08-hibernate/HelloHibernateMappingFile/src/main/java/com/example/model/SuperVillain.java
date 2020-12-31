package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * What is JPA?
 * 	>Java Persistence API
 * 
 * JPA Annotations (Java Persistence API)-
 * Is a standardized API that deals with mapping java objects to DBs.
 * HIbernate implements JPA annotations
 * 
 * We often choose JPA annotations over hibernate annotations because in
 * the future if we want to change ORM framework we don't have to use
 * different annotations. We can simply switch out the framework itself.
 */
//@Entity
//@Table(name="Hibernate_SuperVillain")
public class SuperVillain {

//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="svill_id")
	private int svillId;
	
//	@Column(name="name", nullable=false, unique=true)
	private String name;
	
//	@Column(name="superpower")
	private String superpower;
	
//	@Column(name="bounty")
	private int bounty;
	
	/*
	 * no args constructor, all args constructor
	 * getters/setters
	 * toString()
	 */
	
	public SuperVillain() {
	}
	
	public SuperVillain(String name, String superpower, int bounty) {
		super();
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
	}

	public SuperVillain(int svillId, String name, String superpower, int bounty) {
		super();
		this.svillId = svillId;
		this.name = name;
		this.superpower = superpower;
		this.bounty = bounty;
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

	@Override
	public String toString() {
		return "\n\tSuperVillain [svillId=" + svillId + ", name=" + name + ", superpower=" + superpower + ", bounty="
				+ bounty + "]";
	}
}
