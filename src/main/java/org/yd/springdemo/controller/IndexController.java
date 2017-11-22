package org.yd.springdemo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yd.springdemo.model.SysRole;
import org.yd.springdemo.service.SysRoleService;

@Controller
public class IndexController {

	@Resource
	private SysRoleService sysRoleService;
	
	@RequestMapping(value={"", "/index"})
	public String index(){
		SysRole role = sysRoleService.selectById(1L);
		System.out.println(role);
		return "index";
	}
}
