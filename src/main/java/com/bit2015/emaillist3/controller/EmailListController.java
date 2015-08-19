package com.bit2015.emaillist3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bit2015.emaillist3.dao.EmailListDao;
import com.bit2015.emaillist3.vo.EmailListVo;

@Controller
public class EmailListController {
	
	@Autowired
	private EmailListDao emailListDao;
	
	@RequestMapping("/list")
	public String list(Model model){
		
		List<EmailListVo> list = emailListDao.getList();
		model.addAttribute("list", list);
		//model.addAttribute(list); 이렇게 하면 안됨;;;;;
		
		return "index";
		
	}
	
	@RequestMapping("/form")
	public String form(){
		
		return "form_emaillist";
		
	}
	
	@RequestMapping("/add")
	public String insert(@ModelAttribute EmailListVo emailListVo ){
		
		emailListDao.insert(emailListVo);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/delete/{no}")	
	public String delete(@PathVariable("no") long no ){
		emailListDao.delete(no);
		return "redirect:/list";
	}

}
