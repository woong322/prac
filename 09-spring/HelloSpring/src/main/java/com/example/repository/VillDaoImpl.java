package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.SuperVillain;


/*
 * Stereotypes are annotations that tell Spring that THIS class is a Spring Bean and should be treated
 * as such.
 * 
 * There is a hierarchy to these annotations. The ancestor is:    @Component
 * 
 * @Component is used for a basic java objects, especially if the object doesn't fit into the standard design patterns
 * 
 * 
 * There are various types of children stereotypes:
 * 		@Service - service is used for your service layer classes 
 * 		@Repository - is used for your repository/dao layer classes
 * 		@Controller - is used for your controller layer classes
 * 		@Configuration - is used for classes that have functionality to configure spring
 * 			(in short, there is a way to configure spring without relying on the beans.xml)
 * 
 * 
 * 	(@Bean is NOT a stereotype...but it can be used on a method, and Spring will call that method
 * 		then whatever it returns will be made into a spring bean immediately)
 * 
 * 	@RestController
 */
@Component("villDao")
public class VillDaoImpl implements VillDao {

	@Override
	public List<SuperVillain> selectAll() {
		/*
		 * This method is a MOCK Dao Implementation.
		 * Instead of going to the database, the data has been hardcoded.
		 */
		List<SuperVillain> vills = new ArrayList<>();
		
		vills.add(new SuperVillain("Claire", "Transformation", 220_000));
		vills.add(new SuperVillain("Rain Man", "Super Speed", 210_000));
		vills.add(new SuperVillain("Billy", "He can't tell time", 100_000));
		vills.add(new SuperVillain("Hyde", "Skin Armor", 180_000));
		
		return vills;
	}

}
