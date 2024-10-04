package com.example.demo.maxx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDAO {
	@Autowired
	StateInterface stateInterface;

	
	public List<StateBean> getState() {
		List<StateBean> list = stateInterface.findAll();
	 return list;
	}

}
