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
@Table(name = "tb_bookings")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingsEntity {
	@Id
	@Column(name = "bk_id")
	private Integer  bkId;
	
	@Column(name = "bk_date")
	private  Timestamp  bkdate; ///
	
	@Column(name = " bk_time")
	private Integer bktime;
	
	@Column(name = "bk_etime")
	private Integer bketime;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "stdm_id")
	private String stdmId;
	
	@Column(name = "bk_status")
	private String bkstatus;
	
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


