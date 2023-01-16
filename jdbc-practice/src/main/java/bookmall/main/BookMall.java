package bookmall.main;

import java.util.List;

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

		System.out.println("환영합니다. 메뉴를 선택해주세요.");
		System.out.println("(1) 회원리스트\n(2) 상품\n(3) 카테고리\n(4) 주문\n(5) 카트\n(6) 주문 도서 리스트\n ");

			System.out.println("## (1) 회원리스트");
			UsertestFindAll();

			System.out.println("## (2) 상품");
			BooktestFindAll();

			System.out.println("## (3) 카테고리");
			CategorytestFindAll();

			System.out.println("## (4) 주문");
			OrdertestFindAll();

			System.out.println("## (5) 카트");
			CarttestFindAll();
			
			System.out.println("## (6) 주문 도서 리스트");
			Order_booktestFindAll();
		}

	private static void UsertestFindAll() {
		List<UserVo> list = new UserDao().findAll();
		
		for (UserVo vo : list) {
			String info = String.format("[%d] 이름: %s, 전화번호: %s, 이메일: %s, 비밀번호: %s",vo.getNo(), vo.getName(), vo.getNum(), vo.getEmail(), vo.getPassword());
			System.out.println(info);
		}
	}

	private static void BooktestFindAll() {
		List<BookVo> list = new BookDao().findAll();

		for (BookVo vo : list) {
			String info = String.format("[%d] 도서 제목: %s, 가격: %s",vo.getNo(), vo.getTitle(), vo.getPrice());
			System.out.println(info);
		}
	}

	private static void CategorytestFindAll() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for (CategoryVo vo : list) {
			String info = String.format("[%d] 도서 제목: %s, 카테고리: %s, 책 번호: %s",vo.getNo(), vo.getTitle(), vo.getCate(), vo.getBook_no());
			System.out.println(info);
		}
	}
	
	private static void OrdertestFindAll() {
		List<OrderVo> list = new OrderDao().findAll();
		
		for (OrderVo vo : list) {
			String info = String.format("[1] 주문번호: %s, 주문자(이름/이메일): (%s/%s), 결제 금액: %s, 배송지: %s", vo.getNo(), vo.getName(), vo.getEmail(), vo.getPrice(), vo.getReceive());
			System.out.println(info);
		}
	}

	
	private static void CarttestFindAll() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			String info = String.format("[%d] 도서 제목: %s, 가격: %d, 책 수량: %s",vo.getNo(), vo.getTitle(), vo.getPrice(), vo.getBook_count());
			System.out.println(info);
		}
	}


	private static void Order_booktestFindAll() {
		List<Order_bookVo> list = new Order_bookDao().findAll();
		for (Order_bookVo vo : list) {
			String info = String.format("[%d] 도서 번호: %s, 도서 제목: %s, 책 수량: %s",vo.getNo(), vo.getBook_no(), vo.getTitle(), vo.getBook_count());
			System.out.println(info);
		}
	}


}
