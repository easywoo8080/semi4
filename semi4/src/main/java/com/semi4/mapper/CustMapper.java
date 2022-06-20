package com.semi4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@Repository
@Mapper
public interface CustMapper {

	public void insert(CartVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CartVO obj) throws Exception;
	public CustVO select(int obj) throws Exception;
	public List<CartVO> selectall() throws Exception;
}
