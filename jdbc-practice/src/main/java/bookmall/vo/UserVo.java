package bookmall.vo;

public class UserVo {
	private String name;
	private String num;
	private String email;
	private String password;
	private int no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "UserVo [no="+no+" ,name=" + name + ", num=" + num + ", email=" + email + ", password=" + password
				+ "]";
	}
	
}
