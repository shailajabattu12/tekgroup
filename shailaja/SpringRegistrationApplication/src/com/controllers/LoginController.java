package com.controllers;
import com.form.LoginForm;
import com.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.Map;
import javax.validation.Valid;

@Controller
@RequestMapping("loginform.html")
public class LoginController 
{
	@Autowired
	public LoginService loginService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(Map model)
	{
		LoginForm loginForm=new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result, Map model )
	{
		if(result.hasErrors())
		{
			return "loginform";
		}
		boolean userExists=loginService.checkLogin(loginForm.getName(), loginForm.getPassword());
		if(userExists)
		{
			model.put(loginForm, loginForm);
			return "loginsuccess";
		}
		else
		{
			result.rejectValue("name", "invaliduser");
			return "loginform";
		}
		
		
		
	}

}
