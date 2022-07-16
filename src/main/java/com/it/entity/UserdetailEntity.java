package com.it.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_user_detail")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserdetailEntity {
	@Id
	@Column(name = "user_id")
	private Integer  userId;
	
	@Column(name = "user_status")
	private String userstatus;
	
	@Column(name = "user_addrass")
	private String useraddrass;
	
	@Column(name = "user_usernae")
	private String userusernae;
	
	@Column(name = "user_password")
	private String userpassword;
	
	@Column(name = "user_title")
	private String usertitle;
	
	@Column(name = "user_firstname")
	private String userfirstname;
	
	@Column(name = "user_lastname")
	private String userlastname;
	
	@Column(name = "user_gender")
	private String usergender;
	
	@Column(name = "user_phone")
	private String userphone;
	
	@Column(name = "user_email")
	private String useremail;
	
	@Column(name = "zip_code")
	private String zipcode;
	
	@Column(name = "role_id")
	private String roleId;
	
	@Column(name = "record_status")
	private String recordstatus;
	
	@Column(name = "creat_by")
	private String creatby;
	
	@Column(name = "creat_date")
	private Timestamp creatdate;
	
	@Column(name = "update_by")
	private String updateby;
	
	@Column(name = "update_date")
	private Timestamp updatedate;


}
