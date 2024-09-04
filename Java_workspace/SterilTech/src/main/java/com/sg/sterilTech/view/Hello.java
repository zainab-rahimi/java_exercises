package com.sg.sterilTech.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello
{
//Test push 2
	@RequestMapping(
		"hello"
	)
	@ResponseBody
	public String sayHello()
	{
		return "Hello tout le monde";
	}

// test again
	@RequestMapping(
		"hello-jsp"
	)
	public String sayHelloJsp()
	{
		return "sayHello";
	}

}
