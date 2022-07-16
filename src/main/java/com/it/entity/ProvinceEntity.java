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
@Table(name = "tb_province")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceEntity {
	@Id
	@Column(name = "pvn_id")
	private Integer  pvnId;
	
	@Column(name = "pvncode")
	private String pvncode;
	
	@Column(name = "pvn_name_th")
	private String pvnnameth;
	
	@Column(name = "pvn_name_eng")
	private String pvnnameeng;
	
	@Column(name = "area")
	private String area;
	
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


	

	

