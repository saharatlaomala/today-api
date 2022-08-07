package com.it.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RoleDto implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8501345141603863498L;
	private Integer roleId;
	private String roleName;
	private String roleDes;
	private String roleStatus;
	
	
	

}
