package bookmall.dao.test;

import java.util.List;

import bookmall.dao.UserDao;
import bookmall.vo.UserVo;

public class UserDaoTest {
	public static void main(String[] args) {
		//testInsert();
		testFindAll();
	}

	private static void testInsert() {
		UserVo vo = null;
		UserDao dao = new UserDao();
		
		vo = new UserVo();
		vo.setName("둘리");
		vo.setNum("010-1111-1111");
		vo.setEmail("dooly@gmail.com");
		vo.setPassword("dooly1234");

		dao.insert(vo);
		
		vo = new UserVo();
		vo.setName("또치");
		vo.setNum("010-2222-2222");
		vo.setEmail("ddochi@gmail.com");
		vo.setPassword("ddochi1234");
	
		dao.insert(vo);
			
	}
	
	private static void testFindAll() {
		List<UserVo> list = new UserDao().findAll();
		for (UserVo vo : list) {
			System.out.println(vo);
		}
	}
}
