package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.RoleDto;
import com.it.service.RoleService;

@RestController
@RequestMapping("/v1/Roles")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getRoleAll() {
		return ResponseEntity.ok(roleService.findRoleAll());

}
	
	@GetMapping("/{roleId}")
	public ResponseEntity<Object> getRoleByRoleId(@PathVariable(name = "roleId")Integer roleId) {
		return ResponseEntity.ok(roleService.findRoleByRoleId(roleId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveRole(@RequestBody RoleDto roleDto) {
		return ResponseEntity.ok(roleService.saveRole(roleDto));
	}
	@PutMapping("/{roleId}")
	public ResponseEntity<Object> updateRole(
			@PathVariable(name = "roleId") Integer roleId,
			@RequestBody RoleDto roleDto) {
		return ResponseEntity.ok(roleService.updateRoleByRoleId(roleId, roleDto));
	}
	
	@DeleteMapping("/{roleId}") //
	public ResponseEntity<Object> deleteRoleByRoleId(@PathVariable(name = "roleId") Integer roleId){
	return ResponseEntity.ok(roleService.deleteRoleByRoleId(roleId));
}
	
}
