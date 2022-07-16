package com.it.dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class PaymentsDto {
    private Integer  pmpayment;

	private Integer  pmamount;

	private Integer  pmpaymentamount;

	private Integer  pmreceiveddate;

	private Integer  pmtransactioncode;

	private Integer  pmstatus;

	private Integer  userId;

	private Integer  bkId;
	
	private String recordstatus;

	private String creatby;

	private Timestamp creatdate;

	private String updateby;

	private Timestamp updatedate;



}
