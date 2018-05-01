package com.nubeclick.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nubeclick.pos.dto.Role;
import com.nubeclick.pos.repository.RoleRepository;

@Controller
public class SetupController {

	@Autowired
	RoleRepository roleRepository;

	private Role role = new Role();

	public void saveRole(String roleDescription, int roleLevel) {
		role.setRoleDescription(roleDescription);
		role.setRoleLevel(roleLevel);
		roleRepository.save(role);
	}
}
