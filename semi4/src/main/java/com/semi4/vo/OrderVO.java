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
	private Date odate;
	private double oprice;
	private String oaddr;
	private String ophon;
	private int ostatus;
	private int pid;
	private int num;
	private double price;
}
