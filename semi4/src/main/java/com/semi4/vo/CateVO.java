package com.semi4.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CateVO {
	private int cid;
	private String name;
	private int cateid;
	
	public CateVO(int cid, String name) {
		this.cid = cid;
		this.name = name;
	}


	@Override
	public String toString() {
		return "CateVO [cid=" + cid + ", name=" + name + ", cateid=" + cateid + "]";
	}
	
	
	

	
	
}
