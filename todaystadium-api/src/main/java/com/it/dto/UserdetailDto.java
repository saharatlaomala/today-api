package com.it.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserdetailDto implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = -9008780183016930456L;
		private Integer userdtId;
		private String userdtUsername;
		private String userdtPassword;
		private String userdtTitle;
		private String userdtFirstname;
		private String userdtLastname;
		private String userdtGender;
		private String userdtAddrass;
		private String userdtPhone;
		private String userdtEmail;
		private String userdtStatus;
		private String zipCode;
		private String roleId;
}
