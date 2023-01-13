package bookmall.vo;

public class CategoryVo {
	private int book_no;
	private String cate;

	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}

	@Override
	public String toString() {
		return "CategoryVo [book_no=" + book_no + ", cate=" + cate + "]";
	}
	
}
