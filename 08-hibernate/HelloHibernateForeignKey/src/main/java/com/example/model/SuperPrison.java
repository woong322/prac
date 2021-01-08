package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Super_Prison")
public class SuperPrison {

	@Id
	@Column(name="sprison_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sprisonId;
	
	@Column(name="sprison_name")
	private String sprisonName;
	
	@Column(name="sprison_location")
	private String sprisonLocation;
	
	//"myPrison" refers to a variable from the other object/entity
	@OneToMany(mappedBy="myPrison", fetch=FetchType.EAGER)
	private List<SuperVillain> villList = new ArrayList<>();
	
	public SuperPrison() {
	}
	
	public SuperPrison(String sprisonName, String sprisonLocation) {
		super();
		this.sprisonName = sprisonName;
		this.sprisonLocation = sprisonLocation;
	}

	public SuperPrison(int sprisonId, String sprisonName, String sprisonLocation, List<SuperVillain> villList) {
		super();
		this.sprisonId = sprisonId;
		this.sprisonName = sprisonName;
		this.sprisonLocation = sprisonLocation;
		this.villList = villList;
	}

	public int getSprisonId() {
		return sprisonId;
	}

	public void setSprisonId(int sprisonId) {
		this.sprisonId = sprisonId;
	}

	public String getSprisonName() {
		return sprisonName;
	}

	public void setSprisonName(String sprisonName) {
		this.sprisonName = sprisonName;
	}

	public String getSprisonLocation() {
		return sprisonLocation;
	}

	public void setSprisonLocation(String sprisonLocation) {
		this.sprisonLocation = sprisonLocation;
	}

	public List<SuperVillain> getVillList() {
		return villList;
	}

	public void setVillList(List<SuperVillain> villList) {
		this.villList = villList;
	}

	@Override
	public String toString() {
		return "\n\t\tSuperPrison [sprisonId=" + sprisonId + ", sprisonName=" + sprisonName + ", sprisonLocation="
				+ sprisonLocation + ", villList=" + villList + "]";
	}
}
