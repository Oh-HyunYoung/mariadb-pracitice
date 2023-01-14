package bookmall.vo;

public class CategoryVo {
	private int no;
	private String cate;
	private int book_no;
	private String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
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
		return "CategoryVo [no=" + no + ", title=" + title + ", cate=" + cate + ", book_no=" + book_no + "]";
	}
	
}
