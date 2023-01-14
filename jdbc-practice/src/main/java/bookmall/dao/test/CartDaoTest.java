package bookmall.dao.test;

import java.util.List;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();

	}

	private static void testInsert() {
		CartVo vo = null;
		CartDao dao = new CartDao();

		vo = new CartVo();
		vo.setTitle("인간관계론");
		vo.setBook_no(1);
		vo.setBook_count(1);
		vo.setUser_no(1);
		dao.insert(vo);

		vo = new CartVo();
		vo.setTitle("레버리지");
		vo.setBook_no(2);
		vo.setBook_count(2);
		vo.setUser_no(1);
		dao.insert(vo);

		vo = new CartVo();
		vo.setTitle("총균쇠");
		vo.setBook_no(3);
		vo.setBook_count(3);
		vo.setUser_no(1);
		dao.insert(vo);

	}

	private static void testFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}

}
