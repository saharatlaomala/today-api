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
@Table(name = "tb_sub_district")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubdistrictEntity {

		@Id
		@Column(name = "sdt_id")
		private Integer  sdtId;
		
		@Column(name = "zip_code")
		private String zipcode;
		
		@Column(name = "sdt_name_th")
		private String sdtnameth;
		
		@Column(name = "dis_id")
		private Integer disId;
		
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

