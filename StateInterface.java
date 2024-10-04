package com.example.demo.maxx;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateInterface extends JpaRepository<StateBean,Integer> {
 
	StateBean getStateBeanBystCode(int stCode);
}
 