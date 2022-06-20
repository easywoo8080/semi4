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
public class ProductVO {
	private int pid;
	private int cid;
	private String title;
	private String writer;
	private String pub;
	private int price;
	private String img;
	private int status;
	private Date date;
}
