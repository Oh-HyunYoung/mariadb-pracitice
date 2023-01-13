package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();

	}

	private static void testInsert() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("인간관계론");
		vo.setPrice(10000);
		vo.setCategory_no(1);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("레버리지");
		vo.setPrice(20000);
		vo.setCategory_no(2);
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle("총균쇠");
		vo.setPrice(30000);
		vo.setCategory_no(3);
		dao.insert(vo);
			
	}
	
	private static void testFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

}
