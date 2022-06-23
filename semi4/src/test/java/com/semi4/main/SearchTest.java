package com.semi4.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.biz.MainBiz;
import com.semi4.biz.ProductBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.ProductVO;

@SpringBootTest
class SearchTest {
	
	@Autowired
	CartBiz biz;
	@Test
	void contextLoads() {
		
	};

}
