package com.it.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.it.utils.TimestampSerializer;

import lombok.Data;

@Data
public class BookingDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1667549084214894519L;

	private Integer bkId;
	
	@JsonSerialize(using = TimestampSerializer.class)
	private Timestamp  bkTime;
	@JsonSerialize(using = TimestampSerializer.class)
	private Timestamp bkEtime;
	private String bkDate;
	private Integer userId;
	 private Integer stdmId;
	 private String bkStatus;

}
