package com.it.dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class DmphurDto {
	private Integer  disid;
	private String disCode;
	private String disnameth;
	private String disnameeng;
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;

	}
	

