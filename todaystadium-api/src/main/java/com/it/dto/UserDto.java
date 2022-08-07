package com.it.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -2903573211550606967L;
	
	private Integer userId;
	private Integer roleId;
	private String userName;
	private String passWord;
}
