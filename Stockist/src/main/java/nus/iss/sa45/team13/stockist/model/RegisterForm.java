package nus.iss.sa45.team13.stockist.model;

public class RegisterForm {
	private String name;
	private String userName;
	private String password;
	private String confirmPassword;
	private boolean adminStatus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public boolean isAdminStatus() {
		return adminStatus;
	}
	public void setAdminStatus(boolean adminStatus) {
		this.adminStatus = adminStatus;
	}	
}
