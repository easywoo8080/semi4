package com.semi4.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class CustVO {
	private String uid;
	private String pwd;
	private String name;
	private String addr;
	private String phon;
	private String birth;

	
	public CustVO(String uid, String pwd, String name, String addr, String phon, String birth) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.addr = addr;
		this.phon = phon;
		this.birth = birth;
	}
	
	
}


