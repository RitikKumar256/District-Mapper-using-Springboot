package com.example.demo.maxx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistrictController {
	@Autowired
	DistInterface distInterface;
  @RequestMapping(value="dist", method=RequestMethod.GET)
	public List<DistBean> getDistList(@RequestParam("stCode") String stCode)
	{
		List<DistBean> list = distInterface.getDistBeanListByStCode(stCode.length()==1?"0"+stCode:stCode);
		return list; 
   
	}
}
