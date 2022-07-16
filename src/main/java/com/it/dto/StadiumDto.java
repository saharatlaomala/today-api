package com.it.dto;


import java.security.Timestamp;

import lombok.Data;

@Data
public class StadiumDto {
    private String  stdmId;
	
	private String stdmname;
	
	private Integer stdmstime;
	
	private Integer stdmEtime;
	
	private String stdmdescription;
	
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;

		
	}


