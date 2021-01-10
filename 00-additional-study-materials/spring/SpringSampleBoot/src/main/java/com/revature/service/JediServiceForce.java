package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Jedi;
import com.revature.repository.JediRepository;

@Service("jediService")
public class JediServiceForce implements JediService {

	/* Member autowiring: Most used.*/
	@Autowired
	private JediRepository jediRepository;
	
	/* Needs to be provided */
	public JediServiceForce() {
		System.out.println("Instantiating Jedi Service Force Bean.");
	}
	
	/* For constructor injection */
	//@Autowired
	public JediServiceForce(JediRepository jediRepository) {
		System.out.println("Instantiating Jedi Service Force Bean from constructor with parameters.");
		System.out.println("Constructor injection happening.");
		this.jediRepository = jediRepository;
	}
	
	/* For setter injection */
	//@Autowired
	public void setJediRepository(JediRepository jediRepository) {
		System.out.println("Setter injection happening.");
		this.jediRepository = jediRepository;
	}
	
	@Override
	public void register(Jedi jedi) {
		jediRepository.save(jedi);
	}
	
	@Override
	public List<Jedi> getAllJedis() {
		return jediRepository.findAll();
	}

	@Override
	public Jedi getJedi(Jedi jedi) {
		return jediRepository.findByNameLike("%" + jedi.getName() + "%").get(0);
	}
}
