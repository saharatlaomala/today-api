package com.it.dto;



import java.security.Timestamp;


import lombok.Data;

@Data
public class BookingsDto {
	
    private Integer  bkId;
    
	private  Timestamp bkdate; 

	private Integer bktime;

	private Integer bketime;

	private String userId;

	private String stdmId;

	private String bkstatus;
	
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;



		
	}


