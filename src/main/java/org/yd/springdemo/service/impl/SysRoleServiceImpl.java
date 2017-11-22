package org.yd.springdemo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yd.springdemo.dao.SysRoleMapper;
import org.yd.springdemo.model.SysRole;
import org.yd.springdemo.service.SysRoleService;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

	@Resource
	private SysRoleMapper sysRoleDao;
	
	@Override
	public SysRole selectById(Long id) {
		// TODO Auto-generated method stub
		return sysRoleDao.selectByPrimaryKey(id);
	}

}
