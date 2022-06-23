package com.semi4.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {
	private int oid;
	private String uid;
	private String oname;
	private String oaddr;
	private String ophon;
	private Date odate;
	private int ostatus;
	private int pid;
	private int dnum;
	private double dprice;
	
	
	public OrderVO(int oid, int pid, int dnum, double dprice) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.dnum = dnum;
		this.dprice = dprice;
	}


	public OrderVO(int oid, String uid, String oname, String oaddr, String ophon, Date odate, int ostatus) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.oname = oname;
		this.oaddr = oaddr;
		this.ophon = ophon;
		this.odate = odate;
		this.ostatus = ostatus;
	}
	
	
}
