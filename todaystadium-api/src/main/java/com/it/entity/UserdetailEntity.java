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
@Table(name="tb_user_detail")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserdetailEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7943784056401185281L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "userdt_id")
	private Integer userdtId;
	
	@Column(name = "userdt_username")
	private String userdtUsername;
	
	@Column(name = "userdt_password")
	private String userdtPassword;
	
	@Column(name = "userdt_title")
	private String userdtTitle;
	
	@Column(name = "userdt_firstname")
	private String userdtFirstname;
	
	@Column(name = "userdt_lastname")
	private String userdtLastname;
	
	@Column(name = "userdt_gender")
	private String userdtGender;
	
	@Column(name = "userdt_addrass")
	private String userdtAddrass;
	
	@Column(name = "userdt_phone")
	private String userdtPhone;
	
	@Column(name = "userdt_email")
	private String userdtEmail;
	
	@Column(name = "userdt_status")
	private String userdtStatus;
	
	@Column(name = "zip_code")
	private String zipCode;
	
	@Column(name = "role_id")
	private String roleId;
	
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
