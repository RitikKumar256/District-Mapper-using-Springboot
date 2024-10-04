package com.example.demo.maxx;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RegController {
	@Autowired
	RegBean regBean;
	@Autowired
	LocationDAO locationDAO;
	@Autowired
	RegistrationDAO registrationDAO;
	@Autowired
	ResitDTO resitDTO;
		@RequestMapping(value="open", method=RequestMethod.GET)
	public ModelAndView callJSP() {
		return new ModelAndView("reg","t",regBean);
	}
		@ModelAttribute("ba")
		public List<StateBean> getStateList() {
			List<StateBean> list = locationDAO.getState();
		return list;
		}
		@RequestMapping(value="save",method=RequestMethod.POST)
		public ModelAndView saveData(@ModelAttribute("t")RegBean regBean)
		{
			BeanUtils.copyProperties(regBean,resitDTO);
			String r=registrationDAO.saveDetailByJSP(resitDTO);
			return new ModelAndView("B","p",r);	
		}
		
}

