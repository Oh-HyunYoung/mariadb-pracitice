package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;

public class OrderDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();
		
	}

	private static void testInsert() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();

		vo = new OrderVo();
		vo.setReceive("부산");
		vo.setUser_no(1);
		vo.setPrice(10000);
		
		dao.insert(vo);

		vo = new OrderVo();
		vo.setReceive("서울");
		vo.setUser_no(1);
		vo.setPrice(10000);
		
		dao.insert(vo);

	}

	private static void testFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}

}
