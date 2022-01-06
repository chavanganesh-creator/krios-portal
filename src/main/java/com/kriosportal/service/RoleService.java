package com.kriosportal.service;

/**
 * Interface for provide services to Roles
 * 
 * @author Ashwini
 * @date 25/12/2021
 * 
 */

import java.util.List;


import com.kriosportal.bean.RolesBean;
import com.kriosportal.entity.Roles;

public interface RoleService {

	
	public RolesBean fetchRolebyName(String roleName);

	public List<RolesBean> fetchRoleList();
	
	public Roles findByRoleName(String roleName);
}
