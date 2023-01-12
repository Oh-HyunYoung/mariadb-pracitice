package bookshop.vo;

public class BookVo {
	private Long no;
	private String title;
	private String rent;
	private Long AuthorNo;
	private String AuthorName;
	

	public long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}

	public Long getAuthorNo() {
		return AuthorNo;
	}
	public void setAuthorNo(Long authorNo) {
		AuthorNo = authorNo;
	}
	
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", rent=" + rent + ", AuthorNo=" + AuthorNo + ", AuthorName="
				+ AuthorName + "]";
	}
	
}
