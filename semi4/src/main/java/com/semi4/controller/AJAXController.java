package com.semi4.controller;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

=======
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;
=======
import com.semi4.biz.CustBiz;
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
import com.semi4.vo.CustVO;

@RestController
public class AJAXController {
<<<<<<< HEAD

	@Autowired
	CartBiz cartbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {

		String result = "";
		CustVO c = null;

		return result;
	}
	
	@RequestMapping("mainAddCart")
	public String mainAddCart(String id, HttpSession session) {
		String result = "";
		System.out.println("id : " + id);
		
		
		if( session == null ) {
			System.out.println("세션이 널이니다.");
		} else {
//			CustVO cust;
//			
//			cust = (CustVO) session.getAttribute("logincust");
//			CartVO c = new CartVO(cust.getUid(), id, 1);
//			
//			try {
//				cartbiz.register(c);
//				
//				System.out.println("Registered OK");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}

=======
	
	@Autowired
	CustBiz custbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO c = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		
		try {
			c = custbiz.get(id);
			if(c == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
		return result;
	
<<<<<<< HEAD
	
	
	
}









=======
    }
}
>>>>>>> dd0eebce875b8fdf125607e02ee8ce5e0c6f8fef
