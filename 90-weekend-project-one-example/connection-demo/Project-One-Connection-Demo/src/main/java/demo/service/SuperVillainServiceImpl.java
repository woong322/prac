package demo.service;

import java.util.List;

import demo.dao.SuperVillainDao;
import demo.dao.SuperVillainDaoImpl;
import demo.model.SuperVillain;

public class SuperVillainServiceImpl implements SuperVillainService {

	SuperVillainDao myDao = new SuperVillainDaoImpl();
	
	@Override
	public List<SuperVillain> getAllVillains() {
		return myDao.selectAllVillains();
	}

	@Override
	public SuperVillain getVillainById(SuperVillain sVill) {
		return myDao.selectVillainById(sVill);
	}

	@Override
	public SuperVillain getVillainByName(SuperVillain sVill) {
		return myDao.selectVillainByName(sVill);
	}

}
