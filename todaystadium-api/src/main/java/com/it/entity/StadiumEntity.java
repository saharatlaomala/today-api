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
@Table(name="tb_stadium")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StadiumEntity implements Serializable{
	
	private static final long serialVersionUID = 8394142562161987366L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "stdm_id")
	 private Integer stdmId;
	 
	 @Column(name = "stdm_name" )
	 private String stdmName;
	 
	 @Column(name = "stdm_stime")
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" )
	 private Timestamp stdmStime;
	 
	 @Column(name = "stdm_Etime")
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" )
	 private Timestamp stdmEtime;
	 
	 @Column(name = "stdm_description")
	 private String stdmDescription;
	 
	 
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
