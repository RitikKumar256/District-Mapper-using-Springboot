package com.example.demo.maxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDAO {
	 @Autowired
	 ResitInterface resitInterface;
	 
	 public String saveDetailByJSP(ResitDTO resitDTO)
	 {
		 //ResitDTO d=resitInterface.save(resitDTO);
		 ResitDTO d=resitInterface.saveAndFlush(resitDTO);
		 if(d.getRid()>0)
	 return "success";
	   else
		   return "fail";
	 }

}
