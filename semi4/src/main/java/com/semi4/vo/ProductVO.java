package com.semi4.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {
	private int pid;
	private int cid;
	private String title;
	private String writer;
	private String pub;
	private int price;
	private int status;
	private Date date;
	private int adult;
	private String img0;
	private String img1;
	private String img2;
	
	@Override
	public String toString() {
		return "ProductVO [pid=" + pid + ", cid=" + cid + ", title=" + title + ", writer=" + writer + ", pub=" + pub
				+ ", price=" + price + ", status=" + status + ", date=" + date + ", adult=" + adult + ", img0=" + img0
				+ ", img1=" + img1 + ", img2=" + img2 + "]";
	}

}
