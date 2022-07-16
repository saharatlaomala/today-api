package com.it.dto;


import java.security.Timestamp;

import lombok.Data;

@Data
public class ProviceDto {
	
    private Integer  pvnid;
	private String pvncode;
	private String pvnnameth;
	private String pvnnameeng;
	private String area;
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;

	
	

}
