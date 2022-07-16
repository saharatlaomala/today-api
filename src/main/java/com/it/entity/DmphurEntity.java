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
@Table(name = "tb_dmphur")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DmphurEntity {

	@Id
	@Column(name = "dis_id")
	private Integer  disId;
	
	@Column(name = "dis_Code")
	private String disCode;
	
	@Column(name = "dis_name_th")
	private String disnameth;
	
	@Column(name = "dis_name_eng")
	private String disnameeng;
	
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
	

