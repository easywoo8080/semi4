package com.semi4.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
<<<<<<< HEAD

=======
>>>>>>> a5beba9e6d6aa1da6074245eaad3e164e3f34f4b
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
<<<<<<< HEAD
	
=======
	private String name;
	
	
	
	
	
	public ProductVO(int pid, String name, String title, String writer, String pub, int price, int status, Date date, int adult,
			String img0, String img1, String img2) {
		super();
		this.pid = pid;
		this.title = title;
		this.writer = writer;
		this.pub = pub;
		this.price = price;
		this.status = status;
		this.date = date;
		this.adult = adult;
		this.img0 = img0;
		this.img1 = img1;
		this.img2 = img2;
		this.name = name;
	}
	public ProductVO(int pid, int cid, String title, String writer, String pub, int price, int status, int adult,
			String img0, String img1, String img2) {
		super();
		this.pid = pid;
		this.cid = cid;
		this.title = title;
		this.writer = writer;
		this.pub = pub;
		this.price = price;
		this.status = status;
		this.adult = adult;
		this.img0 = img0;
		this.img1 = img1;
		this.img2 = img2;
	}
	public ProductVO(int cid, String title, String writer, String pub, int price, int status, Date date, int adult,
			String img0, String img1, String img2) {
		super();
		this.cid = cid;
		this.title = title;
		this.writer = writer;
		this.pub = pub;
		this.price = price;
		this.status = status;
		this.date = date;
		this.adult = adult;
		this.img0 = img0;
		this.img1 = img1;
		this.img2 = img2;
	}
	public ProductVO(int cid, String title, String writer, String pub, int price, int status, int adult, String img0,
			String img1, String img2) {
		super();
		this.cid = cid;
		this.title = title;
		this.writer = writer;
		this.pub = pub;
		this.price = price;
		this.status = status;
		this.adult = adult;
		this.img0 = img0;
		this.img1 = img1;
		this.img2 = img2;
	}
>>>>>>> a5beba9e6d6aa1da6074245eaad3e164e3f34f4b
	@Override
	public String toString() {
		return "ProductVO [pid=" + pid + ", cid=" + cid + ", title=" + title + ", writer=" + writer + ", pub=" + pub
				+ ", price=" + price + ", status=" + status + ", date=" + date + ", adult=" + adult + ", img0=" + img0
<<<<<<< HEAD
				+ ", img1=" + img1 + ", img2=" + img2 + "]";
	}

=======
				+ ", img1=" + img1 + ", img2=" + img2 + ", name=" + name + "]";
	}
	
	

	
>>>>>>> a5beba9e6d6aa1da6074245eaad3e164e3f34f4b
}
