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
@Table(name = "tb_stadium")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StadiumEntity {
	@Id
	@Column(name = "stdm_id")
	private String  stdmId;
	
	@Column(name = "stdm_name")
	private String stdmname;
	
	@Column(name = "stdm_stime")
	private Integer stdmstime;
	
	@Column(name = "stdm_Etime")
	private Integer stdmEtime;
	
	@Column(name = "stdm_description")
	private String stdmdescription;
	
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
