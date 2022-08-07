package com.it.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.it.utils.TimestampSerializer;

import lombok.Data;

@Data
public class StadiumDto implements Serializable{
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7148939435356957639L;
	private Integer stdmId;
	private String stdmName;
	
	@JsonSerialize(using = TimestampSerializer.class)
	private Timestamp stdmStime;
	@JsonSerialize(using = TimestampSerializer.class)
	private Timestamp stdmEtime;
	private String stdmDescription;
	

}
