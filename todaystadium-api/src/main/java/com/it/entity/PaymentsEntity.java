package com.it.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="tb_payments")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsEntity implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2703389620814898370L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  
	@Column(name = "pm_id")
	private Integer pmId;
	
	@Column(name = "pm_amount")
	private Double pmAmount;
	
	@Column(name = "pm_payment_amount")
	private String pmPaymentamount;
	
	@Column(name = "pm_received_date")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" )
	private Timestamp pmReceiveddate;
	
	@Column(name = "pm_transaction_code")
	private String pmTransactioncode;
	
	@Column(name = "pm_status")
	private String pmStatus;
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "bk_id")
	private Integer bkId;
	
	 @Column(name="record_status")
	 private String recordStatus;
		
	 @Column(name="creat_by")
	 private String creatBy;
		
	 @CreationTimestamp
	 @Column(name="creat_date" , nullable = false , updatable = false)
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" )
	 private Timestamp creatDate;
		
	 @Column(name="update_by")
	 private String updateBy;
		
	 @UpdateTimestamp
	 @Column(name="update_date")
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" )
	 private Timestamp updateDate; 

}
