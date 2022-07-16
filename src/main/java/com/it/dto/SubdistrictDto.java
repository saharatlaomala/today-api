package com.it.dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class SubdistrictDto {
	private Integer  sdtId;
	
	private String zipcode;
		
	private String sdtnameth;
		
	private Integer disId;
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;



}
