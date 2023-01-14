package bookmall.dao.test;

import java.util.List;

import bookmall.dao.Order_bookDao;
import bookmall.vo.Order_bookVo;


public class Order_bookDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}

	private static void testInsert() {
		Order_bookVo vo = null;
		Order_bookDao dao = new Order_bookDao();

		vo = new Order_bookVo();
		vo.setTitle("인간관계론");
		vo.setBook_count(1);
		vo.setBook_no(1);
		vo.setOrders_no(1);

		dao.insert(vo);

		vo = new Order_bookVo();
		vo.setTitle("레버리지");
		vo.setBook_count(2);
		vo.setBook_no(2);
		vo.setOrders_no(1);
		
		dao.insert(vo);

	}

	private static void testFindAll() {
		List<Order_bookVo> list = new Order_bookDao().findAll();
		for (Order_bookVo vo : list) {
			System.out.println(vo);
		}
	}
}
