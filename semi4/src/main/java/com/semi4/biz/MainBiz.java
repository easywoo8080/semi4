package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi4.frame.Biz;
<<<<<<< HEAD
import com.semi4.mapper.MainMapper;
=======
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
import com.semi4.mapper.ProductMapper;
import com.semi4.vo.ProductVO;

@Service
public class MainBiz implements Biz<Integer, ProductVO> {

	@Autowired
<<<<<<< HEAD
	MainMapper dao;
=======
	ProductMapper dao;
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
	
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
