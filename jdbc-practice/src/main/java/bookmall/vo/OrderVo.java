package bookmall.vo;

public class OrderVo {
	private int no;
	private String receive;
	private int user_no;
	private int price;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getReceive() {
		return receive;
	}
	public void setReceive(String receive) {
		this.receive = receive;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", receive=" + receive + ", user_no=" + user_no + ", price=" + price + "]";
	}
	
	

}
