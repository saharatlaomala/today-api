package com.it.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_payments")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsEntity {
	@Id
	@Column(name = "pm_payment_id")
	private Integer  pmpaymentId;
	
	@Column(name = "pm_amount")
	private Integer  pmamount;
	
	@Column(name = "pm_payment_amount")
	private Integer  pmpaymentamount;
	
	@Column(name = "pm_received_date")
	private Integer  pmreceiveddate;
	
	@Column(name = "pm_transaction_code")
	private Integer  pmtransactioncode;
	
	@Column(name = "pm_status")
	private Integer  pmstatus;
	
	@Column(name = "user_id")
	private Integer  userId;
	
	@Column(name = "bk_id")
	private Integer  bkId;
	
	@Column(name = "record_status")
	private String recordstatus;
	
	@Column(name = "creat_by")
	private String creatby;
	
	@Column(name = "creat_date")
	private Timestamp creatdate;
	
	@Column(name = "update_by")
	private String updateby;
	
	@Column(name = "update_date")
	private Timestamp updatedate;

	

}
