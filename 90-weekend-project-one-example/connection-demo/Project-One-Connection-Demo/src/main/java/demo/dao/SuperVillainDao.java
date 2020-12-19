package demo.dao;

import java.util.List;

import demo.model.SuperVillain;

public interface SuperVillainDao {

	//CRUD METHODS
	
	//CREATE
	public void insertVillain(SuperVillain sVill);
	public void insertVillainPower(SuperVillain sVill, String newPower);
	
	//READ
	public List<SuperVillain> selectAllVillains();
	public SuperVillain selectVillainById(SuperVillain sVill);
	public SuperVillain selectVillainByName(SuperVillain sVill);
}
