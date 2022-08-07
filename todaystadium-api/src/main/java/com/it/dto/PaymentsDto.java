package com.it.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.it.utils.TimestampSerializer;

import lombok.Data;

@Data
public class PaymentsDto implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -3018501195228114732L;
    private Integer pmId;
	private Double pmAmount;
	private String pmPaymentamount;
	
	@JsonSerialize(using = TimestampSerializer.class)
	private Timestamp pmReceiveddate;
	private String pmTransactioncode;
	private String pmStatus;
	private Integer userId;
	private Integer bkId;

}
