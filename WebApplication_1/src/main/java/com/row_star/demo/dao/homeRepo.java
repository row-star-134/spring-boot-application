package com.row_star.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.row_star.demo.model.Alien;

public interface homeRepo extends CrudRepository<Alien,Integer>{
	
}
