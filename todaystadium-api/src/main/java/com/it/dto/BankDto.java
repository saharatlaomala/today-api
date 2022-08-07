package com.it.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BankDto implements Serializable{
	
	 
	private static final long serialVersionUID = 3130190751040486489L;
	private Integer bankId;
	private String bkFirstname;
	private String bkLastname;
	private String bkAccountname;
	private String bankName;
	private String bkQrcode;
	private String recordStatus;

}
