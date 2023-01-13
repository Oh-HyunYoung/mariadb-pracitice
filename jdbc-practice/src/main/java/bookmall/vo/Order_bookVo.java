package bookmall.vo;

public class Order_bookVo {
	private int no;
	private String title;
	private int book_count;
	private int book_no;
	private int orders_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBook_count() {
		return book_count;
	}
	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getOrders_no() {
		return orders_no;
	}
	public void setOrders_no(int orders_no) {
		this.orders_no = orders_no;
	}
	@Override
	public String toString() {
		return "Order_bookVo [no=" + no + ", title=" + title + ", book_count=" + book_count + ", book_no=" + book_no
				+ ", orders_no=" + orders_no + "]";
	}

}
