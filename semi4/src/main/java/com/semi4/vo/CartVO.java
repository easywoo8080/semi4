package com.semi4.vo;

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
public class CartVO {
	private String uid;
	private int pid;
	private int num;
	private String title;
	private String writer;
	private String pub;
	private int price;
	private String img;
	private int status;
}
