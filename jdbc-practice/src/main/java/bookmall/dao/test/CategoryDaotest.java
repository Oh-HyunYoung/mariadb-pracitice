package bookmall.dao.test;


import java.util.List;

import bookmall.dao.CategoryDao;
import bookmall.vo.CategoryVo;

public class CategoryDaotest {
	public static void main(String[] args) {
		testInsert();
		testFindAll();
	}
	
	private static void testInsert() {
		CategoryVo vo = null;
		CategoryDao dao = new CategoryDao();
		
		vo = new CategoryVo();
		vo.setCate("자기계발");
		vo.setBook_no(1);
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setCate("금융");
		vo.setBook_no(2);
		dao.insert(vo);
		
		vo = new CategoryVo();
		vo.setCate("문학");
		vo.setBook_no(3);
		dao.insert(vo);
			
	}
	private static void testFindAll() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for (CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
}
