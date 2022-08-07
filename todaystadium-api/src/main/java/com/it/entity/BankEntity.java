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
@Table(name="tb_bank")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankEntity implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = -7768590960747540894L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "bank_id")
	private Integer bankId;
	 
	 @Column(name = "bk_firstname")
	private String bkFirstname;
	 
	 @Column(name = "bk_lastname")
	private String bkLastname;
	 
	 @Column(name = "bk_account_name")
	private String bkAccountname;
	 
	 @Column(name = "bank_name")
	private String bankName;
	 
	 @Column(name = "bk_qrcode")
	private String bkQrcode; 
	 
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
