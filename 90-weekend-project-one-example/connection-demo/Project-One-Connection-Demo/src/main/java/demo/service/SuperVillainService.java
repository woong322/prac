package demo.service;

import java.util.List;

import demo.model.SuperVillain;

public interface SuperVillainService {
		
		//READ
		public List<SuperVillain> getAllVillains();
		public SuperVillain getVillainById(SuperVillain sVill);
		public SuperVillain getVillainByName(SuperVillain sVill);
}
