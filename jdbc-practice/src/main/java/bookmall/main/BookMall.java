package bookmall.main;

import java.util.List;
import java.util.Scanner;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.OrderDao;
import bookmall.dao.Order_bookDao;
import bookmall.dao.UserDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.OrderVo;
import bookmall.vo.Order_bookVo;
import bookmall.vo.UserVo;

public class BookMall {

	public static void main(String[] args) {
		
		displayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		Long no = scanner.nextLong();
		scanner.close();
		
		BooktestFindAll();
		System.out.println("## 회원리스트");
		
		CarttestFindAll();
		System.out.println("## 상품");
		
		CategorytestFindAll();
		System.out.println("## 카테고리");
		
		OrdertestFindAll();
		System.out.println("## 주문");
		
		UsertestFindAll();
		System.out.println("## 카트");
	
		
		Order_booktestFindAll();
		System.out.println("## 주문 도서 리스트");

	
//		UserDao dao = new UserDao();
//		dao.insert();
//		dao.findAll();
//		dao.
		
	
		// 회원 두명 출력되게 함
		
		//+categorydao insert
	
		
		

	
		

		

		

	}
	private static void BooktestFindAll() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void CarttestFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void CategorytestFindAll() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for (CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void OrdertestFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void UsertestFindAll() {
		List<UserVo> list = new UserDao().findAll();
		for (UserVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void Order_booktestFindAll() {
		List<Order_bookVo> list = new Order_bookDao().findAll();
		for (Order_bookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void displayBookInfo() {
		List<BookVo> list = new BookDao().findAll();

		for(BookVo vo : list) {
			String info = String.format("[%d] 책 제목: %s, 가격: %s, 카테고리: %s", vo.getNo(), vo.getTitle(), vo.getPrice(), vo.getCategory_no());
			System.out.println(info);
		}
	}
}
