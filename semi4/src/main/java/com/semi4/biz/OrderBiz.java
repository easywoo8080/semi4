package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.semi4.frame.Biz;
import com.semi4.mapper.ProductMapper;
import com.semi4.vo.ProductVO;

public class OrderBiz implements Biz<Integer, ProductVO> {

	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		return dao.selectall();
	}



}
