package com.it.dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class UserdetailDto {
	private Integer  userId;

	private String userstatus;

	private String useraddrass;

	private String userusernae;

	private String userpassword;

	private String usertitle;

	private String userfirstname;
	
	private String userlastname;

	private String usergender;

	private String userphone;

	private String useremail;

	private String zipcode;

	private String roleId;

	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;


}
